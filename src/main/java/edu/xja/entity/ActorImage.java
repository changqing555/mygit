package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (ActorImage)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:43
 */
@Data
public class ActorImage implements Serializable {
    private static final long serialVersionUID = 757751625444960060L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 演职人员的id，引用演职人员表
     */
    private Integer actorId;
    /**
     * 图片地址
     */
    private String imageUrl;
    /**
     * 是否为封面图（是否banner）
     */
    private Object bannerFlag;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}