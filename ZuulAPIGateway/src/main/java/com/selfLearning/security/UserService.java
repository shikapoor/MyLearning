package com.selfLearning.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.selfLearning.bean.auth.Role;
import com.selfLearning.bean.auth.User;
import com.selfLearning.repository.UserRepository;


@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user =  userRepository.findByEmail(email);
		 if (user == null || user.getRole() == null || user.getRole().isEmpty()) {
	            throw new UsernameNotFoundException("Invalid Email ID.");
	        }
		 String [] authorities = new String[user.getRole().size()];
	        int count=0;
	        for (Role role : user.getRole()) {
	          
	            authorities[count] = "ROLE_"+role.getRole();
	            count++;
	        }
	        UserDtls userDetails = new UserDtls(user.getEmail(),user.getPassword(),user.getActive(),
	                user.isLoacked(), user.isExpired(),user.isEnabled(),authorities);
	        
	        return userDetails;
	}

}
