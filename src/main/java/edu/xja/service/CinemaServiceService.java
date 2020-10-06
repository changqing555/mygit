package edu.xja.service;

import edu.xja.entity.CinemaService;

import java.util.List;

/**
 * (CinemaService)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:51
 */
public interface CinemaServiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CinemaService queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CinemaService> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cinemaService 实例对象
     * @return 实例对象
     */
    CinemaService insert(CinemaService cinemaService);

    /**
     * 修改数据
     *
     * @param cinemaService 实例对象
     * @return 实例对象
     */
    CinemaService update(CinemaService cinemaService);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}