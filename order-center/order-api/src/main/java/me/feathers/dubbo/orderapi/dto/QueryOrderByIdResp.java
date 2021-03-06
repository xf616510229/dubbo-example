package me.feathers.dubbo.orderapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import me.feathers.dubbo.orderapi.dto.base.BaseReq;

/**
 * @author Feahters
 * @date 2019/3/20
 */
@Setter
@Getter
public class QueryOrderByIdResp extends BaseReq {

    private long id;
    private String username;
    private String productCode;
    private String productName;
    private double money;
    private long num;
    private String createTime;
}
