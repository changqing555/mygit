package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Hall)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:29:08
 */
@Data
public class Hall implements Serializable {
    private static final long serialVersionUID = 458120252326635264L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 所属影院id,取自t_cinema表
     */
    private Integer cinemaId;
    /**
     * 影厅名称
     */
    private String hallName;
    /**
     * 影厅类型，取自子典表
     */
    private String hallCategoty;
    /**
     * 影厅排数（影厅座位总排数）
     */
    private Object hallRows;
    /**
     * 影厅列数
     */
    private Object hallCols;
    /**
     * 状态（维修中，正常使用）
     */
    private Object hallStatus;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}