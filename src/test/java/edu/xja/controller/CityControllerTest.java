package edu.xja.controller;

import edu.xja.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import java.awt.*;

import static org.junit.Assert.*;

public class CityControllerTest extends BaseTest {

    @Resource
    private WebApplicationContext wac;

    private MockMvc mockMoc;

    @Before
    public void setUp() {
        mockMoc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void selectOne() throws Exception {
        mockMoc.perform(MockMvcRequestBuilders.get("/city/selectOne?id=1")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void add() {
    }

    @Test
    public void updateFlag() {
    }

    @Test
    public void queryAllByLimit() {
    }
}