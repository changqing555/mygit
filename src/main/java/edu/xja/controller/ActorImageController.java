package edu.xja.controller;

import edu.xja.entity.ActorImage;
import edu.xja.service.ActorImageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ActorImage)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:44
 */
@RestController
@RequestMapping("actorImage")
public class ActorImageController {
    /**
     * 服务对象
     */
    @Resource
    private ActorImageService actorImageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ActorImage selectOne(Integer id) {
        return this.actorImageService.queryById(id);
    }

}