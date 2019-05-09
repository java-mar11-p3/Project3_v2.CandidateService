package com.java.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Candidate {
	@Id
	@GeneratedValue
	int candidate_id;
	String firstName;
	String lastName;
	String email;
}
