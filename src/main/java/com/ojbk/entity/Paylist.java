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
@TableName(value = "paylist")
public class Paylist implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "userid")
    private Long userid;

    @TableField(value = "total")
    private BigDecimal total;

    @TableField(value = "`status`")
    private Integer status;

    @TableField(value = "tradeno")
    private String tradeno;

    @TableField(value = "`datetime`")
    private Long datetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USERID = "userid";

    public static final String COL_TOTAL = "total";

    public static final String COL_STATUS = "status";

    public static final String COL_TRADENO = "tradeno";

    public static final String COL_DATETIME = "datetime";
}