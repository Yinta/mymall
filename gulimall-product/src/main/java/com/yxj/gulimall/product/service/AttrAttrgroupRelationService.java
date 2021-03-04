package com.yxj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxj.common.utils.PageUtils;
import com.yxj.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.yxj.gulimall.product.vo.AttrGroupRelatinVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-16 17:22:14
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrGroupRelatinVo> vos);
}

