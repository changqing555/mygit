package edu.xja.dao;

import edu.xja.entity.FilmSchedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (FilmSchedule)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 17:29:06
 */
public interface FilmScheduleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FilmSchedule queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FilmSchedule> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param filmSchedule 实例对象
     * @return 对象列表
     */
    List<FilmSchedule> queryAll(FilmSchedule filmSchedule);

    /**
     * 新增数据
     *
     * @param filmSchedule 实例对象
     * @return 影响行数
     */
    int insert(FilmSchedule filmSchedule);

    /**
     * 修改数据
     *
     * @param filmSchedule 实例对象
     * @return 影响行数
     */
    int update(FilmSchedule filmSchedule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}