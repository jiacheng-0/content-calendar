package dev.jiacheng.teo.content_calendar.controller;

import dev.jiacheng.teo.content_calendar.model.Content;
import dev.jiacheng.teo.content_calendar.repository.ContentCollectionRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@CrossOrigin
public class ContentController {


	private final ContentCollectionRepository repository;

	@Autowired
	public ContentController(ContentCollectionRepository repository) {
		this.repository = repository;
	}

	// make a request to final all the pieces of content in the system
	@RequestMapping("")
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
	public Content create(@Valid @RequestBody Content content) {
		return repository.save(content);
	}

	// update method below
	@PutMapping("/{id}")
	public Content update(@PathVariable Integer id, @RequestBody Content content) {
		
		// Content existingContent = repository.findById(id).orElseThrow(()->
		// 		new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));

		if (!repository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
		}

		return repository.save(content);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!repository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
		}
		repository.deleteById(id);
	}

}
