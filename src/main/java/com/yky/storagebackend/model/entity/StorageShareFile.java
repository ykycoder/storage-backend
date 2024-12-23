package com.yky.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户分享文件表
 * @TableName storage_share_file
 */
@TableName(value ="storage_share_file")
@Data
public class StorageShareFile implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 分享id
     */
    private Long share_id;

    /**
     * 文件记录ID
     */
    private Long file_id;

    /**
     * 分享创建人
     */
    private Long create_user;

    /**
     * 创建时间
     */
    private Date create_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}