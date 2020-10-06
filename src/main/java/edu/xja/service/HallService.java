package edu.xja.service;

import edu.xja.entity.Hall;

import java.util.List;

/**
 * (Hall)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:29:08
 */
public interface HallService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hall queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Hall> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param hall 实例对象
     * @return 实例对象
     */
    Hall insert(Hall hall);

    /**
     * 修改数据
     *
     * @param hall 实例对象
     * @return 实例对象
     */
    Hall update(Hall hall);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}