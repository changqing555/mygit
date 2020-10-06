package edu.xja.controller;

import edu.xja.entity.ActorRelationship;
import edu.xja.service.ActorRelationshipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ActorRelationship)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:45
 */
@RestController
@RequestMapping("actorRelationship")
public class ActorRelationshipController {
    /**
     * 服务对象
     */
    @Resource
    private ActorRelationshipService actorRelationshipService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ActorRelationship selectOne(Integer id) {
        return this.actorRelationshipService.queryById(id);
    }

}