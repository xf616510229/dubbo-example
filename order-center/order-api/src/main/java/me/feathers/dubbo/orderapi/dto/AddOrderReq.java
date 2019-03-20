package me.feathers.dubbo.orderapi.dto;

import lombok.Data;
import me.feathers.dubbo.orderapi.dto.base.BaseDto;

/**
 * @author Feahters
 * @date 2019/3/20
 */
@Data
public class AddOrderReq extends BaseDto {

    private String username;
    private String productCode;
    private String productName;
    private double money;
    private long num;
    private String createTime;
    
}
