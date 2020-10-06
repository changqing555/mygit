package edu.xja.service;

import com.github.pagehelper.PageInfo;
import edu.xja.entity.Dictionary;

import java.util.List;

/**
 * (Dictionary)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:54
 */
public interface DictionaryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dictionary queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Dictionary> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dictionary 实例对象
     * @return 实例对象
     */
    boolean insert(Dictionary dictionary);

    /**
     * 修改数据
     *
     * @param dictionary 实例对象
     * @return 实例对象
     */
    boolean update(Dictionary dictionary);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 通过页数和页面字典数目查询
     *
     * @param pageNum 显示页数
     * @param pageSize 当前页数量
     * @return 当前页字典信息
     */
    PageInfo<Dictionary> findAll(int pageNum, int pageSize);

    /**
     * 通过type查询字典
     * @param dictType
     * @return 所有该type类型的字典
     */
    List<Dictionary> findByType(String dictType);

    /**
     * 根据类型和名字模糊查询
     * @param dictType
     * @param dictName
     * @return
     */
    List<Dictionary> getByTypeAndName(String dictType, String dictName);

    int updateFlag(Integer id);
}