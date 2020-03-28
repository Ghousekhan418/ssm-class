package com.linkbiz.ssm.grade;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GradeServiceimpl implements GradeService {

	@Autowired
	private GradeRepository gradeRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.linkbiz.ssm.service.GradeService#addGrade(com.linkbiz.ssm.model.Grade)
	 */
	public void addGrade(Grade grade) {
		gradeRepository.save(grade);
	}
	
	@Override
	public List<Grade> findAll() {
		 
		return (List<Grade>)gradeRepository.findAll();
	}
}
