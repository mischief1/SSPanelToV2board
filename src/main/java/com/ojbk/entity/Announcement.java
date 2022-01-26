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
@TableName(value = "announcement")
public class Announcement implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "`date`")
    private Date date;

    @TableField(value = "content")
    private String content;

    @TableField(value = "markdown")
    private String markdown;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_DATE = "date";

    public static final String COL_CONTENT = "content";

    public static final String COL_MARKDOWN = "markdown";
}