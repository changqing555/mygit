package edu.xja.dao;

import edu.xja.entity.ActorImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ActorImage)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 17:28:43
 */
public interface ActorImageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ActorImage queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ActorImage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param actorImage 实例对象
     * @return 对象列表
     */
    List<ActorImage> queryAll(ActorImage actorImage);

    /**
     * 新增数据
     *
     * @param actorImage 实例对象
     * @return 影响行数
     */
    int insert(ActorImage actorImage);

    /**
     * 修改数据
     *
     * @param actorImage 实例对象
     * @return 影响行数
     */
    int update(ActorImage actorImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}