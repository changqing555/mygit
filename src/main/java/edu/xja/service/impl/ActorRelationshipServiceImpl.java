package edu.xja.service.impl;

import edu.xja.dao.ActorRelationshipDao;
import edu.xja.entity.ActorRelationship;
import edu.xja.service.ActorRelationshipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ActorRelationship)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:45
 */
@Service("actorRelationshipService")
public class ActorRelationshipServiceImpl implements ActorRelationshipService {
    @Resource
    private ActorRelationshipDao actorRelationshipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ActorRelationship queryById(Integer id) {
        return this.actorRelationshipDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ActorRelationship> queryAllByLimit(int offset, int limit) {
        return this.actorRelationshipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param actorRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public ActorRelationship insert(ActorRelationship actorRelationship) {
        this.actorRelationshipDao.insert(actorRelationship);
        return actorRelationship;
    }

    /**
     * 修改数据
     *
     * @param actorRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public ActorRelationship update(ActorRelationship actorRelationship) {
        this.actorRelationshipDao.update(actorRelationship);
        return this.queryById(actorRelationship.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.actorRelationshipDao.deleteById(id) > 0;
    }
}