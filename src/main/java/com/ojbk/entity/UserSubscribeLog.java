package com.ojbk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
    * 用户订阅日志
    */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_subscribe_log")
public class UserSubscribeLog implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 用户 ID
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 用户邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 获取的订阅类型
     */
    @TableField(value = "subscribe_type")
    private String subscribeType;

    /**
     * 请求 IP
     */
    @TableField(value = "request_ip")
    private String requestIp;

    /**
     * 请求时间
     */
    @TableField(value = "request_time")
    private Date requestTime;

    /**
     * 请求 UA 信息
     */
    @TableField(value = "request_user_agent")
    private String requestUserAgent;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_EMAIL = "email";

    public static final String COL_SUBSCRIBE_TYPE = "subscribe_type";

    public static final String COL_REQUEST_IP = "request_ip";

    public static final String COL_REQUEST_TIME = "request_time";

    public static final String COL_REQUEST_USER_AGENT = "request_user_agent";
}