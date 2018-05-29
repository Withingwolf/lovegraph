package com.withing.lovegraph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DatabaseControll {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping(value = "getUser")
    public List<Map<String,Object>> getUser(){
        String sql  = "select * from lovegragh_user";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
