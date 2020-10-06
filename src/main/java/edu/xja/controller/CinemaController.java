package edu.xja.controller;

import edu.xja.entity.Cinema;
import edu.xja.service.CinemaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Cinema)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:49
 */
@RestController
@RequestMapping("cinema")
public class CinemaController {
    /**
     * 服务对象
     */
    @Resource
    private CinemaService cinemaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Cinema selectOne(Integer id) {
        return this.cinemaService.queryById(id);
    }

}