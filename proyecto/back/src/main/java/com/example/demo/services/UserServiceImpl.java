package com.example.demo.services;

import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.models.User;
import com.example.demo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserRepository userRepository;
    @Override
    public User save(User u) {
        userRepository.save(u);
        return u;
    }

    @Override
    public void deleteById(Long id) {

        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public boolean existById(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public void updateById(User u) {
        User u2 = userRepository.findById(u.getId()).orElseThrow(() -> new UserNotFoundException("User Not Found"));
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
    }
}
