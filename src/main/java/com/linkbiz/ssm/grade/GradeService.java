package com.linkbiz.ssm.grade;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface GradeService {
	
	public void addGrade(Grade grade);
	
	List<Grade> findAll();

}
