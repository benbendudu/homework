package com.geektime.springbucks.controller;

import com.geektime.springbucks.mapper.CoffeeMapper;
import com.geektime.springbucks.mapper.CoffeeOrderMapper;
import com.geektime.springbucks.model.Coffee;
import com.geektime.springbucks.model.CoffeeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeMapper coffeeMapper;

    @Autowired
    private CoffeeOrderMapper coffeeOrderMapper;

    @GetMapping(value ="/all",produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<Coffee> getAll() {
        return coffeeMapper.find();
    }

    @GetMapping(value ="/order",produces = "application/xml;charset=utf-8")
    @ResponseBody
    public CoffeeOrder getorder() {
        return coffeeOrderMapper.findone("colin");
    }
}
