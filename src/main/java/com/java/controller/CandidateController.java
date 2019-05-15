package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.Candidate;
import com.java.service.CandidateService;

@RestController
@RequestMapping("/candidates")
@CrossOrigin(origins="*")
public class CandidateController {
	@Autowired CandidateService service;
	
	 
	// GET Request: Returns a list of all candidates in the database
	// Endpoint http://localhost:8890/candidates
	@GetMapping
	public List<Candidate> getAllCandidates() {
		return service.getAllCandidates();
	}
	
	// GET Request: Returns a candidate based on integer id passed in the uri
	// Endpoint: http://localhost:8890/candidates/1
	@GetMapping("/{id}")
	public Candidate getCandidateById(@PathVariable int id) {
		return service.getCandidateById(id);
	}
	
	// POST Request: Inserts a candidate into the database
	// Endpoint: http://localhost:8890/candidates
	@PostMapping
	public void addCandidate(@RequestBody Candidate candidate) {
		service.addCandidate(candidate);
	}
}
