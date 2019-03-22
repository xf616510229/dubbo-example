package me.feathers.dubbo.productprovider.service.impl;

import me.feathers.dubbo.productapi.dto.QueryProductByCodeResp;
import me.feathers.dubbo.productapi.service.ProductService;

/**
 * @author Feahters
 * @version 1.0
 * @date 2019/3/21
 */
public class ProductServiceImpl implements ProductService {
    
    @Override
    public void minusStock(String productCode, Integer num) {
        System.out.println(productCode + "扣除库存成功！！！");
    }

    @Override
    public QueryProductByCodeResp queryProductByCode() {
        QueryProductByCodeResp resp = new QueryProductByCodeResp();
        resp.setId(1L);
        resp.setCreateTime("20190101121212");
        resp.setMoney(10.0);
        resp.setProductCode("pro123");
        resp.setProductName("布娃娃");
        resp.setStock(100);
        return resp;
    }
}
