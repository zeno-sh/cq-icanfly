package com.zeno.cqicanfly;

import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
public class MainTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        String lua = "/opt/homebrew/bin/lua5.1";
        String jsonfile = "/Users/zhulinfeng/Documents/lua-config/DropGroupConfig.lua.json";
        String luafile = "/Users/zhulinfeng/Documents/GitSpace/jsontolua/lua/jsontolua_caller.lua";

        final Process process = Runtime.getRuntime().exec(
                new String[]{lua, luafile, jsonfile}
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
        System.out.println(sb.toString());
    }
}
