package com.java.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.dao.CandidateDao;
import com.java.dto.Candidate;

@RunWith(SpringRunner.class)
public class CandidateServiceTest {
	@TestConfiguration
	static class TestConfig {
		@Bean
		public CandidateService candidateService() {
			return new CandidateServiceImpl();
		}
	}
	
	@Autowired CandidateService service;
	@MockBean CandidateDao rep;
	
	@Test
	public void getCandidateByIdTest() {
		Candidate candidate = new Candidate();
		candidate.setCandidate_id(1);
		candidate.setEmail("emal@email.com");
		candidate.setFirstName("Johnny");
		candidate.setLastName("Tran");
		Mockito.when(rep.findById(1)).thenReturn(Optional.of(candidate));
		Candidate candidate2 = service.getCandidateById(1);
		assertNotNull(candidate2);
		assertEquals(1, candidate2.getCandidate_id());
	}
	
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
		
		/*Mockito.when(rep.findAll()).thenReturn(list);
		List<Candidate> list2 = service.getAllCandidates();
		assertNotNull(list2);
		assertEquals(1, list2.get(0).getCandidate_id());
		assertEquals(2, list2.get(1).getCandidate_id());*/
	}
}
