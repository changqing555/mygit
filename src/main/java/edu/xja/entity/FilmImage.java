package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (FilmImage)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:29:04
 */
@Data
public class FilmImage implements Serializable {
    private static final long serialVersionUID = 836199523851807741L;
    /**
     * 主键，自增长
     */
    private Integer id;
    /**
     * 所属影片id，取自t_film表
     */
    private Integer filmId;
    /**
     * 0为否，1为是是否banner标识
     */
    private Object filmBannerFlag;
    /**
     * 0为否，1为是是否影片集头部标识
     */
    private Object filmHeadFlag;
    /**
     * 是否首页小图，0为否，1为是
     */
    private Object filmHomepageSmall;
    /**
     * 图片地址
     */
    private String imageUrl;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}