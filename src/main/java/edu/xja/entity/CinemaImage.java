package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (CinemaImage)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:49
 */
@Data
public class CinemaImage implements Serializable {
    private static final long serialVersionUID = -72449013717501565L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 影院的id，引用影院表(t_cinema)
     */
    private Integer cinemaId;
    /**
     * 影院图片地址
     */
    private String imageUrl;
    /**
     * 是否为封面图，是否banner标识，缺省值0,0为不是，1为是
     */
    private Object cinemaBannerFlag;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}