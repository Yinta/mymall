package com.yxj.gulimall.product.dao;

import com.yxj.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 * 
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-16 17:22:14
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCatogory(@Param("catId") Long catId, @Param("name") String name);
}
