package edu.xja.service.impl;

import edu.xja.BaseTest;
import edu.xja.service.CityService;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class CityServiceImplTest extends BaseTest {
    @Resource
    private CityService cityService;

    @Test
    public void findAll() {
        cityService.findAll();
    }
}