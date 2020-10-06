package edu.xja.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.xja.dao.DictionaryDao;
import edu.xja.entity.Dictionary;
import edu.xja.service.DictionaryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dictionary)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 17:28:54
 */
@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {
    @Resource
    private DictionaryDao dictionaryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dictionary queryById(Integer id) {
        return this.dictionaryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Dictionary> queryAllByLimit(int offset, int limit) {
        return this.dictionaryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dictionary 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Dictionary dictionary) {
        int insert = dictionaryDao.insert(dictionary);
        return insert > 0;
    }

    /**
     * 修改数据
     *
     * @param dictionary 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Dictionary dictionary) {
        boolean update = dictionaryDao.update(dictionary) > 0;
        return update;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dictionaryDao.deleteById(id) > 0;
    }

    /**
     * 通过
     * @return
     */
    @Override
    public PageInfo<Dictionary> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Dictionary> dictionaryList = dictionaryDao.findAll();
        PageInfo<Dictionary> dictionaryPageInfo = new PageInfo<>(dictionaryList);
        return dictionaryPageInfo;
    }

    /**
     * type查询
     * @param dictType
     * @return
     */
    @Override
    public List<Dictionary> findByType(String dictType) {
        return dictionaryDao.findByType(dictType);
    }

    /**
     * 根据类型和名称模糊查询
     * @param dictType
     * @param dictName
     * @return
     */
    @Override
    public List<Dictionary> getByTypeAndName(String dictType, String dictName) {
        return dictionaryDao.getByTypeAndName(dictType, dictName);
    }

    @Override
    public int updateFlag(Integer id){
        return dictionaryDao.updateFlag(id);
    }
}