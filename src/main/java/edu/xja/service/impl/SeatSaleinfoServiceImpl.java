package edu.xja.service.impl;

import edu.xja.dao.SeatSaleinfoDao;
import edu.xja.entity.SeatSaleinfo;
import edu.xja.service.SeatSaleinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SeatSaleinfo)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:29:10
 */
@Service("seatSaleinfoService")
public class SeatSaleinfoServiceImpl implements SeatSaleinfoService {
    @Resource
    private SeatSaleinfoDao seatSaleinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SeatSaleinfo queryById(Integer id) {
        return this.seatSaleinfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SeatSaleinfo> queryAllByLimit(int offset, int limit) {
        return this.seatSaleinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param seatSaleinfo 实例对象
     * @return 实例对象
     */
    @Override
    public SeatSaleinfo insert(SeatSaleinfo seatSaleinfo) {
        this.seatSaleinfoDao.insert(seatSaleinfo);
        return seatSaleinfo;
    }

    /**
     * 修改数据
     *
     * @param seatSaleinfo 实例对象
     * @return 实例对象
     */
    @Override
    public SeatSaleinfo update(SeatSaleinfo seatSaleinfo) {
        this.seatSaleinfoDao.update(seatSaleinfo);
        return this.queryById(seatSaleinfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.seatSaleinfoDao.deleteById(id) > 0;
    }
}