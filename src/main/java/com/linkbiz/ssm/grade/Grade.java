package com.linkbiz.ssm.grade;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.linkbiz.ssm.model.Amount;

@Entity
@Table(name = "Grade")
public class Grade implements Serializable {

	private static final long serialVersionUID = -8290700077294514471L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_grade")
	@SequenceGenerator(name = "seq_grade", sequenceName = "seq_grade")
	private long id;

	@Column(name = "school_id", nullable = false)
	private String school;

	@Column(name = "class_name", nullable = false)
	private String className;

	@Column(name = "numeric_name", nullable = false)
	private String numericName;

	@Column(name = "teacher_id", nullable = false)
	private String teacher;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "amount", column = @Column(name = "monthly_tuition_fee", nullable = false)),
			@AttributeOverride(name = "currency", column = @Column(name = "tuition_fee_cur_code", nullable = false)) })
	private Amount monthlyTuitionFee;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "amount", column = @Column(name = "admission_fee", nullable = false)),
			@AttributeOverride(name = "currency", column = @Column(name = "admission_fee_cur_code", nullable = false)) })
	private Amount admissionFee;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "amount", column = @Column(name = "exam_fee", nullable = false)),
			@AttributeOverride(name = "currency", column = @Column(name = "exam_fee_cur_code", nullable = false)) })
	private Amount examFee;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "amount", column = @Column(name = "certificate_fee", nullable = false)),
			@AttributeOverride(name = "currency", column = @Column(name = "certificate_fee_cur_code", nullable = false)) })
	private Amount certificateFee;

	@Column(name = "note")
	private String note;

	/**
	 * Default constructor.
	 */
	public Grade() {
		super();
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the numericName
	 */
	public String getNumericName() {
		return numericName;
	}

	/**
	 * @param numericName the numericName to set
	 */
	public void setNumericName(String numericName) {
		this.numericName = numericName;
	}

	/**
	 * @return the teacher
	 */
	public String getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the monthlyTuitionFee
	 */
	public Amount getMonthlyTuitionFee() {
		return monthlyTuitionFee;
	}

	/**
	 * @param monthlyTuitionFee the monthlyTuitionFee to set
	 */
	public void setMonthlyTuitionFee(Amount monthlyTuitionFee) {
		this.monthlyTuitionFee = monthlyTuitionFee;
	}

	/**
	 * @return the admissionFee
	 */
	public Amount getAdmissionFee() {
		return admissionFee;
	}

	/**
	 * @param admissionFee the admissionFee to set
	 */
	public void setAdmissionFee(Amount admissionFee) {
		this.admissionFee = admissionFee;
	}

	/**
	 * @return the examFee
	 */
	public Amount getExamFee() {
		return examFee;
	}

	/**
	 * @param examFee the examFee to set
	 */
	public void setExamFee(Amount examFee) {
		this.examFee = examFee;
	}

	/**
	 * @return the certificateFee
	 */
	public Amount getCertificateFee() {
		return certificateFee;
	}

	/**
	 * @param certificateFee the certificateFee to set
	 */
	public void setCertificateFee(Amount certificateFee) {
		this.certificateFee = certificateFee;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

}
