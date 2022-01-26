package com.ojbk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName(value = "ss_node")
public class SsNode implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "`type`")
    private Integer type;

    @TableField(value = "server")
    private String server;

    @TableField(value = "`method`")
    private String method;

    @TableField(value = "info")
    private String info;

    @TableField(value = "`status`")
    private String status;

    @TableField(value = "sort")
    private Integer sort;

    @TableField(value = "custom_method")
    private Boolean customMethod;

    @TableField(value = "traffic_rate")
    private Double trafficRate;

    @TableField(value = "node_class")
    private Integer nodeClass;

    @TableField(value = "node_speedlimit")
    private BigDecimal nodeSpeedlimit;

    @TableField(value = "node_connector")
    private Integer nodeConnector;

    @TableField(value = "node_bandwidth")
    private Long nodeBandwidth;

    @TableField(value = "node_bandwidth_limit")
    private Long nodeBandwidthLimit;

    @TableField(value = "bandwidthlimit_resetday")
    private Integer bandwidthlimitResetday;

    @TableField(value = "node_heartbeat")
    private Long nodeHeartbeat;

    @TableField(value = "node_ip")
    private String nodeIp;

    @TableField(value = "node_group")
    private Integer nodeGroup;

    @TableField(value = "custom_rss")
    private Integer customRss;

    @TableField(value = "mu_only")
    private Integer muOnly;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_TYPE = "type";

    public static final String COL_SERVER = "server";

    public static final String COL_METHOD = "method";

    public static final String COL_INFO = "info";

    public static final String COL_STATUS = "status";

    public static final String COL_SORT = "sort";

    public static final String COL_CUSTOM_METHOD = "custom_method";

    public static final String COL_TRAFFIC_RATE = "traffic_rate";

    public static final String COL_NODE_CLASS = "node_class";

    public static final String COL_NODE_SPEEDLIMIT = "node_speedlimit";

    public static final String COL_NODE_CONNECTOR = "node_connector";

    public static final String COL_NODE_BANDWIDTH = "node_bandwidth";

    public static final String COL_NODE_BANDWIDTH_LIMIT = "node_bandwidth_limit";

    public static final String COL_BANDWIDTHLIMIT_RESETDAY = "bandwidthlimit_resetday";

    public static final String COL_NODE_HEARTBEAT = "node_heartbeat";

    public static final String COL_NODE_IP = "node_ip";

    public static final String COL_NODE_GROUP = "node_group";

    public static final String COL_CUSTOM_RSS = "custom_rss";

    public static final String COL_MU_ONLY = "mu_only";
}