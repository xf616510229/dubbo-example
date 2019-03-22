package me.feathers.dubbo.productapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import me.feathers.dubbo.productapi.dto.base.BaseResp;

@Setter
@Getter
public class QueryProductByCodeResp extends BaseResp {

    private long id;
    private String productCode;
    private String productName;
    private double money;
    private long stock;
    private String updateTime;
    private String createTime;

}
