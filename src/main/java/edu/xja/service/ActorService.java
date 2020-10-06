package edu.xja.service;

import edu.xja.entity.Actor;

import java.util.List;

/**
 * (Actor)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:42
 */
public interface ActorService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Actor queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Actor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    Actor insert(Actor actor);

    /**
     * 修改数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    Actor update(Actor actor);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}