package com.yxj.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yxj.gulimall.member.entity.MemberLevelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author liuxinle
 * @email liuxinle@gmail.com
 * @date 2021-01-11 17:48:09
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {

    MemberLevelEntity getDefaultLevel();
}
