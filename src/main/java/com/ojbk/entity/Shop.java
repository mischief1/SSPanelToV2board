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
@TableName(value = "shop")
public class Shop implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "price")
    private BigDecimal price;

    @TableField(value = "content")
    private String content;

    @TableField(value = "auto_renew")
    private Integer autoRenew;

    @TableField(value = "auto_reset_bandwidth")
    private Integer autoResetBandwidth;

    @TableField(value = "`status`")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PRICE = "price";

    public static final String COL_CONTENT = "content";

    public static final String COL_AUTO_RENEW = "auto_renew";

    public static final String COL_AUTO_RESET_BANDWIDTH = "auto_reset_bandwidth";

    public static final String COL_STATUS = "status";
}