package com.example.ClinicaMedica.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    //Aqui fica a parte da configuração de segurança, como login e autorização.

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .formLogin(configurer -> {
                    configurer.loginPage("/login").permitAll();
                })

                .authorizeHttpRequests(authorize -> {
                    authorize.anyRequest().authenticated();
                }).build();

                //CSRF é utilizado quando a gente esta utilizando a aplicalçao web.
                //      |_ o motivo é para e garantir que foi a própria aplicação que fez a requisição
                //.httpBasic(AbstractHttpConfigurer::disable) //Desabilita a autenticação básica
    }
}
