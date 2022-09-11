package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserDetailsService {
	@Autowired
	UserDetailsRepository userRepo;
	
	public List<UserDetails> listAll()
	{
	return userRepo.findAll();
	}
	public List<UserDetails> get(String username) {
		return userRepo.findByusername(username);
	}
	public void save(UserDetails user)
	{
		userRepo.save(user);
	}

}


