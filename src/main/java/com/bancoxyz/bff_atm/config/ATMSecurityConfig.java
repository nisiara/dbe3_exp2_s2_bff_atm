package com.bancoxyz.bff_atm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ATMSecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
      .csrf(csrf -> csrf.disable())
      .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
      .httpBasic(Customizer.withDefaults()); // Usar Customizer para configuración por defecto
    return http.build();
}

@Bean
public UserDetailsService userDetailsService() {
  UserDetails user = User.builder()
    .username("user")
    .password("{noop}password") // Se recomienda usar PasswordEncoder, pero {noop} es útil para pruebas
    .roles("USER")
    .build();
  return new InMemoryUserDetailsManager(user);
}


  
}
