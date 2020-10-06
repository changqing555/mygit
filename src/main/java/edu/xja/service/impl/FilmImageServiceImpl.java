package edu.xja.service.impl;

import edu.xja.dao.FilmImageDao;
import edu.xja.entity.FilmImage;
import edu.xja.service.FilmImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FilmImage)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:29:04
 */
@Service("filmImageService")
public class FilmImageServiceImpl implements FilmImageService {
    @Resource
    private FilmImageDao filmImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FilmImage queryById(Integer id) {
        return this.filmImageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FilmImage> queryAllByLimit(int offset, int limit) {
        return this.filmImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param filmImage 实例对象
     * @return 实例对象
     */
    @Override
    public FilmImage insert(FilmImage filmImage) {
        this.filmImageDao.insert(filmImage);
        return filmImage;
    }

    /**
     * 修改数据
     *
     * @param filmImage 实例对象
     * @return 实例对象
     */
    @Override
    public FilmImage update(FilmImage filmImage) {
        this.filmImageDao.update(filmImage);
        return this.queryById(filmImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.filmImageDao.deleteById(id) > 0;
    }
}