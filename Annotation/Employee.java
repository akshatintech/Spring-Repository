package com.springcore.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Address address;
	
	@Autowired
	@Qualifier("address2")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Inside the setter");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee(Address address) {
		
		super();
		System.out.println("Inside constructor");
		this.address = address;
	}
 
}
