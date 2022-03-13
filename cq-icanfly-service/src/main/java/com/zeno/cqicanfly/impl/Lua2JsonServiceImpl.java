package com.zeno.cqicanfly.impl;

import com.zeno.cqicanfly.Lua2JsonService;
import com.zeno.cqicanfly.exception.Lua2JsonException;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
@Service
public class Lua2JsonServiceImpl implements Lua2JsonService {

    @Value(value = "${lua.env.path}")
    private String luaEnv;
    @Value(value = "${lua.env.lua2json.script}")
    private String luaScript;

    @Override
    public String jsonStringByLua(String luaFilePath) throws Lua2JsonException, IOException, InterruptedException {

        System.out.println("lua path=" + luaEnv);
        final Process process = Runtime.getRuntime().exec(
                new String[]{luaEnv, luaScript, luaFilePath}
        );
        final StringBuilder sb = new StringBuilder();
        InputStreamReader stdISR = null;
        try {
            String line = null;
            stdISR = new InputStreamReader(process.getInputStream());
            BufferedReader stdBR = new BufferedReader(stdISR);
            while ((line = stdBR.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(stdISR);
        }

        //error output
        InputStreamReader errISR = null;
        try {
            String line = null;
            errISR = new InputStreamReader(process.getErrorStream());
            BufferedReader errBR = new BufferedReader(errISR);
            while ((line = errBR.readLine()) != null) {
                System.out.println("ERR line:" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(errISR);
        }

        process.waitFor(30, TimeUnit.MINUTES);
        process.destroy();
        return sb.toString();
    }
}