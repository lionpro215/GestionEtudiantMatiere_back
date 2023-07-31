// package com.Dimsoft.GestionEtudiantMatiere.config;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// import com.Dimsoft.GestionEtudiantMatiere.services.UserService;
// import com.Dimsoft.GestionEtudiantMatiere.services.UserServiceImpl;

// @Configuration
// public class SecurityConfig {

//     @Bean
//     public UserDetailsService userDetailsService() {
//         return new UserServiceImpl(null);
//     }

//     @Bean
//     public BCryptPasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     /**
//      * @param http
//      * @return
//      * @throws Exception
//      */

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//         http.authorizeHttpRequests((auth) -> auth
//                     .requestMatchers("/user/deleteUser", "/subject/update")
//                     .authenticated()
//         ).httpBasic();


//                 // .csrf()
//                 // .disable()
//                 // .authorizeHttpRequests()
//                 // .requestMatchers("/api/v1/auth/login").permitAll()
//                 // .anyRequest()
//                 // .authenticated()

//                 // http.authorizeRequests().requestMatchers("/login").permitAll()
//                 // .requestMatchers("/users/**", "/settings/**").hasAuthority("Admin")
//                 // .hasAnyAuthority("Admin", "Editor")
//                 // .anyRequest().authenticated()

//                 // .and().formLogin()
//                 // .loginPage("/login")
//                 // .usernameParameter("email")
//                 // .permitAll()
//                 // .and()
//                 // .rememberMe().key("GFjhirnjFGhtjvKOPjth_956823561")
//                 // .and()
//                 // .logout().permitAll();

//         // http.headers().frameOptions().sameOrigin();

//         // http.authenticationProvider(authenticationProvider());

//         return http.build();
//     }


//     // @Override
//     // public void configure(HttpSecurity http) throws Exception{
//     //     http
//     //         .authorizeHttpRequests()
//     //         .antMatchers("/admin").hasRole("ADMIN")
//     //         .antMatchers("/user").hasRole("USER")
//     //         .anyRequest().authenticated()
//     //         .and()
//     //         .formLogin();
//     // }

//     // @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//         auth.inMemoryAuthentication()
//         .withUser("lionpro")
//         .password("lion");
//     }

//     @Bean
//     public WebSecurityCustomizer webSecurityCustomizer() {
//         return (web) -> web.ignoring().requestMatchers("/images/**", "/js/**", "/webjars/**");
//     }

//     @Bean
//     public DaoAuthenticationProvider authenticationProvider() {
//         DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

//         authProvider.setUserDetailsService(userDetailsService());
//         authProvider.setPasswordEncoder(passwordEncoder());

//         return authProvider;
//     }
// }
