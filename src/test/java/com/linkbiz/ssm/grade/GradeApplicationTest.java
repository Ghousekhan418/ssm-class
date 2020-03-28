package com.linkbiz.ssm.grade;

import java.math.BigDecimal;
import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.linkbiz.ssm.model.Amount;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GradeApplicationTest {

	@Test
	public void createClass() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8103/grade/add";
		
		 
		for( int i =1; i<=10;i++)
		{
			Grade grade = new Grade();

			grade.setSchool("243242342342342342342343"+i);
			grade.setClassName("Fifth class");
			grade.setNumericName(Integer.toString(i));
			grade.setTeacher("234234234234"+i);
			Amount amount = new Amount(new BigDecimal("12"), "EUR");
			grade.setMonthlyTuitionFee(amount);
			grade.setAdmissionFee(amount);
			grade.setExamFee(amount);
			grade.setCertificateFee(amount);
			grade.setNote("Testing.....");

			HttpEntity<Grade> requestEntity = new HttpEntity<Grade>(grade, headers);
			restTemplate.postForLocation(url, requestEntity);
		}
		
	}
}
