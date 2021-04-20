package com.yxj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.yxj.gulimall.common.utils.PageUtils;
import com.yxj.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.yxj.gulimall.product.vo.SkuItemSaleAttrVo;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-16 17:22:14
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuItemSaleAttrVo> getSaleAttrsBySpuId(Long spuId);

    List<String> getSkuSaleAttrValuesAsStringList(Long skuId);
}

