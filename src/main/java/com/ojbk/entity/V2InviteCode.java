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
@TableName(value = "v2_invite_code")
public class V2InviteCode implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "user_id")
    private Integer userId;

    @TableField(value = "code")
    private String code;

    @TableField(value = "`status`")
    private Integer status;

    @TableField(value = "pv")
    private Integer pv;

    @TableField(value = "created_at")
    private Long createdAt;

    @TableField(value = "updated_at")
    private Long updatedAt;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_CODE = "code";

    public static final String COL_STATUS = "status";

    public static final String COL_PV = "pv";

    public static final String COL_CREATED_AT = "created_at";

    public static final String COL_UPDATED_AT = "updated_at";
}