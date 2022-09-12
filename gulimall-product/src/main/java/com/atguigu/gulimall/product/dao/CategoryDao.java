package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tkj
 * @email 302994@163.com
 * @date 2022-09-19 16:15:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
