package utils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileLoadUtils {

    public static String loadFile(String filePath) throws Exception {
        //读取json文件
        String jsonStr = "";
        try {
            File jsonFile = new File(filePath);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            throw new Exception("load json file error", e);
        }
    }

    public static void object2JsonFile(String finalPath, String jsonStr) throws Exception {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(finalPath), StandardCharsets.UTF_8);
            osw.write(jsonStr);
            osw.flush();
            osw.close();
        } catch (IOException e) {
            throw new Exception("write json file error", e);
        }
    }
}
