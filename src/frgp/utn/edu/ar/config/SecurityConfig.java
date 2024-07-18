package frgp.utn.edu.ar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig { // extends WebSecurityConfiguration {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception  {
    	http
			.authorizeHttpRequests(authorizeHttpRequests ->
				authorizeHttpRequests
					.antMatchers("/admin/**").hasRole("ADMIN")
					.antMatchers("/client/**").hasRole("CLIENT")
					.antMatchers("/login").permitAll()
					.anyRequest().authenticated()
			).formLogin(formLoginCustomizer -> 
				formLoginCustomizer
					.loginPage("/login")
					.defaultSuccessUrl("/", true)
					.failureUrl("/login?error=true")				
			).logout(logoutCustomizer ->
				logoutCustomizer
					.logoutUrl("/logout")
					.logoutSuccessUrl("/login?logout=true")
					.invalidateHttpSession(true)
					.deleteCookies("JSESSIONID")
			).sessionManagement(sessionManagementCustomizer -> 
				sessionManagementCustomizer
					.sessionFixation().migrateSession()
					.invalidSessionUrl("/login?session=invalid")
					.maximumSessions(1)
					.expiredUrl("/login?session=expired")
			);
		return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin")
                               .password(passwordEncoder().encode("adminpass"))
                               .roles("ADMIN")
                               .build());
        manager.createUser(User.withUsername("client")
                               .password(passwordEncoder().encode("clientpass"))
                               .roles("CLIENT")
                               .build());
        return manager;
    }
}
