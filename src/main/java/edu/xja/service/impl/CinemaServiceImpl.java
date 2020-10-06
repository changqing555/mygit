package edu.xja.service.impl;

import edu.xja.dao.CinemaDao;
import edu.xja.entity.Cinema;
import edu.xja.service.CinemaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cinema)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:47
 */
@Service("cinemaService")
public class CinemaServiceImpl implements CinemaService {
    @Resource
    private CinemaDao cinemaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Cinema queryById(Integer id) {
        return this.cinemaDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Cinema> queryAllByLimit(int offset, int limit) {
        return this.cinemaDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    @Override
    public Cinema insert(Cinema cinema) {
        this.cinemaDao.insert(cinema);
        return cinema;
    }

    /**
     * 修改数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    @Override
    public Cinema update(Cinema cinema) {
        this.cinemaDao.update(cinema);
        return this.queryById(cinema.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cinemaDao.deleteById(id) > 0;
    }
}