package com.lcb404.mapper;

import java.util.List;

import com.lcb404.command.HrVO;
import com.lcb404.utill.Criteria;

public interface HrMapper {
	public void regist(HrVO hrVO);
	public List<HrVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
	public HrVO getContent(int hrtno);
	public int getUpdate(HrVO vo);
	public int getDelete(int hrtno);
}
