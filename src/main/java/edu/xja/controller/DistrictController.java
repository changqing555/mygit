package edu.xja.controller;

import edu.xja.entity.District;
import edu.xja.service.DistrictService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (District)表控制层
 *
 * @author makejava
 * @since 2020-07-26 17:28:56
 */
@RestController
@RequestMapping("district")
public class DistrictController {
    /**
     * 服务对象
     */
    @Resource
    private DistrictService districtService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public District selectOne(Integer id) {
        return this.districtService.queryById(id);
    }

}