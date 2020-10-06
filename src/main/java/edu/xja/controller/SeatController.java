package edu.xja.controller;

import edu.xja.entity.Seat;
import edu.xja.service.SeatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Seat)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:29:09
 */
@RestController
@RequestMapping("seat")
public class SeatController {
    /**
     * 服务对象
     */
    @Resource
    private SeatService seatService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Seat selectOne(Integer id) {
        return this.seatService.queryById(id);
    }

}