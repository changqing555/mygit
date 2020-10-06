package edu.xja.controller;

import edu.xja.entity.Film;
import edu.xja.service.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Film)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:58
 */
@RestController
@RequestMapping("film")
public class FilmController {
    /**
     * 服务对象
     */
    @Resource
    private FilmService filmService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Film selectOne(Integer id) {
        return this.filmService.queryById(id);
    }

}