package edu.xja.service;

import com.github.pagehelper.PageInfo;
import edu.xja.BaseTest;
import edu.xja.entity.Dictionary;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

public class DictionaryServiceTest extends BaseTest {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private DictionaryService dictionaryService;

    @Test
    public void queryById() {

        Dictionary dictionary = dictionaryService.queryById(1);
        Assert.assertEquals("shiyan", dictionary.getDictName());
    }

    @Test
    public void insert() {
        Dictionary dictionary = new Dictionary();
        //dictionary.setId(2);
        dictionary.setDictType("shiyan");
        dictionary.setDictName("shiyan");
        dictionary.setDictValue("111");
        //dictionary.setCreateTime("");
        boolean insert = dictionaryService.insert(dictionary);
        Assert.assertNotNull(insert);
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void findAll() {
        logger.trace("这是trace日志");
        PageInfo<Dictionary> all = dictionaryService.findAll(1, 2);
        Assert.assertNotNull(all);

    }

    @Test
    public void findByType() {
        logger.warn("这是warn日志");
        List<Dictionary> aa = dictionaryService.findByType("aa");
        Assert.assertNotNull(aa);
    }
    @Test
    public void getByTypeAndName() {
        List<Dictionary> byTypeAndName = dictionaryService.getByTypeAndName("s", "");
        Assert.assertEquals(6, byTypeAndName.size());
    }
}