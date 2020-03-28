package com.linkbiz.ssm.grade;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class GradeController {

	@Autowired
	private GradeService gradeService;

	@PostMapping("/grade/add")
	public void addClass(@RequestBody Grade grade) {

		gradeService.addGrade(grade);
	}

	@GetMapping("/grade/list")
	public ResponseEntity<List<Grade>> list() {

		return new ResponseEntity<List<Grade>>(gradeService.findAll(), HttpStatus.OK);
	}

}
