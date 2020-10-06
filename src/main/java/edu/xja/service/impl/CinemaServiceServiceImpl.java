package edu.xja.service.impl;

import edu.xja.dao.CinemaServiceDao;
import edu.xja.entity.CinemaService;
import edu.xja.service.CinemaServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CinemaService)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:51
 */
@Service("cinemaServiceService")
public class CinemaServiceServiceImpl implements CinemaServiceService {
    @Resource
    private CinemaServiceDao cinemaServiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CinemaService queryById(Integer id) {
        return this.cinemaServiceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CinemaService> queryAllByLimit(int offset, int limit) {
        return this.cinemaServiceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cinemaService 实例对象
     * @return 实例对象
     */
    @Override
    public CinemaService insert(CinemaService cinemaService) {
        this.cinemaServiceDao.insert(cinemaService);
        return cinemaService;
    }

    /**
     * 修改数据
     *
     * @param cinemaService 实例对象
     * @return 实例对象
     */
    @Override
    public CinemaService update(CinemaService cinemaService) {
        this.cinemaServiceDao.update(cinemaService);
        return this.queryById(cinemaService.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cinemaServiceDao.deleteById(id) > 0;
    }
}