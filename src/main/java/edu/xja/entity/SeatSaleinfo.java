package edu.xja.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SeatSaleinfo)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:29:10
 */
@Data
public class SeatSaleinfo implements Serializable {
    private static final long serialVersionUID = 484013850720388893L;
    /**
     * 主键,自增长
     */
    private Integer id;
    /**
     * 排片id(取自排片表,t_film_schedule)
     */
    private Integer scheduleId;
    /**
     * 座位id(取自座位表(t_hall_seats))
     */
    private Integer seatId;
    /**
     * 会员id取自会员表
     */
    private Integer memberId;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Object deleteFlag;


}