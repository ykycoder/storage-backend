package com.yky.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户文件信息表
 * @TableName storage_user_file
 */
@TableName(value ="storage_user_file")
@Data
public class StorageUserFile implements Serializable {
    /**
     * 文件记录ID
     */
    @TableId
    private Long file_id;

    /**
     * 用户ID
     */
    private Long user_id;

    /**
     * 上级文件夹ID,顶级文件夹为0
     */
    private Long parent_id;

    /**
     * 真实文件id
     */
    private Long real_file_id;

    /**
     * 文件名
     */
    private String filename;

    /**
     * 是否是文件夹 （0 否 1 是）
     */
    private Integer folder_flag;

    /**
     * 文件大小展示字符
     */
    private String file_size_desc;

    /**
     * 文件类型（1 普通文件 2 压缩文件 3 excel 4 word 5 pdf 6 txt 7 图片 8 音频 9 视频 10 ppt 11 源码文件 12 csv）
     */
    private Integer file_type;

    /**
     * 删除标识（0 否 1 是）
     */
    private Integer del_flag;

    /**
     * 创建人
     */
    private Long create_user;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新人
     */
    private Long update_user;

    /**
     * 更新时间
     */
    private Date update_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}