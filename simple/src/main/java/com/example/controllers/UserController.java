/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.controllers;

import java.util.Collections;
import java.util.Map;

import com.example.SocialApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

//@SpringBootApplication
//@RestController
//public class UserController  {
//
//    @RequestMapping("/user")
//    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
//        return Collections.singletonMap("name", principal.getAttribute("name"));
//    }
//
////    @RequestMapping("/test",method = RequestMethod.GET)
//    @GetMapping("/login/oauth2/code/pingidentity/")
//    public String test() {
//        return "hi";
//    }
//    @GetMapping("/test")
//    public String test3() {
//        return "hi";
//    }
//
//    @GetMapping("/error")
//    public String test2(@RequestParam String code, OAuth2User principal) {
//        return "hi";
//    }
//
//
//
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        // @formatter:off
////        http
////                .authorizeRequests(a -> a
////                        .antMatchers("/", "/error", "/webjars/**").permitAll()
////                        .anyRequest().authenticated()
////                )
////                .exceptionHandling(e -> e
////                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
////                )
////
////                .oauth2Login();
////        // @formatter:on
////    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(SocialApplication.class, args);
//    }
//
//}