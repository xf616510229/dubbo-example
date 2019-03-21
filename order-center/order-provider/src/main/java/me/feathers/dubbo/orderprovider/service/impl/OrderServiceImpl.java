package me.feathers.dubbo.orderprovider.service.impl;

import me.feathers.dubbo.orderapi.dto.AddOrderReq;
import me.feathers.dubbo.orderapi.dto.QueryOrderByIdReq;
import me.feathers.dubbo.orderapi.dto.QueryOrderByIdResp;
import me.feathers.dubbo.orderapi.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author Feahters
 * @version 1.0
 * @date 2019/3/20
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
        QueryOrderByIdResp.QueryOrderByIdRespData data 
                = new QueryOrderByIdResp.QueryOrderByIdRespData();
        data.setId(req.getOrderId());
        data.setUsername("张三");
        data.setMoney(10.5);
        data.setNum(1);
        data.setProductName("扫把");
        data.setCreateTime("2018-01-01");
        resp.setData(data);

        return resp;
    }
}
