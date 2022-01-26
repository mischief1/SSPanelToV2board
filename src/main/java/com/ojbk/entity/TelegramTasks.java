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
    * Telegram 任务列表
    */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "telegram_tasks")
public class TelegramTasks implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 任务类型
     */
    @TableField(value = "`type`")
    private Integer type;

    /**
     * 任务状态
     */
    @TableField(value = "`status`")
    private Integer status;

    /**
     * Telegram Chat ID
     */
    @TableField(value = "chatid")
    private String chatid;

    /**
     * Telegram Message ID
     */
    @TableField(value = "messageid")
    private String messageid;

    /**
     * 任务详细内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 临时任务进度
     */
    @TableField(value = "`process`")
    private String process;

    /**
     * 网站用户 ID
     */
    @TableField(value = "userid")
    private Integer userid;

    /**
     * Telegram User ID
     */
    @TableField(value = "tguserid")
    private String tguserid;

    /**
     * 任务执行时间
     */
    @TableField(value = "executetime")
    private Long executetime;

    /**
     * 任务产生时间
     */
    @TableField(value = "`datetime`")
    private Long datetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TYPE = "type";

    public static final String COL_STATUS = "status";

    public static final String COL_CHATID = "chatid";

    public static final String COL_MESSAGEID = "messageid";

    public static final String COL_CONTENT = "content";

    public static final String COL_PROCESS = "process";

    public static final String COL_USERID = "userid";

    public static final String COL_TGUSERID = "tguserid";

    public static final String COL_EXECUTETIME = "executetime";

    public static final String COL_DATETIME = "datetime";
}