package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (District)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:55
 */
@Data
public class District implements Serializable {
    private static final long serialVersionUID = -17749545976383088L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 行政区名称
     */
    private String districtName;
    /**
     * 所属城市的id，引用城市表（t_city）
     */
    private Integer cityId;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}