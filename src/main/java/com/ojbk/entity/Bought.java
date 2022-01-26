package com.ojbk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName(value = "bought")
public class Bought implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "userid")
    private Long userid;

    @TableField(value = "shopid")
    private Long shopid;

    @TableField(value = "`datetime`")
    private Long datetime;

    @TableField(value = "renew")
    private Long renew;

    @TableField(value = "coupon")
    private String coupon;

    @TableField(value = "price")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USERID = "userid";

    public static final String COL_SHOPID = "shopid";

    public static final String COL_DATETIME = "datetime";

    public static final String COL_RENEW = "renew";

    public static final String COL_COUPON = "coupon";

    public static final String COL_PRICE = "price";
}