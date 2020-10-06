package edu.xja.service.impl;

import edu.xja.dao.FilmAwardsDao;
import edu.xja.entity.FilmAwards;
import edu.xja.service.FilmAwardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FilmAwards)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:29:01
 */
@Service("filmAwardsService")
public class FilmAwardsServiceImpl implements FilmAwardsService {
    @Resource
    private FilmAwardsDao filmAwardsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FilmAwards queryById(Integer id) {
        return this.filmAwardsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FilmAwards> queryAllByLimit(int offset, int limit) {
        return this.filmAwardsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param filmAwards 实例对象
     * @return 实例对象
     */
    @Override
    public FilmAwards insert(FilmAwards filmAwards) {
        this.filmAwardsDao.insert(filmAwards);
        return filmAwards;
    }

    /**
     * 修改数据
     *
     * @param filmAwards 实例对象
     * @return 实例对象
     */
    @Override
    public FilmAwards update(FilmAwards filmAwards) {
        this.filmAwardsDao.update(filmAwards);
        return this.queryById(filmAwards.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.filmAwardsDao.deleteById(id) > 0;
    }
}