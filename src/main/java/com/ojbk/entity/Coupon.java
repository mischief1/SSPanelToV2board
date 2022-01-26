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
@TableName(value = "coupon")
public class Coupon implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "onetime")
    private Integer onetime;

    @TableField(value = "expire")
    private Long expire;

    @TableField(value = "shop")
    private String shop;

    @TableField(value = "credit")
    private Integer credit;

    @TableField(value = "`status`")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_ONETIME = "onetime";

    public static final String COL_EXPIRE = "expire";

    public static final String COL_SHOP = "shop";

    public static final String COL_CREDIT = "credit";

    public static final String COL_STATUS = "status";
}