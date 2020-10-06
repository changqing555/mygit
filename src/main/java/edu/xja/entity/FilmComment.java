package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (FilmComment)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:29:02
 */
@Data
public class FilmComment implements Serializable {
    private static final long serialVersionUID = 233969777278665121L;
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 评价时间
     */
    private Date commentTime;
    /**
     * 评价人id（引用自购票用户），是不是直接存昵称或者名字比较好？登录用户id或者手机号
     */
    private Integer commentPersonId;
    /**
     * 评价内容
     */
    private String commentContent;
    /**
     * 评价等级1-10分
     */
    private Object assessGrade;
    /**
     * 分数说明
     */
    private String gradeMark;
    /**
     * 点赞数
     */
    private Integer likenums;
    /**
     * 是否购票，0未购买，1已购买
     */
    private Object buyTicketsFlag;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}