package me.feathers.demo.web.controller;

import me.feathers.dubbo.orderapi.dto.AddOrderReq;
import me.feathers.dubbo.orderapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Feahters
 * @version 1.0
 * @date 2019/3/20
 */
@RestController
public class IndexController {

    @Autowired
    private OrderService orderService;

    /**
     * 购买商品
     *
     * @param username 用户名
     * @param productCode 商品代码
     * @param num       商品数量
     */
    @GetMapping("/buyProduct")
    public String buyProduct(String username, String productCode, Integer num) {
        AddOrderReq req = new AddOrderReq();
        req.setUsername(username);
        req.setProductCode(productCode);
        orderService.addOrder(req);
        return "success";
    }
    
}
