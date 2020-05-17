package com.nemojmenervirat.sbmlde.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolSubjectTranslationId implements Serializable {

	private Long schoolSubjectId;
	private String languageId;

	public SchoolSubjectTranslationId(Long schoolSubjectId, String languageId) {
		this.schoolSubjectId = schoolSubjectId;
		this.languageId = languageId;
	}

	public Long getSchoolSubjectId() {
		return schoolSubjectId;
	}

	public void setSchoolSubjectId(Long schoolSubjectId) {
		this.schoolSubjectId = schoolSubjectId;
	}

	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

}
