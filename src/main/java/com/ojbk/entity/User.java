package com.ojbk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@TableName(value = "`user`")
public class User implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "email")
    private String email;

    @TableField(value = "phone")
    private Long phone;

    @TableField(value = "pass")
    private String pass;

    @TableField(value = "passwd")
    private String passwd;

    @TableField(value = "t")
    private Integer t;

    @TableField(value = "u")
    private Long u;

    @TableField(value = "d")
    private Long d;

    @TableField(value = "`plan`")
    private String plan;

    @TableField(value = "transfer_enable")
    private Long transferEnable;

    @TableField(value = "port")
    private Integer port;

    @TableField(value = "switch")
    private Byte switch2;

    @TableField(value = "`enable`")
    private Byte enable;

    @TableField(value = "last_detect_ban_time")
    private Date lastDetectBanTime;

    @TableField(value = "all_detect_number")
    private Integer allDetectNumber;

    @TableField(value = "`type`")
    private Byte type;

    @TableField(value = "last_get_gift_time")
    private Integer lastGetGiftTime;

    @TableField(value = "last_check_in_time")
    private Integer lastCheckInTime;

    @TableField(value = "last_rest_pass_time")
    private Integer lastRestPassTime;

    @TableField(value = "reg_date")
    private Date regDate;

    @TableField(value = "invite_num")
    private Integer inviteNum;

    @TableField(value = "money")
    private BigDecimal money;

    @TableField(value = "ref_by")
    private Integer refBy;

    @TableField(value = "expire_time")
    private Integer expireTime;

    @TableField(value = "`method`")
    private String method;

    @TableField(value = "is_email_verify")
    private Byte isEmailVerify;

    @TableField(value = "reg_ip")
    private String regIp;

    @TableField(value = "node_speedlimit")
    private BigDecimal nodeSpeedlimit;

    @TableField(value = "node_connector")
    private Integer nodeConnector;

    @TableField(value = "is_admin")
    private Integer isAdmin;

    @TableField(value = "im_type")
    private Integer imType;

    @TableField(value = "im_value")
    private String imValue;

    @TableField(value = "last_day_t")
    private Long lastDayT;

    @TableField(value = "sendDailyMail")
    private Integer senddailymail;

    @TableField(value = "`class`")
    private Integer class2;

    @TableField(value = "class_expire")
    private Date classExpire;

    @TableField(value = "expire_in")
    private Date expireIn;

    @TableField(value = "theme")
    private String theme;

    @TableField(value = "ga_token")
    private String gaToken;

    @TableField(value = "ga_enable")
    private Integer gaEnable;

    @TableField(value = "pac")
    private String pac;

    @TableField(value = "remark")
    private String remark;

    @TableField(value = "node_group")
    private Integer nodeGroup;

    @TableField(value = "auto_reset_day")
    private Integer autoResetDay;

    @TableField(value = "auto_reset_bandwidth")
    private BigDecimal autoResetBandwidth;

    @TableField(value = "protocol")
    private String protocol;

    @TableField(value = "protocol_param")
    private String protocolParam;

    @TableField(value = "obfs")
    private String obfs;

    @TableField(value = "obfs_param")
    private String obfsParam;

    @TableField(value = "forbidden_ip")
    private String forbiddenIp;

    @TableField(value = "forbidden_port")
    private String forbiddenPort;

    @TableField(value = "disconnect_ip")
    private String disconnectIp;

    @TableField(value = "is_hide")
    private Integer isHide;

    @TableField(value = "is_multi_user")
    private Integer isMultiUser;

    @TableField(value = "telegram_id")
    private Long telegramId;

    @TableField(value = "uuid")
    private String uuid;

    /**
     * 用户的语言
     */
    @TableField(value = "lang")
    private String lang;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_EMAIL = "email";

    public static final String COL_PHONE = "phone";

    public static final String COL_PASS = "pass";

    public static final String COL_PASSWD = "passwd";

    public static final String COL_T = "t";

    public static final String COL_U = "u";

    public static final String COL_D = "d";

    public static final String COL_PLAN = "plan";

    public static final String COL_TRANSFER_ENABLE = "transfer_enable";

    public static final String COL_PORT = "port";

    public static final String COL_SWITCH = "switch";

    public static final String COL_ENABLE = "enable";

    public static final String COL_LAST_DETECT_BAN_TIME = "last_detect_ban_time";

    public static final String COL_ALL_DETECT_NUMBER = "all_detect_number";

    public static final String COL_TYPE = "type";

    public static final String COL_LAST_GET_GIFT_TIME = "last_get_gift_time";

    public static final String COL_LAST_CHECK_IN_TIME = "last_check_in_time";

    public static final String COL_LAST_REST_PASS_TIME = "last_rest_pass_time";

    public static final String COL_REG_DATE = "reg_date";

    public static final String COL_INVITE_NUM = "invite_num";

    public static final String COL_MONEY = "money";

    public static final String COL_REF_BY = "ref_by";

    public static final String COL_EXPIRE_TIME = "expire_time";

    public static final String COL_METHOD = "method";

    public static final String COL_IS_EMAIL_VERIFY = "is_email_verify";

    public static final String COL_REG_IP = "reg_ip";

    public static final String COL_NODE_SPEEDLIMIT = "node_speedlimit";

    public static final String COL_NODE_CONNECTOR = "node_connector";

    public static final String COL_IS_ADMIN = "is_admin";

    public static final String COL_IM_TYPE = "im_type";

    public static final String COL_IM_VALUE = "im_value";

    public static final String COL_LAST_DAY_T = "last_day_t";

    public static final String COL_SENDDAILYMAIL = "sendDailyMail";

    public static final String COL_CLASS = "class";

    public static final String COL_CLASS_EXPIRE = "class_expire";

    public static final String COL_EXPIRE_IN = "expire_in";

    public static final String COL_THEME = "theme";

    public static final String COL_GA_TOKEN = "ga_token";

    public static final String COL_GA_ENABLE = "ga_enable";

    public static final String COL_PAC = "pac";

    public static final String COL_REMARK = "remark";

    public static final String COL_NODE_GROUP = "node_group";

    public static final String COL_AUTO_RESET_DAY = "auto_reset_day";

    public static final String COL_AUTO_RESET_BANDWIDTH = "auto_reset_bandwidth";

    public static final String COL_PROTOCOL = "protocol";

    public static final String COL_PROTOCOL_PARAM = "protocol_param";

    public static final String COL_OBFS = "obfs";

    public static final String COL_OBFS_PARAM = "obfs_param";

    public static final String COL_FORBIDDEN_IP = "forbidden_ip";

    public static final String COL_FORBIDDEN_PORT = "forbidden_port";

    public static final String COL_DISCONNECT_IP = "disconnect_ip";

    public static final String COL_IS_HIDE = "is_hide";

    public static final String COL_IS_MULTI_USER = "is_multi_user";

    public static final String COL_TELEGRAM_ID = "telegram_id";

    public static final String COL_UUID = "uuid";

    public static final String COL_LANG = "lang";
}