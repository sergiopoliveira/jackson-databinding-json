package com.sergio.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
}
