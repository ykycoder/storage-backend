package com.yky.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 错误日志表
 * @TableName storage_error_log
 */
@TableName(value ="storage_error_log")
@Data
public class StorageErrorLog implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 日志内容
     */
    private String log_content;

    /**
     * 日志状态：0 未处理 1 已处理
     */
    private Integer log_status;

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