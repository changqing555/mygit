package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Awards)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:45
 */
@Data
public class Awards implements Serializable {
    private static final long serialVersionUID = -46935667517391328L;
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 奖项名称
     */
    private String awardsName;
    /**
     * 奖项成立时间
     */
    private Date awardsBeginTime;
    /**
     * 主办单位
     */
    private String awardsUnit;
    /**
     * 国家地区（是否取自字典表）
     */
    private String awardsArea;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}