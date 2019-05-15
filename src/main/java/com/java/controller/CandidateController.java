package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.Candidate;
import com.java.service.CandidateService;

@RestController
@RequestMapping("/candidates")
@CrossOrigin(origins="*")
public class CandidateController {
	@Autowired CandidateService service;
	
	@GetMapping
	public Page<Candidate> getAllCandidates(@RequestParam(defaultValue="0") int page) {
		return service.getAllCandidates(page);
	}
	
	@GetMapping("/{id}")
	public Candidate getCandidateById(@PathVariable int id) {
		return service.getCandidateById(id);
	}
	
	@PostMapping
	public void addCandidate(@RequestBody Candidate candidate) {
		service.addCandidate(candidate);
	}
}
