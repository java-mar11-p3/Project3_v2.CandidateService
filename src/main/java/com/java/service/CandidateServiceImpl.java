package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.CandidateDao;
import com.java.dto.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService{

	@Autowired CandidateDao rep;
	
	@Override
	public List<Candidate> getAllCandidates() {
		return rep.findAll();
	}

	@Override
	public Candidate getCandidateById(int id) {
		return rep.findById(id).get();
	}

	@Override
	public void addCandidate(Candidate candidate) {
		rep.save(candidate);
	}

}
