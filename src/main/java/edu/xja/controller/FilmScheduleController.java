package edu.xja.controller;

import edu.xja.entity.FilmSchedule;
import edu.xja.service.FilmScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (FilmSchedule)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:29:08
 */
@RestController
@RequestMapping("filmSchedule")
public class FilmScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private FilmScheduleService filmScheduleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FilmSchedule selectOne(Integer id) {
        return this.filmScheduleService.queryById(id);
    }

}