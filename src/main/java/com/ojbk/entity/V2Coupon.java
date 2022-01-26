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
@TableName(value = "v2_coupon")
public class V2Coupon implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "`type`")
    private Integer type;

    @TableField(value = "`value`")
    private Integer value;

    @TableField(value = "limit_use")
    private Integer limitUse;

    @TableField(value = "limit_use_with_user")
    private Integer limitUseWithUser;

    @TableField(value = "limit_plan_ids")
    private String limitPlanIds;

    @TableField(value = "started_at")
    private Integer startedAt;

    @TableField(value = "ended_at")
    private Integer endedAt;

    @TableField(value = "created_at")
    private Integer createdAt;

    @TableField(value = "updated_at")
    private Integer updatedAt;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_NAME = "name";

    public static final String COL_TYPE = "type";

    public static final String COL_VALUE = "value";

    public static final String COL_LIMIT_USE = "limit_use";

    public static final String COL_LIMIT_USE_WITH_USER = "limit_use_with_user";

    public static final String COL_LIMIT_PLAN_IDS = "limit_plan_ids";

    public static final String COL_STARTED_AT = "started_at";

    public static final String COL_ENDED_AT = "ended_at";

    public static final String COL_CREATED_AT = "created_at";

    public static final String COL_UPDATED_AT = "updated_at";
}