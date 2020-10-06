package edu.xja.service.impl;

import edu.xja.dao.ActorDao;
import edu.xja.entity.Actor;
import edu.xja.service.ActorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Actor)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:42
 */
@Service("actorService")
public class ActorServiceImpl implements ActorService {
    @Resource
    private ActorDao actorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Actor queryById(Integer id) {
        return this.actorDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Actor> queryAllByLimit(int offset, int limit) {
        return this.actorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    @Override
    public Actor insert(Actor actor) {
        this.actorDao.insert(actor);
        return actor;
    }

    /**
     * 修改数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    @Override
    public Actor update(Actor actor) {
        this.actorDao.update(actor);
        return this.queryById(actor.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.actorDao.deleteById(id) > 0;
    }
}