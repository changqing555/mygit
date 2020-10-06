package edu.xja.dao;

import edu.xja.entity.ActorRelationship;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ActorRelationship)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 17:28:44
 */
public interface ActorRelationshipDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ActorRelationship queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ActorRelationship> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param actorRelationship 实例对象
     * @return 对象列表
     */
    List<ActorRelationship> queryAll(ActorRelationship actorRelationship);

    /**
     * 新增数据
     *
     * @param actorRelationship 实例对象
     * @return 影响行数
     */
    int insert(ActorRelationship actorRelationship);

    /**
     * 修改数据
     *
     * @param actorRelationship 实例对象
     * @return 影响行数
     */
    int update(ActorRelationship actorRelationship);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}