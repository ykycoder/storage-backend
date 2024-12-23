package com.yky.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文件分片信息表
 * @TableName storage_file_chunk
 */
@TableName(value ="storage_file_chunk")
@Data
public class StorageFileChunk implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 文件唯一标识
     */
    private String identifier;

    /**
     * 分片真实的存储路径
     */
    private String real_path;

    /**
     * 分片编号
     */
    private Integer chunk_number;

    /**
     * 过期时间
     */
    private Date expiration_time;

    /**
     * 创建人
     */
    private Long create_user;

    /**
     * 创建时间
     */
    private Date create_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}