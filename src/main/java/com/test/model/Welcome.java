package com.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "welcome")
public class Welcome {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	private String Welcome;
}
