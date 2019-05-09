package com.java.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.dto.Candidate;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CandidateDaoTest {
	@Autowired TestEntityManager em;
	@Autowired CandidateDao rep;
	
	@Test
	public void getUserByIdTest() {
		Candidate candidate = new Candidate();
		candidate.setEmail("email@email.com");
		candidate.setFirstName("Johnny");
		candidate.setLastName("Tran");
		//candidate.setCandidate_id(12);
		em.merge(candidate);
		em.flush();
		Candidate c = rep.findById(1).get();
		assertNotNull(c);
		assertEquals(1, c.getCandidate_id());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void findInvalidUserTest() {
		Candidate candidate = rep.findById(1).get();
	}
	
	@Test
	public void getAllCandidatesTest() {
		Candidate candidate1 = new Candidate();
		candidate1.setEmail("email@email.com");
		candidate1.setFirstName("Johnny");
		candidate1.setLastName("Tran");
		
		Candidate candidate2 = new Candidate();
		candidate2.setEmail("john@doe.com");
		candidate2.setFirstName("John");
		candidate2.setLastName("Doe");
		
		em.merge(candidate1);
		em.merge(candidate2);
		em.flush();
		
		List<Candidate> list = rep.findAll();
		assertNotNull(list);
		assertEquals(1, list.get(0).getCandidate_id());
		assertEquals(2, list.get(1).getCandidate_id());		
	}
}
