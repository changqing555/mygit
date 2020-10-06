package edu.xja.controller;

import edu.xja.entity.SeatSaleinfo;
import edu.xja.service.SeatSaleinfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SeatSaleinfo)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:29:10
 */
@RestController
@RequestMapping("seatSaleinfo")
public class SeatSaleinfoController {
    /**
     * 服务对象
     */
    @Resource
    private SeatSaleinfoService seatSaleinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SeatSaleinfo selectOne(Integer id) {
        return this.seatSaleinfoService.queryById(id);
    }

}