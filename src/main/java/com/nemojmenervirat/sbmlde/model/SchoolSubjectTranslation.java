package com.nemojmenervirat.sbmlde.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class SchoolSubjectTranslation {

	@EmbeddedId
	private SchoolSubjectTranslationId schoolSubjectTranslationId;
	private String name;
	private String description;

	public SchoolSubjectTranslationId getSchoolSubjectTranslationId() {
		return schoolSubjectTranslationId;
	}

	public void setSchoolSubjectTranslationId(SchoolSubjectTranslationId schoolSubjectTranslationId) {
		this.schoolSubjectTranslationId = schoolSubjectTranslationId;
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
