package edu.xja.service.impl;

import edu.xja.dao.SeatDao;
import edu.xja.entity.Seat;
import edu.xja.service.SeatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Seat)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:29:09
 */
@Service("seatService")
public class SeatServiceImpl implements SeatService {
    @Resource
    private SeatDao seatDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Seat queryById(Integer id) {
        return this.seatDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Seat> queryAllByLimit(int offset, int limit) {
        return this.seatDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param seat 实例对象
     * @return 实例对象
     */
    @Override
    public Seat insert(Seat seat) {
        this.seatDao.insert(seat);
        return seat;
    }

    /**
     * 修改数据
     *
     * @param seat 实例对象
     * @return 实例对象
     */
    @Override
    public Seat update(Seat seat) {
        this.seatDao.update(seat);
        return this.queryById(seat.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.seatDao.deleteById(id) > 0;
    }
}