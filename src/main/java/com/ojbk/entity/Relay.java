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
@TableName(value = "relay")
public class Relay implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "source_node_id")
    private Long sourceNodeId;

    @TableField(value = "dist_node_id")
    private Long distNodeId;

    @TableField(value = "dist_ip")
    private String distIp;

    @TableField(value = "port")
    private Integer port;

    @TableField(value = "priority")
    private Integer priority;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_SOURCE_NODE_ID = "source_node_id";

    public static final String COL_DIST_NODE_ID = "dist_node_id";

    public static final String COL_DIST_IP = "dist_ip";

    public static final String COL_PORT = "port";

    public static final String COL_PRIORITY = "priority";
}