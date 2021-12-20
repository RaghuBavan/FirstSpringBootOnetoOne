package com.example.demo.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;

@Entity
@Transactional
@Table(name="employee_details")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private Long empId;
	private String empName;
	private Integer empAge;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="fk_ad_id")
	//@OneToMany(cascade=CascadeType.ALL,mappedBy="address")
	//@JoinColumn(name="fk_ad_id",referencedColumnName="emp_id")
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Address> address;
}
