package edu.xja.controller;

import com.github.pagehelper.PageInfo;
import edu.xja.entity.Dictionary;
import edu.xja.service.DictionaryService;
import edu.xja.vo.HttpResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.swing.event.ListDataEvent;
import java.sql.Date;
import java.util.List;

/**
 * (Dictionary)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:55
 */

@Slf4j
@RestController
@RequestMapping("dictionary")
@Api(value = "字典Controller", tags = {"字典操作"})
public class DictionaryController {
    /**
     * 服务对象
     */
    @Resource
    private DictionaryService dictionaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据主键查询字典信息", notes = "根据主键id查询字典信息")
    @ApiImplicitParam(name = "id", value = "主键")
    @GetMapping("getById")
    public HttpResult selectOne(Integer id) {
        Dictionary dictionary = dictionaryService.queryById(id);
        if(dictionary == null) {
            log.info("未查找到数据");
            return HttpResult.ok("没有数据");
        }
        return HttpResult.ok(dictionary);
    }

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return 查询页面所有字典
     */
    @ApiOperation(value = "分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页数", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "当前页字典数目", defaultValue = "2")
    })
    @GetMapping("findAll")
    public HttpResult findAll(int pageNum, int pageSize) {
        return HttpResult.ok(dictionaryService.findAll(pageNum, pageSize));
    }

    /**
     * 添加字典
     *
     * @param dictionary
     * @return
     */
    @ApiOperation(value = "添加字典")
    @GetMapping("add")
    public HttpResult add(@Validated Dictionary dictionary) {
        boolean insert = dictionaryService.insert(dictionary);
        if (insert) {
            log.info("字典添加成功");
            return HttpResult.ok("添加字典成功");
        }
        return HttpResult.ok("添加字典失败");

    }

    /**
     * 修改字典
     *
     * @param dictionary
     * @return
     */
    @ApiOperation(value = "修改字典")
    @GetMapping("update")
    public HttpResult update(@Validated Dictionary dictionary) {
        boolean update = dictionaryService.update(dictionary);
        if ( update) {
            return HttpResult.ok("修改成功");
        }
        return HttpResult.ok("修改失败");
    }

    /**
     * 通过id删除字典
     *
     * @param id
     * @return true为删除成功，false为删除失败
     */
    @ApiOperation(value = "根据id删除字典")
    @ApiImplicitParam(name = "id", value = "主键")
    @GetMapping("delete")
    public HttpResult delete(Integer id) {
        int i = dictionaryService.updateFlag(id);
        if (i < 0) {
            return HttpResult.error("删除失败");
        }
        return HttpResult.ok("删除成功");
        //return dictionaryService.deleteById(id);
    }

    /**
     * 根据类型模糊查询
     *
     * @param dictType
     * @return
     */
    @ApiOperation("根据类型查找字典")
//    @ApiImplicitParam(name = "dictType", value = "数据字典类型")
    @GetMapping("findByType")
    public List<Dictionary> findByType(String dictType) {
        return dictionaryService.findByType(dictType);
    }

    /**
     * 根据字典类型和名称模糊查询
     *
     * @param dictType
     * @param dictName
     * @return
     */
    @ApiOperation("根据类型和名称模糊查询")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "dictType", value = "数据字典类型"),
//            @ApiImplicitParam(name = "dictName", value = "数据字典名称")
//    })
    @GetMapping("getByTypeAndName")
    public List<Dictionary> getByTypeAndName(String dictType, String dictName) {
        return dictionaryService.getByTypeAndName(dictType, dictName);
    }
}