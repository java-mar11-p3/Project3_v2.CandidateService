package com.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.java.dto.Candidate;
import com.java.service.CandidateService;

@RunWith(SpringRunner.class)
@WebMvcTest(CandidateController.class)
public class CandidateControllerTest {
	@MockBean CandidateService service;
	@Autowired MockMvc mvc;
	
	@Test
	public void getAllCandidatesTest() {
		Candidate candidate = new Candidate();
		candidate.setCandidate_id(1);
		candidate.setEmail("emal@email.com");
		candidate.setFirstName("Johnny");
		candidate.setLastName("Tran");
		
		Candidate candidate1 = new Candidate();
		candidate1.setCandidate_id(2);
		candidate1.setEmail("john@doe.com");
		candidate1.setFirstName("John");
		candidate1.setLastName("Doe");
		
		List<Candidate> list = new ArrayList<Candidate>();
		list.add(candidate);
		list.add(candidate1);
		
		Mockito.when(service.getAllCandidates()).thenReturn(list);
	}
	
}
