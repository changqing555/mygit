package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (CinemaService)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:51
 */
@Data
public class CinemaService implements Serializable {
    private static final long serialVersionUID = 897284422807049306L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 服务项目（取自字典表service_items）
     */
    private String serviceItems;
    /**
     * 服务说明（服务介绍）
     */
    private String serviceDescription;
    /**
     * 所属影院（引用影院表t_cinema）
     */
    private Integer cinemaId;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}