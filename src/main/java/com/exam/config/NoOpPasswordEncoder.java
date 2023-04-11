//package com.exam.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//
//public class NoOpPasswordEncoder implements PasswordEncoder {
//    public static final PasswordEncoder INSTANCE = new NoOpPasswordEncoder();
//
//    public NoOpPasswordEncoder() {
//    }
//
//    @Override
//    public String encode(CharSequence rawPassword) {
//        return rawPassword.toString();
//    }
//
//    @Override
//    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        return rawPassword.toString().equals(encodedPassword);
//    }
//
//    /**
//     * Get the singleton {@link NoOpPasswordEncoder}.
//     */
//    public static PasswordEncoder getInstance() {
//        return INSTANCE;
//    }
//}
