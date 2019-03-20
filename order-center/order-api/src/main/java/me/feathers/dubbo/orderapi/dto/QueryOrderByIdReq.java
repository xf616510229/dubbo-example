package me.feathers.dubbo.orderapi.dto;

import lombok.Data;
import me.feathers.dubbo.orderapi.dto.base.BaseDto;

import java.io.Serializable;

/**
 * @author Feahters
 * @date 2019/3/20
 */
@Data
public class QueryOrderByIdReq extends BaseDto {
    private long orderId;
}
