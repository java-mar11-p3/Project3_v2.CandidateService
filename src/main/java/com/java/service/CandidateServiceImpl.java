package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.java.dao.CandidateDao;
import com.java.dto.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	CandidateDao rep;

	@Override
	public Page<Candidate> getPaginatedCandidates(int page) {
		return rep.findAll(PageRequest.of(page, 5));
	}

	@Override
	public Candidate getCandidateById(int id) {
		Optional<Candidate> candidate = rep.findById(id);
		if(candidate.isPresent())
			return candidate.get();
		else {
			return null;
		}
	}

	@Override
	public void addCandidate(Candidate candidate) {
		rep.save(candidate);
	}

	@Override
	public List<Candidate> getAllCandidates() {
		return rep.findAll();
	}
}
