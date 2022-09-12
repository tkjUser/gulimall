package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tkj
 * @email 302994@163.com
 * @date 2022-09-20 16:35:58
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
