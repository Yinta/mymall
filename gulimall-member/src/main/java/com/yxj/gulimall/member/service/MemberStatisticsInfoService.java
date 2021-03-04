package com.yxj.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxj.common.utils.PageUtils;
import com.yxj.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-09 20:58:11
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

