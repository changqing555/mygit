package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Actor)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:41
 */
@Data
public class Actor implements Serializable {
    private static final long serialVersionUID = -83578599110423794L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 姓名
     */
    private String actorName;
    /**
     * 别名
     */
    private String otherName;
    /**
     * 民族
     */
    private String actorNation;
    /**
     * 出生日期
     */
    private Date actorBirthday;
    /**
     * 血型
     */
    private String bloodType;
    /**
     * 出生地
     */
    private String birthPlace;
    /**
     * 身份,取自字典表(actor_type)
     */
    private String actorIdentity;
    /**
     * 性别
     */
    private String actorSex;
    /**
     * 星座
     */
    private String actorConstellation;
    /**
     * 毕业学校
     */
    private String actorGraduation;
    /**
     * 身高
     */
    private Integer actorHigh;
    /**
     * 介绍
     */
    private String actorIntroduce;
    /**
     * 粉丝别名
     */
    private String actorFansName;
    /**
     * 国籍
     */
    private String actorNationality;
    /**
     * 经济公司
     */
    private String actorCompany;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}