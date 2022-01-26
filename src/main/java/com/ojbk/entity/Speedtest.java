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
@TableName(value = "speedtest")
public class Speedtest implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "nodeid")
    private Integer nodeid;

    @TableField(value = "`datetime`")
    private Long datetime;

    @TableField(value = "telecomping")
    private String telecomping;

    @TableField(value = "telecomeupload")
    private String telecomeupload;

    @TableField(value = "telecomedownload")
    private String telecomedownload;

    @TableField(value = "unicomping")
    private String unicomping;

    @TableField(value = "unicomupload")
    private String unicomupload;

    @TableField(value = "unicomdownload")
    private String unicomdownload;

    @TableField(value = "cmccping")
    private String cmccping;

    @TableField(value = "cmccupload")
    private String cmccupload;

    @TableField(value = "cmccdownload")
    private String cmccdownload;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NODEID = "nodeid";

    public static final String COL_DATETIME = "datetime";

    public static final String COL_TELECOMPING = "telecomping";

    public static final String COL_TELECOMEUPLOAD = "telecomeupload";

    public static final String COL_TELECOMEDOWNLOAD = "telecomedownload";

    public static final String COL_UNICOMPING = "unicomping";

    public static final String COL_UNICOMUPLOAD = "unicomupload";

    public static final String COL_UNICOMDOWNLOAD = "unicomdownload";

    public static final String COL_CMCCPING = "cmccping";

    public static final String COL_CMCCUPLOAD = "cmccupload";

    public static final String COL_CMCCDOWNLOAD = "cmccdownload";
}