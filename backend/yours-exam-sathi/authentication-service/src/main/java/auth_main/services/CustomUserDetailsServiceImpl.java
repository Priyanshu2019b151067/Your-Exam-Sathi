package auth_main.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import auth_main.models.User;
import auth_main.repos.UserRepository;
import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
//public class CustomUserDetailsServiceImpl implements UserDetailsService {
//
////	private final UserRepository userRepository;
////	
////	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		User user  = userRepository.findByUserName(username);
////		return null;
////	}
//
//}
