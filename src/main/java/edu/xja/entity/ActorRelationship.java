package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (ActorRelationship)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:44
 */
@Data
public class ActorRelationship implements Serializable {
    private static final long serialVersionUID = -94031272746618754L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 影人id（引用演职员表）
     */
    private Integer actorId;
    /**
     * 关联的影人id（引用演职员表）
     */
    private Integer actorRelationId;
    /**
     * 人物关系,取自字典表(relationship)
     */
    private String relationship;
    /**
     * 合作次数
     */
    private Integer cooperationNums;
    /**
     * 排序（干嘛用？）
     */
    private Integer sort;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}