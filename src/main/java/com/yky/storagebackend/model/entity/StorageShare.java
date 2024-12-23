package com.yky.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户分享表
 * @TableName storage_share
 */
@TableName(value ="storage_share")
@Data
public class StorageShare implements Serializable {
    /**
     * 分享id
     */
    @TableId
    private Long share_id;

    /**
     * 分享名称
     */
    private String share_name;

    /**
     * 分享类型（0 有提取码）
     */
    private Integer share_type;

    /**
     * 分享类型（0 永久有效；1 7天有效；2 30天有效）
     */
    private Integer share_day_type;

    /**
     * 分享有效天数（永久有效为0）
     */
    private Integer share_day;

    /**
     * 分享结束时间
     */
    private Date share_end_time;

    /**
     * 分享链接地址
     */
    private String share_url;

    /**
     * 分享提取码
     */
    private String share_code;

    /**
     * 分享状态（0 正常；1 有文件被删除）
     */
    private Integer share_status;

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