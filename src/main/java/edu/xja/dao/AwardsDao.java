package edu.xja.dao;

import edu.xja.entity.Awards;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Awards)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 17:28:45
 */
public interface AwardsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Awards queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Awards> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param awards 实例对象
     * @return 对象列表
     */
    List<Awards> queryAll(Awards awards);

    /**
     * 新增数据
     *
     * @param awards 实例对象
     * @return 影响行数
     */
    int insert(Awards awards);

    /**
     * 修改数据
     *
     * @param awards 实例对象
     * @return 影响行数
     */
    int update(Awards awards);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}