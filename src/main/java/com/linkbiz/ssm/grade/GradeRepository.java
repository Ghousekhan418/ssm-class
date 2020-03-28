package com.linkbiz.ssm.grade;

import javax.transaction.Transactional;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface GradeRepository extends CrudRepository<Grade, Long>{

}
