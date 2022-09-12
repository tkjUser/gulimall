package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tkj
 * @email 302994@163.com
 * @date 2022-09-20 16:14:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
