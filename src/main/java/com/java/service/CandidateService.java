package com.java.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.java.dto.Candidate;

public interface CandidateService {
	public List<Candidate> getAllCandidates();
	public Page<Candidate> getPaginatedCandidates(int page);
	public Candidate getCandidateById(int id);
	public void addCandidate(Candidate candidate);
}
