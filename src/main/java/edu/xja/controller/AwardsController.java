package edu.xja.controller;

import edu.xja.entity.Awards;
import edu.xja.service.AwardsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Awards)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:46
 */
@RestController
@RequestMapping("awards")
public class AwardsController {
    /**
     * 服务对象
     */
    @Resource
    private AwardsService awardsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Awards selectOne(Integer id) {
        return this.awardsService.queryById(id);
    }

}