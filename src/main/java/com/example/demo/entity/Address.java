package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.transaction.Transactional;

import lombok.Data;
@Data
@Entity
@Transactional

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long addressid;
	private String city;
	private String addresstype;
	//@OneToOne(mappedBy="address")
	//private Employee employee;
	
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="emp_id")
	//private Employee emp;
}
