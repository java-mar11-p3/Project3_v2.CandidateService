package com.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.dto.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	
}
