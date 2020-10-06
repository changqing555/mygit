package edu.xja.dao;

import edu.xja.entity.Hall;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Hall)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 17:29:08
 */
public interface HallDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hall queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Hall> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param hall 实例对象
     * @return 对象列表
     */
    List<Hall> queryAll(Hall hall);

    /**
     * 新增数据
     *
     * @param hall 实例对象
     * @return 影响行数
     */
    int insert(Hall hall);

    /**
     * 修改数据
     *
     * @param hall 实例对象
     * @return 影响行数
     */
    int update(Hall hall);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}