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
@TableName(value = "v2_order")
public class V2Order implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "invite_user_id")
    private Integer inviteUserId;

    @TableField(value = "user_id")
    private Integer userId;

    @TableField(value = "plan_id")
    private Integer planId;

    @TableField(value = "coupon_id")
    private Integer couponId;

    @TableField(value = "payment_id")
    private Integer paymentId;

    /**
     * 1新购2续费3升级
     */
    @TableField(value = "`type`")
    private Integer type;

    @TableField(value = "`cycle`")
    private String cycle;

    @TableField(value = "trade_no")
    private String tradeNo;

    @TableField(value = "callback_no")
    private String callbackNo;

    @TableField(value = "total_amount")
    private Integer totalAmount;

    @TableField(value = "discount_amount")
    private Integer discountAmount;

    /**
     * 剩余价值
     */
    @TableField(value = "surplus_amount")
    private Integer surplusAmount;

    /**
     * 退款金额
     */
    @TableField(value = "refund_amount")
    private Integer refundAmount;

    /**
     * 使用余额
     */
    @TableField(value = "balance_amount")
    private Integer balanceAmount;

    /**
     * 折抵订单
     */
    @TableField(value = "surplus_order_ids")
    private String surplusOrderIds;

    /**
     * 0待支付1开通中2已取消3已完成4已折抵
     */
    @TableField(value = "`status`")
    private Integer status;

    /**
     * 0待确认1发放中2有效3无效
     */
    @TableField(value = "commission_status")
    private Integer commissionStatus;

    @TableField(value = "commission_balance")
    private Integer commissionBalance;

    @TableField(value = "paid_at")
    private Long paidAt;

    @TableField(value = "created_at")
    private Long createdAt;

    @TableField(value = "updated_at")
    private Long updatedAt;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_INVITE_USER_ID = "invite_user_id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_PLAN_ID = "plan_id";

    public static final String COL_COUPON_ID = "coupon_id";

    public static final String COL_PAYMENT_ID = "payment_id";

    public static final String COL_TYPE = "type";

    public static final String COL_CYCLE = "cycle";

    public static final String COL_TRADE_NO = "trade_no";

    public static final String COL_CALLBACK_NO = "callback_no";

    public static final String COL_TOTAL_AMOUNT = "total_amount";

    public static final String COL_DISCOUNT_AMOUNT = "discount_amount";

    public static final String COL_SURPLUS_AMOUNT = "surplus_amount";

    public static final String COL_REFUND_AMOUNT = "refund_amount";

    public static final String COL_BALANCE_AMOUNT = "balance_amount";

    public static final String COL_SURPLUS_ORDER_IDS = "surplus_order_ids";

    public static final String COL_STATUS = "status";

    public static final String COL_COMMISSION_STATUS = "commission_status";

    public static final String COL_COMMISSION_BALANCE = "commission_balance";

    public static final String COL_PAID_AT = "paid_at";

    public static final String COL_CREATED_AT = "created_at";

    public static final String COL_UPDATED_AT = "updated_at";
}