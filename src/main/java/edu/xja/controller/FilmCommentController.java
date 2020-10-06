package edu.xja.controller;

import edu.xja.entity.FilmComment;
import edu.xja.service.FilmCommentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (FilmComment)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:29:03
 */
@RestController
@RequestMapping("filmComment")
public class FilmCommentController {
    /**
     * 服务对象
     */
    @Resource
    private FilmCommentService filmCommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FilmComment selectOne(Integer id) {
        return this.filmCommentService.queryById(id);
    }

}