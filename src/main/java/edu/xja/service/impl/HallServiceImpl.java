package edu.xja.service.impl;

import edu.xja.dao.HallDao;
import edu.xja.entity.Hall;
import edu.xja.service.HallService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Hall)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:29:08
 */
@Service("hallService")
public class HallServiceImpl implements HallService {
    @Resource
    private HallDao hallDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Hall queryById(Integer id) {
        return this.hallDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Hall> queryAllByLimit(int offset, int limit) {
        return this.hallDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hall 实例对象
     * @return 实例对象
     */
    @Override
    public Hall insert(Hall hall) {
        this.hallDao.insert(hall);
        return hall;
    }

    /**
     * 修改数据
     *
     * @param hall 实例对象
     * @return 实例对象
     */
    @Override
    public Hall update(Hall hall) {
        this.hallDao.update(hall);
        return this.queryById(hall.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hallDao.deleteById(id) > 0;
    }
}