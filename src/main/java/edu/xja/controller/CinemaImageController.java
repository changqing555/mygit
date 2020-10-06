package edu.xja.controller;

import edu.xja.entity.CinemaImage;
import edu.xja.service.CinemaImageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CinemaImage)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:50
 */
@RestController
@RequestMapping("cinemaImage")
public class CinemaImageController {
    /**
     * 服务对象
     */
    @Resource
    private CinemaImageService cinemaImageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CinemaImage selectOne(Integer id) {
        return this.cinemaImageService.queryById(id);
    }

}