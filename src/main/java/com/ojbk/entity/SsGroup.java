package com.ojbk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName(value = "ss_group")
public class SsGroup implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 分组级别
     */
    @TableField(value = "`level`")
    private Integer level;

    /**
     * 分组名称
     */
    @TableField(value = "`name`")
    private String name;

    @TableField(value = "`date`")
    private Date date;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_LEVEL = "level";

    public static final String COL_NAME = "name";

    public static final String COL_DATE = "date";
}