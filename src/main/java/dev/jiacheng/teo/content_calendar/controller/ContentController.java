package dev.jiacheng.teo.content_calendar.controller;

import dev.jiacheng.teo.content_calendar.model.Content;
import dev.jiacheng.teo.content_calendar.repository.ContentCollectionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {


	private final ContentCollectionRepository repository;

	@Autowired
	public ContentController(ContentCollectionRepository repository) {
		this.repository = repository;
	}

	// make a request to final all the pieces of content in the system
	@RequestMapping("/all")
	public List<Content> findAll() {
		return repository.findAll();
	}

	// make a request to find a piece of content by its id
	@GetMapping("/{id}")
	public Content findById(@PathVariable Integer id) {
		return repository.findById(id).orElseThrow(()->
				new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("")
	public Content create(@RequestBody Content content) {
		return repository.save(content);
	}

}
