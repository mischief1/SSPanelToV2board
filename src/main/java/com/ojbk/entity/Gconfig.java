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

/**
    * 网站配置
    */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "gconfig")
public class Gconfig implements Serializable {
    /**
     * 配置名
     */
    @TableId(value = "key", type = IdType.INPUT)
    private String key;

    /**
     * 配置值
     */
    @TableField(value = "`value`")
    private String value;

    /**
     * 之前的配置值
     */
    @TableField(value = "oldvalue")
    private String oldvalue;

    /**
     * 配置名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 配置描述
     */
    @TableField(value = "`comment`")
    private String comment;

    /**
     * 操作员 ID
     */
    @TableField(value = "operator_id")
    private Integer operatorId;

    /**
     * 操作员名称
     */
    @TableField(value = "operator_name")
    private String operatorName;

    /**
     * 操作员邮箱
     */
    @TableField(value = "operator_email")
    private String operatorEmail;

    /**
     * 修改时间
     */
    @TableField(value = "last_update")
    private Long lastUpdate;

    private static final long serialVersionUID = 1L;

    public static final String COL_KEY = "key";

    public static final String COL_VALUE = "value";

    public static final String COL_OLDVALUE = "oldvalue";

    public static final String COL_NAME = "name";

    public static final String COL_COMMENT = "comment";

    public static final String COL_OPERATOR_ID = "operator_id";

    public static final String COL_OPERATOR_NAME = "operator_name";

    public static final String COL_OPERATOR_EMAIL = "operator_email";

    public static final String COL_LAST_UPDATE = "last_update";
}