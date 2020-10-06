package edu.xja.service.impl;

import edu.xja.dao.AwardsDao;
import edu.xja.entity.Awards;
import edu.xja.service.AwardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Awards)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:46
 */
@Service("awardsService")
public class AwardsServiceImpl implements AwardsService {
    @Resource
    private AwardsDao awardsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Awards queryById(Integer id) {
        return this.awardsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Awards> queryAllByLimit(int offset, int limit) {
        return this.awardsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param awards 实例对象
     * @return 实例对象
     */
    @Override
    public Awards insert(Awards awards) {
        this.awardsDao.insert(awards);
        return awards;
    }

    /**
     * 修改数据
     *
     * @param awards 实例对象
     * @return 实例对象
     */
    @Override
    public Awards update(Awards awards) {
        this.awardsDao.update(awards);
        return this.queryById(awards.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.awardsDao.deleteById(id) > 0;
    }
}