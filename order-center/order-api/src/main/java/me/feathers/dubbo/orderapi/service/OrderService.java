package me.feathers.dubbo.orderapi.service;

import me.feathers.dubbo.orderapi.dto.AddOrderReq;
import me.feathers.dubbo.orderapi.dto.QueryOrderByIdReq;
import me.feathers.dubbo.orderapi.dto.QueryOrderByIdResp;

/**
 * 订单相关接口
 * @author Feahters
 * @date 2019/3/20
 */
public interface OrderService {

    void addOrder(AddOrderReq req);

    QueryOrderByIdResp queryOrderById(QueryOrderByIdReq req);
}
