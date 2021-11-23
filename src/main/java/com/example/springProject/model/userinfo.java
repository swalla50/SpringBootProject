package com.example.springProject.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

@Document(collection = "userinfo")
public class userinfo {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
}