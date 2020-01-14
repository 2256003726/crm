package com.briup.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.crm.bean.SalChance;
import com.briup.crm.bean.SalPlan;
import com.briup.crm.dao.SalChanceMapper;
import com.briup.crm.dao.SalPlanMapper;
import com.briup.crm.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{

	@Autowired
	private SalPlanMapper planMapper;
	@Autowired
	private SalChanceMapper chanceMapper;
	
	@Override
	public void savePlan(SalPlan plan, Long chcId) {	
		//根据chanceId查询对应的销售商机
		SalChance chance = chanceMapper.selectByPrimaryKey(chcId);	
		//状态改为：正在开发
		chance.setChcStatus(2);
		chanceMapper.updateByPrimaryKey(chance);
		plan.setPlaChcId(chcId);
		planMapper.insertSelective(plan);
	
	}
	
	//添加或修改
	@Override
	public void addOrUpdatePlan(SalPlan plan, Long chcId) {
		plan.setPlaChcId(chcId);
		if(plan.getPlaId() == null) {
			planMapper.insertSelective(plan);
		} else {
			planMapper.updateByPrimaryKey(plan);
		}
		
	}

	//根据plaId查找plan
	@Override
	public SalPlan findPlanById(Long plaId) {
		SalPlan plan = planMapper.selectByPrimaryKey(plaId);
		return plan;
	}

	//根据plaId删除plan
	@Override
	public void deletePlanById(Long plaId) {
		planMapper.deleteByPrimaryKey(plaId);
	}

	//开发成功
	@Override
	public void updateChanceById(Long chcId) {
		SalChance chance = chanceMapper.selectByPrimaryKey(chcId);
		chance.setChcStatus(3);
		System.out.println(chance);
		chanceMapper.updateByPrimaryKey(chance);
	}

}
