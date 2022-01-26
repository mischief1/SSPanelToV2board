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
@TableName(value = "ss_password_reset")
public class SsPasswordReset implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "email")
    private String email;

    @TableField(value = "token")
    private String token;

    @TableField(value = "init_time")
    private Integer initTime;

    @TableField(value = "expire_time")
    private Integer expireTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_EMAIL = "email";

    public static final String COL_TOKEN = "token";

    public static final String COL_INIT_TIME = "init_time";

    public static final String COL_EXPIRE_TIME = "expire_time";
}