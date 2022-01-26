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
@TableName(value = "email_verify")
public class EmailVerify implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "email")
    private String email;

    @TableField(value = "ip")
    private String ip;

    @TableField(value = "code")
    private String code;

    @TableField(value = "expire_in")
    private Long expireIn;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_EMAIL = "email";

    public static final String COL_IP = "ip";

    public static final String COL_CODE = "code";

    public static final String COL_EXPIRE_IN = "expire_in";
}