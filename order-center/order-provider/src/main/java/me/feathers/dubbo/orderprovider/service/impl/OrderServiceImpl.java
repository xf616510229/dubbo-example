package me.feathers.dubbo.orderprovider.service.impl;

import me.feathers.dubbo.orderapi.dto.AddOrderReq;
import me.feathers.dubbo.orderapi.dto.QueryOrderByIdReq;
import me.feathers.dubbo.orderapi.dto.QueryOrderByIdResp;
import me.feathers.dubbo.orderapi.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author Feahters
 * @date 2019/3/20
 * @version 1.0
 */
//@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Override
    public void addOrder(AddOrderReq req) {
        System.out.println("添加了一个订单" + req);
    }

    @Override
    public QueryOrderByIdResp queryOrderById(QueryOrderByIdReq req) {
        QueryOrderByIdResp resp = new QueryOrderByIdResp();
        resp.setId(req.getOrderId());
        resp.setUsername("张三");
        resp.setMoney(10.5);
        resp.setNum(1);
        resp.setProductName("扫把");
        resp.setCreateTime("2018-01-01");
        return resp;
    }
}
