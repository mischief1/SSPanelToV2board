package com.ojbk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
    * 审计封禁日志
    */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "detect_ban_log")
public class DetectBanLog implements Serializable {
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
     * 本次违规次数
     */
    @TableField(value = "detect_number")
    private Integer detectNumber;

    /**
     * 本次封禁时长
     */
    @TableField(value = "ban_time")
    private Integer banTime;

    /**
     * 统计开始时间
     */
    @TableField(value = "start_time")
    private Long startTime;

    /**
     * 统计结束时间
     */
    @TableField(value = "end_time")
    private Long endTime;

    /**
     * 累计违规次数
     */
    @TableField(value = "all_detect_number")
    private Integer allDetectNumber;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_EMAIL = "email";

    public static final String COL_DETECT_NUMBER = "detect_number";

    public static final String COL_BAN_TIME = "ban_time";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_ALL_DETECT_NUMBER = "all_detect_number";
}