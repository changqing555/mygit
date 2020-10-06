package edu.xja.service.impl;

import edu.xja.dao.CinemaImageDao;
import edu.xja.entity.CinemaImage;
import edu.xja.service.CinemaImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CinemaImage)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:50
 */
@Service("cinemaImageService")
public class CinemaImageServiceImpl implements CinemaImageService {
    @Resource
    private CinemaImageDao cinemaImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CinemaImage queryById(Integer id) {
        return this.cinemaImageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CinemaImage> queryAllByLimit(int offset, int limit) {
        return this.cinemaImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cinemaImage 实例对象
     * @return 实例对象
     */
    @Override
    public CinemaImage insert(CinemaImage cinemaImage) {
        this.cinemaImageDao.insert(cinemaImage);
        return cinemaImage;
    }

    /**
     * 修改数据
     *
     * @param cinemaImage 实例对象
     * @return 实例对象
     */
    @Override
    public CinemaImage update(CinemaImage cinemaImage) {
        this.cinemaImageDao.update(cinemaImage);
        return this.queryById(cinemaImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cinemaImageDao.deleteById(id) > 0;
    }
}