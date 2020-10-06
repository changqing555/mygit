package edu.xja.controller;

import edu.xja.entity.Hall;
import edu.xja.service.HallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Hall)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:29:09
 */
@RestController
@RequestMapping("hall")
public class HallController {
    /**
     * 服务对象
     */
    @Resource
    private HallService hallService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hall selectOne(Integer id) {
        return this.hallService.queryById(id);
    }

}