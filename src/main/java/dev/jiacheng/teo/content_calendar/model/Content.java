package dev.jiacheng.teo.content_calendar.model;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record Content (
	// id, title, desc,status,contentType, dateCreated, dateUpdated, url
	Integer id,
	@NotEmpty
	String title,
	String desc,
	Status status,
	Type contentType,
	LocalDateTime dateCreated,
	LocalDateTime dateUpdated,
	String url
) {
	
}
