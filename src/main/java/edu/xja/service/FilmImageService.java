package edu.xja.service;

import edu.xja.entity.FilmImage;

import java.util.List;

/**
 * (FilmImage)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:29:04
 */
public interface FilmImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FilmImage queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FilmImage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param filmImage 实例对象
     * @return 实例对象
     */
    FilmImage insert(FilmImage filmImage);

    /**
     * 修改数据
     *
     * @param filmImage 实例对象
     * @return 实例对象
     */
    FilmImage update(FilmImage filmImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}