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
@TableName(value = "alive_ip")
public class AliveIp implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "nodeid")
    private Integer nodeid;

    @TableField(value = "userid")
    private Integer userid;

    @TableField(value = "ip")
    private String ip;

    @TableField(value = "`datetime`")
    private Long datetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NODEID = "nodeid";

    public static final String COL_USERID = "userid";

    public static final String COL_IP = "ip";

    public static final String COL_DATETIME = "datetime";
}