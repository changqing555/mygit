package edu.xja.service;

import edu.xja.entity.Cinema;

import java.util.List;

/**
 * (Cinema)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:47
 */
public interface CinemaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Cinema queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cinema> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    Cinema insert(Cinema cinema);

    /**
     * 修改数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    Cinema update(Cinema cinema);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}