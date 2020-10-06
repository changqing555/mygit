package edu.xja.controller;

import edu.xja.entity.FilmAwards;
import edu.xja.service.FilmAwardsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (FilmAwards)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:29:01
 */
@RestController
@RequestMapping("filmAwards")
public class FilmAwardsController {
    /**
     * 服务对象
     */
    @Resource
    private FilmAwardsService filmAwardsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FilmAwards selectOne(Integer id) {
        return this.filmAwardsService.queryById(id);
    }

}