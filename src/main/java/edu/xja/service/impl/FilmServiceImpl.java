package edu.xja.service.impl;

import edu.xja.dao.FilmDao;
import edu.xja.entity.Film;
import edu.xja.service.FilmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Film)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:57
 */
@Service("filmService")
public class FilmServiceImpl implements FilmService {
    @Resource
    private FilmDao filmDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Film queryById(Integer id) {
        return this.filmDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Film> queryAllByLimit(int offset, int limit) {
        return this.filmDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param film 实例对象
     * @return 实例对象
     */
    @Override
    public Film insert(Film film) {
        this.filmDao.insert(film);
        return film;
    }

    /**
     * 修改数据
     *
     * @param film 实例对象
     * @return 实例对象
     */
    @Override
    public Film update(Film film) {
        this.filmDao.update(film);
        return this.queryById(film.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.filmDao.deleteById(id) > 0;
    }
}