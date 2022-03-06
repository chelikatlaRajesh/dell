package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserdeatailsService implements UserDetailsService {
	
	@Autowired
	private Irepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Optional<user>u=	repo.findbyusername(username);
System.out.println(u);
//	if(u.isPresent()) {
//	user d=u.get();
//		System.out.println(d);
//	}else {
//		 throw new UsernameNotFoundException("not found");
//	}
	

	u.orElseThrow(()->new UsernameNotFoundException("not found"));

	return u.map(MyuserDetails::new).get();
	
	}

}
