package com.example.demo;

import com.example.demo.models.User;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ModelTest {
    @Autowired
    User u;
    private User LoadData(){
        Date d =  new Date();
        User u = new User(1L,"brian","schueris","actis",d,12L,40310340L,"masculino","Argentina","Santa Fe","rafaela","tomi","bschueris","admin1234");
        return u;
    }

    @Test
    void shouldValidateUserParameters(){
        User u = LoadData();
        User u2 = new User();
        u2.setId(u.getId());
        u2.setAddress(u.getAddress());
        u2.setBirthDate(u.getBirthDate());
        u2.setCity(u.getCity());
        u2.setCountry(u.getCountry());
        u2.setDNI(u.getDNI());
        u2.setGender(u.getGender());
        u2.setLastName(u.getLastName());
        u2.setName(u.getName());
        u2.setState(u.getState());
        u2.setUserName(u.getUserName());
        u2.setPassword(u.getPassword());
        u2.setDescription(u.getDescription());
        u2.setNumber(u.getNumber());
        assertEquals(u,u2);

    }
}
