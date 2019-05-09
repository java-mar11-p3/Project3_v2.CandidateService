package com.java.service;

import java.util.List;

import com.java.dto.Candidate;

public interface CandidateService {
	public List<Candidate> getAllCandidates();
	public Candidate getCandidateById(int id);
	public void addCandidate(Candidate candidate);
}
