package edu.xja.service.impl;

import edu.xja.dao.ActorImageDao;
import edu.xja.entity.ActorImage;
import edu.xja.service.ActorImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ActorImage)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:43
 */
@Service("actorImageService")
public class ActorImageServiceImpl implements ActorImageService {
    @Resource
    private ActorImageDao actorImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ActorImage queryById(Integer id) {
        return this.actorImageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ActorImage> queryAllByLimit(int offset, int limit) {
        return this.actorImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param actorImage 实例对象
     * @return 实例对象
     */
    @Override
    public ActorImage insert(ActorImage actorImage) {
        this.actorImageDao.insert(actorImage);
        return actorImage;
    }

    /**
     * 修改数据
     *
     * @param actorImage 实例对象
     * @return 实例对象
     */
    @Override
    public ActorImage update(ActorImage actorImage) {
        this.actorImageDao.update(actorImage);
        return this.queryById(actorImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.actorImageDao.deleteById(id) > 0;
    }
}