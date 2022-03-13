package com.zeno.cqicanfly.impl;

import com.zeno.cqicanfly.Json2LuaService;
import com.zeno.cqicanfly.exception.Json2LuaException;
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
public class Json2LuaServiceImpl implements Json2LuaService {
    @Value(value = "${lua.env.path}")
    private String luaEnv;
    @Value(value = "${lua.env.json2lua.script}")
    private String luaScript;

    @Override
    public String luaStringByJson(String jsonFilePath) throws Json2LuaException, IOException, InterruptedException {

        System.out.println("lua path=" + luaEnv);
        final Process process = Runtime.getRuntime().exec(
                new String[]{luaEnv, luaScript, jsonFilePath}
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
