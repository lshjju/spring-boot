package jinuk.project5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf) -> csrf.disable());
        http.authorizeHttpRequests((authorize) ->
                authorize.requestMatchers("/**").permitAll()
        );

        http.formLogin((formLogin) -> formLogin.loginPage("/login")
                .defaultSuccessUrl("/")
//                .failureUrl("/fail")
        );
        http.logout(logout -> logout.logoutUrl("/logout"));

        return http.build();
    }
}



///////////////////////////////////
package jinuk.project4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf) -> csrf.disable());
        http.authorizeHttpRequests((authorize) ->
                authorize.requestMatchers("/**").permitAll()
        );
        return http.build();
    }
}



///////////////////////////////////
@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  } 
  
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
// csrf 켜기
//     http.csrf(csrf -> csrf.csrfTokenRepository(csrfTokenRepository())
//        .ignoringRequestMatchers("/login")
// );    
    
    http.csrf((csrf) -> csrf.disable());
    http.authorizeHttpRequests((authorize) ->
         authorize.requestMatchers("/**").permitAll()
    );
    http.formLogin((formLogin) 
                   -> formLogin.loginPage("/login")
                    .defaultSuccessUrl("/")
    ); 
    http.logout(logout -> logout.logoutUrl("/logout"))


    
    return http.build();
  }
}

//////////////////////////////
package com.apple.shop;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  } 
  
// csrf 켜기
  // @Bean
  // public CsrfTokenRepository csrfTokenRepository() {
  //   HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
  //   repository.setHeaderName("X-XSRF-TOKEN");
  //   return repository;
  // }  
  
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
// csrf 켜기
    //     http.csrf(csrf -> csrf.csrfTokenRepository(csrfTokenRepository())
//        .ignoringRequestMatchers("/login")
// )
    
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
