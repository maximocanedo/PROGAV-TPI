package frgp.utn.edu.ar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception  {
    	http
    	.authorizeHttpRequests(authorize ->
    			authorize
    			.antMatchers("/cliente/Prestamos.jsp").hasAnyRole("CLIENT")
    			.antMatchers("/admin/Clientes.jsp").hasAnyRole("ADMIN")
    			.anyRequest().authenticated())
    	.formLogin()
    	.and().logout()
    	.and().sessionManagement();
    	return http.build();
    }
   
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin")
                               .password(passwordEncoder().encode("admin"))
                               .roles("ADMIN")
                               .build());
        manager.createUser(User.withUsername("client")
                               .password(passwordEncoder().encode("client"))
                               .roles("CLIENT")
                               .build());
        return manager;
    }
    
    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }
    
}
