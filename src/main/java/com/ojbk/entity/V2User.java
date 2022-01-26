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

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "v2_user")
public class V2User implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "invite_user_id")
    private Integer inviteUserId;

    @TableField(value = "telegram_id")
    private Long telegramId;

    @TableField(value = "email")
    private String email;

    @TableField(value = "`password`")
    private String password;

    @TableField(value = "password_algo")
    private String passwordAlgo;

    @TableField(value = "password_salt")
    private String passwordSalt;

    @TableField(value = "balance")
    private Integer balance;

    @TableField(value = "discount")
    private Integer discount;

    /**
     * 0: system 1: cycle 2: onetime
     */
    @TableField(value = "commission_type")
    private Integer commissionType;

    @TableField(value = "commission_rate")
    private Integer commissionRate;

    @TableField(value = "commission_balance")
    private Integer commissionBalance;

    @TableField(value = "t")
    private Integer t;

    @TableField(value = "u")
    private Long u;

    @TableField(value = "d")
    private Long d;

    @TableField(value = "transfer_enable")
    private Long transferEnable;

    @TableField(value = "banned")
    private Integer banned;

    @TableField(value = "is_admin")
    private Integer isAdmin;

    @TableField(value = "is_staff")
    private Integer isStaff;

    @TableField(value = "last_login_at")
    private Integer lastLoginAt;

    @TableField(value = "last_login_ip")
    private Integer lastLoginIp;

    @TableField(value = "uuid")
    private String uuid;

    @TableField(value = "group_id")
    private Integer groupId;

    @TableField(value = "plan_id")
    private Integer planId;

    @TableField(value = "remind_expire")
    private Integer remindExpire;

    @TableField(value = "remind_traffic")
    private Integer remindTraffic;

    @TableField(value = "token")
    private String token;

    @TableField(value = "remarks")
    private String remarks;

    @TableField(value = "expired_at")
    private Long expiredAt;

    @TableField(value = "created_at")
    private Long createdAt;

    @TableField(value = "updated_at")
    private Long updatedAt;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_INVITE_USER_ID = "invite_user_id";

    public static final String COL_TELEGRAM_ID = "telegram_id";

    public static final String COL_EMAIL = "email";

    public static final String COL_PASSWORD = "password";

    public static final String COL_PASSWORD_ALGO = "password_algo";

    public static final String COL_PASSWORD_SALT = "password_salt";

    public static final String COL_BALANCE = "balance";

    public static final String COL_DISCOUNT = "discount";

    public static final String COL_COMMISSION_TYPE = "commission_type";

    public static final String COL_COMMISSION_RATE = "commission_rate";

    public static final String COL_COMMISSION_BALANCE = "commission_balance";

    public static final String COL_T = "t";

    public static final String COL_U = "u";

    public static final String COL_D = "d";

    public static final String COL_TRANSFER_ENABLE = "transfer_enable";

    public static final String COL_BANNED = "banned";

    public static final String COL_IS_ADMIN = "is_admin";

    public static final String COL_IS_STAFF = "is_staff";

    public static final String COL_LAST_LOGIN_AT = "last_login_at";

    public static final String COL_LAST_LOGIN_IP = "last_login_ip";

    public static final String COL_UUID = "uuid";

    public static final String COL_GROUP_ID = "group_id";

    public static final String COL_PLAN_ID = "plan_id";

    public static final String COL_REMIND_EXPIRE = "remind_expire";

    public static final String COL_REMIND_TRAFFIC = "remind_traffic";

    public static final String COL_TOKEN = "token";

    public static final String COL_REMARKS = "remarks";

    public static final String COL_EXPIRED_AT = "expired_at";

    public static final String COL_CREATED_AT = "created_at";

    public static final String COL_UPDATED_AT = "updated_at";
}