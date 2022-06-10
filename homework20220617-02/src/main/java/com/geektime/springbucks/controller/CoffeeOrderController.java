package com.geektime.springbucks.controller;

import com.geektime.springbucks.controller.request.NewOrderRequest;
import com.geektime.springbucks.model.Coffee;
import com.geektime.springbucks.model.CoffeeOrder;
import com.geektime.springbucks.service.CoffeeOrderService;
import com.geektime.springbucks.service.CoffeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class CoffeeOrderController {
//    @Autowired
//    private CoffeeOrderService orderService;
//    @Autowired
//    private CoffeeService coffeeService;
//
//    @PostMapping("/")
//    @ResponseStatus(HttpStatus.CREATED)
//    public CoffeeOrder create(@RequestBody NewOrderRequest newOrder) {
//        log.info("Receive new Order {}", newOrder);
//        Coffee[] coffeeList = coffeeService.getCoffeeByName(newOrder.getItems())
//                .toArray(new Coffee[] {});
//        return orderService.createOrder(newOrder.getCustomer(), coffeeList);
//    }
}
