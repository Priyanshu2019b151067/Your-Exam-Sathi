package auth_main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration  {
	
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		  http
		  .csrf(csrf -> csrf.disable())
          .authorizeHttpRequests(authorize -> authorize
              .requestMatchers("/api/auth/**").permitAll() 
//               Allow public access to specific endpoints
//              .requestMatchers("/api/premium/**").hasRole("PREMIUM") // Restrict access to users with 'PREMIUM' role
              .anyRequest().authenticated() // Require authentication for any other request
          );
        return http.build();
    }
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
