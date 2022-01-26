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
@TableName(value = "config")
public class Config implements Serializable {
    @TableId(value = "name", type = IdType.INPUT)
    private String name;

    @TableField(value = "`value`")
    private String value;

    private static final long serialVersionUID = 1L;

    public static final String COL_NAME = "name";

    public static final String COL_VALUE = "value";
}