package edu.xja.controller;

import edu.xja.entity.FilmImage;
import edu.xja.service.FilmImageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (FilmImage)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:29:05
 */
@RestController
@RequestMapping("filmImage")
public class FilmImageController {
    /**
     * 服务对象
     */
    @Resource
    private FilmImageService filmImageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FilmImage selectOne(Integer id) {
        return this.filmImageService.queryById(id);
    }

}