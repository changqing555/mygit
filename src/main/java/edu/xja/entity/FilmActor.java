package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (FilmActor)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:58
 */
@Data
public class FilmActor implements Serializable {
    private static final long serialVersionUID = -21594818789903918L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 演职人员id，引用自演职人员表
     */
    private Integer actorId;
    /**
     * 电影id，引用自影片表
     */
    private Integer filmId;
    /**
     * 职务id,取自字典表actor_type
     */
    private String jobId;
    /**
     * 饰演角色
     */
    private String filmRole;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}