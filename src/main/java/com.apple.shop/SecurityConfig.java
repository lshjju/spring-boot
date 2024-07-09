package com.apple.shop;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  } 

  
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.csrf((csrf) -> csrf.disable());
    http.authorizeHttpRequests((authorize) ->
        authorize.requestMatchers("/**").permitAll()
    );

    http.formLogin((formLogin) 
                   -> formLogin.loginPage("/login")
                    .defaultSuccessUrl("/")
                    // .failureUrl("/fail")
    ); 
    http.logout(logout -> logout.logoutUrl("/logout"))
    
    return http.build();
  }

}
