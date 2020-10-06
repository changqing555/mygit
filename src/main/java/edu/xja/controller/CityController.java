package edu.xja.controller;
import edu.xja.entity.City;
import edu.xja.service.CityService;
import edu.xja.vo.HttpResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("city")
@Slf4j
//支持跨域请求
@CrossOrigin
public class CityController {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;
    /**
     * 服务对象
     */
    @Resource
    private CityService cityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public HttpResult selectOne(Integer id) {
        log.info("查询城市信息");
        log.error("查询出现错误");
        log.debug("hello world");
        return HttpResult.ok(cityService.queryById(id));
    }


    @PostMapping("add")
    public HttpResult add( @Validated City city){
        City result=  cityService.insert(city);
        if(result==null){
            HttpResult.error("添加城市信息失败！！！");
        }
        return HttpResult.ok("添加城市信息成功");
    }

    @PostMapping("add1")
    public HttpResult add1(City city){
        City result=  cityService.insert(city);
        if(result==null){
            HttpResult.error("添加城市信息失败！！！");
        }
        return HttpResult.ok("添加城市信息成功");
    }

    @PostMapping("add2")
    public HttpResult add2(@RequestBody  City city){
        City result=  cityService.insert(city);
        if(result==null){
            HttpResult.error("添加城市信息失败！！！");
        }
        return HttpResult.ok("添加城市信息成功");
    }

    /**
     * @RequestBody 注解，意味着接收的参数为json类型
     * {"cityName":"安阳"}
     * 如果不加@RequestBody 注解的话，参数应该是application/x-www-form-urlencode，默认类型
     * 示例：cityName=安阳&specailname=98
     * @param city
     * @return
     */
    @PostMapping("update")
    public HttpResult update(@RequestBody City city){
        City result=  cityService.update(city);
        if(result==null){
            HttpResult.error("修改城市信息失败！！！");
        }
        return HttpResult.ok("修改城市信息成功");
    }

    @RequestMapping("queryAllByLimit")
    public HttpResult queryAllByLimit(int offset, int limit){
        return HttpResult.ok(cityService.queryAllByLimit(offset,limit));
    }

    @GetMapping("/search")
    public HttpResult search(int pageNum, int pageSize, City city){
        return HttpResult.ok(cityService.search(pageNum,pageSize,city));
    }
    @GetMapping("/findAll")
    public HttpResult findAll(){
        List<City> cities = cityService.findAll();
        return HttpResult.ok(cities);
    }
    /**
     * 用了路径参数
     * 方法里从路径获取参数，必须使用@PathVariable
     *  示例：http://localhost:8888/city/deleteById/100
     *  请求方法delete
     * @param id
     * @return
     */
    @DeleteMapping("/deleteById/{id}")
    public HttpResult search(@PathVariable Integer id){
        return HttpResult.ok(cityService.deleteById(id));
    }

}