package edu.xja.dao;

import edu.xja.entity.Film;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Film)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 17:28:57
 */
public interface FilmDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Film queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Film> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param film 实例对象
     * @return 对象列表
     */
    List<Film> queryAll(Film film);

    /**
     * 新增数据
     *
     * @param film 实例对象
     * @return 影响行数
     */
    int insert(Film film);

    /**
     * 修改数据
     *
     * @param film 实例对象
     * @return 影响行数
     */
    int update(Film film);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}