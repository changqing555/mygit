package edu.xja.controller;

import edu.xja.entity.Actor;
import edu.xja.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Actor)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:42
 */
@RestController
@RequestMapping("actor")
public class ActorController {
    /**
     * 服务对象
     */
    @Resource
    private ActorService actorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键1
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Actor selectOne(Integer id) {
        //System.out.println("111");
        return actorService.queryById(id);
    }

}