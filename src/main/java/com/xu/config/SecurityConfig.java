package com.xu.config;

import com.xu.Service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsServiceImpl userDetails;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    //授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //主页任何人都可以访问，但是功能页只有对应权限的人才能访问
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/back/**").hasRole("root");


        //返回首页
        http.formLogin().loginPage("/jmp/login").loginProcessingUrl("/login");
        http.csrf().disable();
//        //注销功能
        http.formLogin().failureForwardUrl("/jmp/error");

        http.rememberMe().rememberMeParameter("remeber");

        http.logout().logoutSuccessUrl("/jmp/login");

    }

    //认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetails).passwordEncoder(new BCryptPasswordEncoder());
    }
}
