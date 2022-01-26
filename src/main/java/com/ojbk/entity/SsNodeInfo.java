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
@TableName(value = "ss_node_info")
public class SsNodeInfo implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "node_id")
    private Integer nodeId;

    @TableField(value = "uptime")
    private Double uptime;

    @TableField(value = "`load`")
    private String load;

    @TableField(value = "log_time")
    private Integer logTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NODE_ID = "node_id";

    public static final String COL_UPTIME = "uptime";

    public static final String COL_LOAD = "load";

    public static final String COL_LOG_TIME = "log_time";
}