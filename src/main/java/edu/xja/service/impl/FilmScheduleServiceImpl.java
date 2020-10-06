package edu.xja.service.impl;

import edu.xja.dao.FilmScheduleDao;
import edu.xja.entity.FilmSchedule;
import edu.xja.service.FilmScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FilmSchedule)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:29:07
 */
@Service("filmScheduleService")
public class FilmScheduleServiceImpl implements FilmScheduleService {
    @Resource
    private FilmScheduleDao filmScheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FilmSchedule queryById(Integer id) {
        return this.filmScheduleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FilmSchedule> queryAllByLimit(int offset, int limit) {
        return this.filmScheduleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param filmSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public FilmSchedule insert(FilmSchedule filmSchedule) {
        this.filmScheduleDao.insert(filmSchedule);
        return filmSchedule;
    }

    /**
     * 修改数据
     *
     * @param filmSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public FilmSchedule update(FilmSchedule filmSchedule) {
        this.filmScheduleDao.update(filmSchedule);
        return this.queryById(filmSchedule.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.filmScheduleDao.deleteById(id) > 0;
    }
}