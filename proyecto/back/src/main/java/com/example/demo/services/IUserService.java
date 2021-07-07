package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserService {
    public User save(User u);
    public void deleteById(Long id);
    public List<User> getAll();
    public User getById(Long id);
    public boolean existById(Long id);
    public void updateById(User u);

}
