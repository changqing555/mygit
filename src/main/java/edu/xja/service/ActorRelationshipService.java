package edu.xja.service;

import edu.xja.entity.ActorRelationship;

import java.util.List;

/**
 * (ActorRelationship)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:44
 */
public interface ActorRelationshipService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ActorRelationship queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ActorRelationship> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param actorRelationship 实例对象
     * @return 实例对象
     */
    ActorRelationship insert(ActorRelationship actorRelationship);

    /**
     * 修改数据
     *
     * @param actorRelationship 实例对象
     * @return 实例对象
     */
    ActorRelationship update(ActorRelationship actorRelationship);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}