package edu.xja.service.impl;

import edu.xja.dao.FilmActorDao;
import edu.xja.entity.FilmActor;
import edu.xja.service.FilmActorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FilmActor)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:59
 */
@Service("filmActorService")
public class FilmActorServiceImpl implements FilmActorService {
    @Resource
    private FilmActorDao filmActorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FilmActor queryById(Integer id) {
        return this.filmActorDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FilmActor> queryAllByLimit(int offset, int limit) {
        return this.filmActorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param filmActor 实例对象
     * @return 实例对象
     */
    @Override
    public FilmActor insert(FilmActor filmActor) {
        this.filmActorDao.insert(filmActor);
        return filmActor;
    }

    /**
     * 修改数据
     *
     * @param filmActor 实例对象
     * @return 实例对象
     */
    @Override
    public FilmActor update(FilmActor filmActor) {
        this.filmActorDao.update(filmActor);
        return this.queryById(filmActor.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.filmActorDao.deleteById(id) > 0;
    }
}