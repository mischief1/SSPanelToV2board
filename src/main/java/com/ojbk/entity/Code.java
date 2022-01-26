package com.ojbk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@TableName(value = "code")
public class Code implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "`type`")
    private Integer type;

    @TableField(value = "`number`")
    private BigDecimal number;

    @TableField(value = "isused")
    private Integer isused;

    @TableField(value = "userid")
    private Long userid;

    @TableField(value = "usedatetime")
    private Date usedatetime;

    @TableField(value = "tradeno")
    private String tradeno;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_TYPE = "type";

    public static final String COL_NUMBER = "number";

    public static final String COL_ISUSED = "isused";

    public static final String COL_USERID = "userid";

    public static final String COL_USEDATETIME = "usedatetime";

    public static final String COL_TRADENO = "tradeno";
}