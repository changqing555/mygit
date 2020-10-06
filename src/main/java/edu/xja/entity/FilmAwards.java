package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (FilmAwards)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:29:00
 */
@Data
public class FilmAwards implements Serializable {
    private static final long serialVersionUID = 199890414487057566L;
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 所属影片（引用影片表t_film）
     */
    private Integer filmId;
    /**
     * 所属奖项（引用奖项表t_award）
     */
    private Integer awardsId;
    /**
     * 获奖时间
     */
    private Date awardsWinnerTime;
    /**
     * 获奖名称
     */
    private String awardsWinner;
    /**
     * 获奖届数（第几届）
     */
    private String awardsNumber;
    /**
     * 获得提名
     */
    private String awardsNominate;
    /**
     * 0为提名，1为获奖，这个字段考虑是否要
     */
    private Object awardsFlag;
    /**
     * 获奖内容，估计不需要这个字段，应该就是获奖名称
     */
    private String awardsContent;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}