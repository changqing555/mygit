package edu.xja.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.xja.dao.CityDao;
import edu.xja.entity.City;
import edu.xja.service.CityService;
import edu.xja.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (City)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:52
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;
    @Resource
    private RedisUtil redisUtil;

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */

    @Cacheable("city")
    @Override
    public City queryById(Integer id) {
        return this.cityDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<City> queryAllByLimit(int offset, int limit) {
        return this.cityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    @Override
    public City insert(City city) {
        this.cityDao.insert(city);
        return city;
    }

    /**
     * 修改数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    @Override
    public City update(City city) {
        this.cityDao.update(city);
        return this.queryById(city.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cityDao.deleteById(id) > 0;
    }

    @Override
    public int updateFlag(Integer id) {
        return cityDao.updateFlag(id);
    }

    @Override
    public PageInfo<City> search(Integer pageNum, Integer pageSize, City city) {
        PageHelper.startPage(pageNum,pageSize);
        List<City> cityList = cityDao.queryAll(city);
        PageInfo<City> cityPageInfo = new PageInfo<>(cityList);
        return cityPageInfo;
    }

    @Override
    public List<City> findAll() {
        List<City> cities = null;
        cities = (List<City>) redisTemplate.opsForValue().get("film_ticket_city");
        System.out.println(cities);
        if (StringUtils.isEmpty(cities)){
            cities = cityDao.findAll();
            System.out.println(cities);
            // redisTemplate.opsForValue().set("cities", cities);
            // redisTemplate.boundValueOps("cities").set(cities);
            redisTemplate.opsForValue().set("film_ticket_city", cities);

        }
        return cities;
    }
}