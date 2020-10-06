package edu.xja.service;

import edu.xja.entity.ActorImage;

import java.util.List;

/**
 * (ActorImage)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 17:28:43
 */
public interface ActorImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ActorImage queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ActorImage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param actorImage 实例对象
     * @return 实例对象
     */
    ActorImage insert(ActorImage actorImage);

    /**
     * 修改数据
     *
     * @param actorImage 实例对象
     * @return 实例对象
     */
    ActorImage update(ActorImage actorImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}