package edu.xja.controller;

import edu.xja.entity.CinemaService;
import edu.xja.service.CinemaServiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CinemaService)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:52
 */
@RestController
@RequestMapping("cinemaService")
public class CinemaServiceController {
    /**
     * 服务对象
     */
    @Resource
    private CinemaServiceService cinemaServiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CinemaService selectOne(Integer id) {
        return this.cinemaServiceService.queryById(id);
    }

}