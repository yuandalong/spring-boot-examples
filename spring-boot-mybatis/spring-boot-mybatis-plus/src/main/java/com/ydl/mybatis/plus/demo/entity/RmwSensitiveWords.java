package com.ydl.mybatis.plus.demo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ydl
 * @since 2020-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RmwSensitiveWords implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String id;

    /**
     * 敏感词
     */
    private String word;

    private String channel;

    /**
     * 敏感词级别
     */
    private String sensitiveLevel;

    /**
     * 敏感词缘由
     */
    private String sensitiveReason;

    /**
     * 是否启用（0启用 1删除 2未启用）
     */
    private String status;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建日期
     */
    private LocalDateTime createDate;

    /**
     * 操作人
     */
    private String updateBy;

    /**
     * 更新日期
     */
    private LocalDateTime updateDate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 支持范围
     */
    private String applyArea;


}
