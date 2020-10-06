package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Cinema)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:46
 */
@Data
public class Cinema implements Serializable {
    private static final long serialVersionUID = -52888918985747121L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 影院名称
     */
    private String cinemaName;
    /**
     * 影院品牌（取自字典表）(cinema_brand)
     */
    private String cinemaBrand;
    /**
     * 所在城市id（取自城市表(t_city)）,属于冗余字段
     */
    private Integer cinemaCityId;
    /**
     * 所在行政区id（取自行政区表t_district）
     */
    private Integer cinemaDistrictId;
    /**
     * 影院特殊厅id，取自字典表,specialhall-category,使用逗号分隔
     */
    private String specialHall;
    /**
     * 影院详细地址
     */
    private String cinemaAddress;
    /**
     * 影院电话
     */
    private String cinemaPhone;
    /**
     * 地址经度
     */
    private String cinemaLongitude;
    /**
     * 地址纬度
     */
    private String cinemaDimensions;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}