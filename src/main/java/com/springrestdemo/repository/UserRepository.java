package com.springrestdemo.repository;

import com.springrestdemo.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("alex".equals(user) && "qwe".equals(password)){
            return Arrays.asList(Authorities.DELETE, Authorities.WRITE);
        }
        return null;
    }
}