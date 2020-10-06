package edu.xja.service;

import com.github.pagehelper.PageInfo;
import edu.xja.entity.City;

import java.util.List;

/**
 * (City)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:52
 */
public interface CityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    City queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<City> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    City insert(City city);

    /**
     * 修改数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    City update(City city);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 通过id设置delete_flag标识删除
     * @param id
     * @return
     */
    int updateFlag(Integer id);
    PageInfo<City> search(Integer pageNum, Integer pageSize, City city);

    List<City> findAll();
}