package com.example.springProject.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springProject.model.userinfo;
import com.example.springProject.repository.userinfoRepository;


@RestController
public class userinfoController {
	
	@Autowired
	private userinfoRepository repository;
	
	@PostMapping("/addUser")
	public String saveUsers(@RequestBody userinfo users){
		repository.save(users);
		return "Added User: " + users.getId();
	}
	
	@GetMapping("/findAllUsers")
	public List<userinfo> getUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllUsers/{id}")
	public Optional<userinfo> getUsers(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUsers(@PathVariable int id) {
		repository.deleteById(id);
		return "Useer deleted with id: " + id;
	}
}
