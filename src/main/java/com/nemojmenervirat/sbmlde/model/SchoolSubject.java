package com.nemojmenervirat.sbmlde.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SchoolSubject {

	@Id
	private Long schoolSubjectId;
	private Integer difficulty;
	private String name;
	private String description;

	public SchoolSubject() {
	}

	public SchoolSubject(Long schoolSubjectId, Integer difficulty, String name, String description) {
		this.schoolSubjectId = schoolSubjectId;
		this.difficulty = difficulty;
		this.name = name;
		this.description = description;
	}

	public Long getSchoolSubjectId() {
		return schoolSubjectId;
	}

	public void setSchoolSubjectId(Long schoolSubjectId) {
		this.schoolSubjectId = schoolSubjectId;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
