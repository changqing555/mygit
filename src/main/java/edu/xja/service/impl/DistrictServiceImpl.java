package edu.xja.service.impl;

import edu.xja.dao.DistrictDao;
import edu.xja.entity.District;
import edu.xja.service.DistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (District)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:55
 */
@Service("districtService")
public class DistrictServiceImpl implements DistrictService {
    @Resource
    private DistrictDao districtDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public District queryById(Integer id) {
        return this.districtDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<District> queryAllByLimit(int offset, int limit) {
        return this.districtDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param district 实例对象
     * @return 实例对象
     */
    @Override
    public District insert(District district) {
        this.districtDao.insert(district);
        return district;
    }

    /**
     * 修改数据
     *
     * @param district 实例对象
     * @return 实例对象
     */
    @Override
    public District update(District district) {
        this.districtDao.update(district);
        return this.queryById(district.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.districtDao.deleteById(id) > 0;
    }
}