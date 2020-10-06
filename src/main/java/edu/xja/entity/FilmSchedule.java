package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (FilmSchedule)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:29:06
 */
@Data
public class FilmSchedule implements Serializable {
    private static final long serialVersionUID = 468923866555394332L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 所属影院id（可以不要）冗余字段
     */
    private Integer cinemaId;
    /**
     * 影片id
     */
    private Integer filmId;
    /**
     * 影厅id
     */
    private Integer hallId;
    /**
     * 语言版本(可以取自字典表，language_version)
     */
    private String languageVersion;
    /**
     * 放映开始时间
     */
    private Date startTime;
    /**
     * 散场时间（取自影片表放映时长自动计算）
     */
    private Date endTime;
    /**
     * 售价
     */
    private Object price;
    /**
     * 状态（0：已排片；1：已结束）
     */
    private Object status;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}