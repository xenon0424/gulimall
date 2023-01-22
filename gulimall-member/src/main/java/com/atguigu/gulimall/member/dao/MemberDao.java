package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xenon
 * @email 768527756@qq.com
 * @date 2023-01-22 14:39:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
