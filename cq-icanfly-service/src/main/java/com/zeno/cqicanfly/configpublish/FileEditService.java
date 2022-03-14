package com.zeno.cqicanfly.configpublish;

import com.zeno.cqicanfly.dto.luaconfig.FileEditDTO;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public interface FileEditService {

    /**
     * 新增/编辑
     *
     * @param fileId
     * @param fileConfig
     * @param fileJson
     * @return
     */
    Boolean modifyFileConfig(Integer fileId, String fileConfig, String fileJson);

    /**
     * 修改状态
     *
     * @param editId
     * @param status
     * @return
     */
    Boolean modifyFileEditStatus(Integer editId, Integer status);

    /**
     * 根据文件Id查询
     *
     * @param fileId
     * @return 最新版本的信息
     */
    FileEditDTO queryPublishByFileId(Integer fileId);
}
