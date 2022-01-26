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
@TableName(value = "link")
public class Link implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "`type`")
    private Integer type;

    @TableField(value = "address")
    private String address;

    @TableField(value = "port")
    private Integer port;

    @TableField(value = "token")
    private String token;

    @TableField(value = "ios")
    private Integer ios;

    @TableField(value = "userid")
    private Long userid;

    @TableField(value = "isp")
    private String isp;

    @TableField(value = "geo")
    private Integer geo;

    @TableField(value = "`method`")
    private String method;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TYPE = "type";

    public static final String COL_ADDRESS = "address";

    public static final String COL_PORT = "port";

    public static final String COL_TOKEN = "token";

    public static final String COL_IOS = "ios";

    public static final String COL_USERID = "userid";

    public static final String COL_ISP = "isp";

    public static final String COL_GEO = "geo";

    public static final String COL_METHOD = "method";
}