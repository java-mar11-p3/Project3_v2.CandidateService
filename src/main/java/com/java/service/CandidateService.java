package com.java.service;

import org.springframework.data.domain.Page;

import com.java.dto.Candidate;

public interface CandidateService {
	public Page<Candidate> getAllCandidates(int page);
	public Candidate getCandidateById(int id);
	public void addCandidate(Candidate candidate);
}
