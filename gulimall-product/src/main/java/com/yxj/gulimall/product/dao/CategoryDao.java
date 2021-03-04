package com.yxj.gulimall.product.dao;

import com.yxj.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-16 17:22:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
