package edu.xja.service.impl;

import edu.xja.dao.FilmCommentDao;
import edu.xja.entity.FilmComment;
import edu.xja.service.FilmCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FilmComment)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:29:02
 */
@Service("filmCommentService")
public class FilmCommentServiceImpl implements FilmCommentService {
    @Resource
    private FilmCommentDao filmCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FilmComment queryById(Integer id) {
        return this.filmCommentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FilmComment> queryAllByLimit(int offset, int limit) {
        return this.filmCommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param filmComment 实例对象
     * @return 实例对象
     */
    @Override
    public FilmComment insert(FilmComment filmComment) {
        this.filmCommentDao.insert(filmComment);
        return filmComment;
    }

    /**
     * 修改数据
     *
     * @param filmComment 实例对象
     * @return 实例对象
     */
    @Override
    public FilmComment update(FilmComment filmComment) {
        this.filmCommentDao.update(filmComment);
        return this.queryById(filmComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.filmCommentDao.deleteById(id) > 0;
    }
}