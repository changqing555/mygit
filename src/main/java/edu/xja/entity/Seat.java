package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Seat)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:29:09
 */
@Data
public class Seat implements Serializable {
    private static final long serialVersionUID = -56247469134176471L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 所属影厅id，引用自影厅表(t_hall)的主键id
     */
    private Integer hallId;
    /**
     * 座位行数
     */
    private Object seatRow;
    /**
     * 座位所在列数
     */
    private Object seatColumn;
    /**
     * 座椅种类，情侣座之类的（这个还需要再考虑）
     */
    private String seatType;
    /**
     * 0是可用，1不存在，2损坏，也可取自字典表
     */
    private Object seatStatus;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}