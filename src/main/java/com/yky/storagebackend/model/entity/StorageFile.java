package com.yky.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 物理文件信息表
 * @TableName storage_file
 */
@TableName(value ="storage_file")
@Data
public class StorageFile implements Serializable {
    /**
     * 文件id
     */
    @TableId
    private Long file_id;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 文件物理路径
     */
    private String real_path;

    /**
     * 文件实际大小
     */
    private String file_size;

    /**
     * 文件大小展示字符
     */
    private String file_size_desc;

    /**
     * 文件后缀
     */
    private String file_suffix;

    /**
     * 文件预览的响应头Content-Type的值
     */
    private String file_preview_content_type;

    /**
     * 文件唯一标识
     */
    private String identifier;

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