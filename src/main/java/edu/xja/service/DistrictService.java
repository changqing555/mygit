package edu.xja.service;

import edu.xja.entity.District;

import java.util.List;

/**
 * (District)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:55
 */
public interface DistrictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    District queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<District> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param district 实例对象
     * @return 实例对象
     */
    District insert(District district);

    /**
     * 修改数据
     *
     * @param district 实例对象
     * @return 实例对象
     */
    District update(District district);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}