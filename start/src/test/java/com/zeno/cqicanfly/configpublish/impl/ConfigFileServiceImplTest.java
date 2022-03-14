package com.zeno.cqicanfly.configpublish.impl;

import com.zeno.cqicanfly.configpublish.ConfigFileService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
class ConfigFileServiceImplTest extends BaseTest {

    @Autowired
    private ConfigFileService configFileService;

    @Test
    void saveConfigFile() {
        String fileName = "StdItems.config";
        String filePath = "/config/item/";
        String fileHeader = "StdItems=";
        Integer toPhp = 1;

        Boolean result = configFileService.saveConfigFile(fileName, filePath, fileHeader, toPhp);
        System.out.println(result);
    }

    @Test
    void queryByFileId() {
    }

    @Test
    void queryByFileName() {
    }
}