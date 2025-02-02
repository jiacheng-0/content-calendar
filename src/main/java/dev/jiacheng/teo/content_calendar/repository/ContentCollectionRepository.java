package dev.jiacheng.teo.content_calendar.repository;

import dev.jiacheng.teo.content_calendar.model.Content;
import dev.jiacheng.teo.content_calendar.model.Status;
import dev.jiacheng.teo.content_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
	private final List<Content> contentList = new ArrayList<>();

	public ContentCollectionRepository() {
	}

	// findALl
	public List<Content> findAll() {
		return contentList;
	}

	public Optional<Content> findById(Integer id) {
		return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
	}

	@PostConstruct
	public void init() {
		contentList.add(
			new Content(1,
				"First Content",
				"First Content Description",
				Status.PUBLISHED,
				Type.ARTICLE,
				LocalDateTime.now(),
				null,
				""
			)
		);
	}

	public Content save(Content content) {
		this.contentList.add(content);
		return content;
	}
}
