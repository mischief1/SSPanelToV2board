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
@TableName(value = "payback")
public class Payback implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "total")
    private BigDecimal total;

    @TableField(value = "userid")
    private Long userid;

    @TableField(value = "ref_by")
    private Long refBy;

    @TableField(value = "ref_traffic")
    private BigDecimal refTraffic;

    @TableField(value = "ref_get")
    private BigDecimal refGet;

    @TableField(value = "`datetime`")
    private Long datetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TOTAL = "total";

    public static final String COL_USERID = "userid";

    public static final String COL_REF_BY = "ref_by";

    public static final String COL_REF_TRAFFIC = "ref_traffic";

    public static final String COL_REF_GET = "ref_get";

    public static final String COL_DATETIME = "datetime";
}