package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Film)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:56
 */
@Data
public class Film implements Serializable {
    private static final long serialVersionUID = -26280625847962630L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 电影名称
     */
    private String filmName;
    /**
     * 英文名
     */
    private String filmEnName;
    /**
     * 剧情简介
     */
    private String filmIntro;
    /**
     * 影片类型id，取自字典表（film_type），多种类型使用逗号分隔
     */
    private String filmType;
    /**
     * 影片所在区域id(影片拍摄方所在区域，取自字典表)(film_area)
     */
    private String filmArea;
    /**
     * 上映时间
     */
    private Date filmReleaseTime;
    /**
     * 上映时长（分钟）
     */
    private Integer filmDuration;
    /**
     * 上映地点
     */
    private String filmReleaseAddress;
    /**
     * 影片用户评分(应该是动态计算出来的)
     */
    private Object filmScore;
    /**
     * 影片票房
     */
    private Object filmBoxOffice;
    /**
     * 影片格式、可以取自字典表（film_format）
     */
    private String filmFormat;
    /**
     * 想看数
     */
    private Long filmSee;
    /**
     * 影片状态（上架，下架）
     */
    private Object filmStatus;
    /**
     * 影片描述
     */
    private String filmDescription;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}