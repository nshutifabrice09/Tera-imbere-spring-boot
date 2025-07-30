package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.User;
import com.tsl.Tera_imbere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existUser = userRepository.findUserById(id);
        if(existUser != null){
            existUser.setFirstName(user.getFirstName());
            existUser.setLastName(user.getLastName());
            existUser.setOtherName(user.getOtherName());
            existUser.setGender(user.getGender());
            existUser.setCity(user.getCity());
            existUser.setAddress(user.getAddress());
            existUser.setAccountNumber(user.getAccountNumber());
            existUser.setAccountBalance(user.getAccountBalance());
            existUser.setEmail(user.getEmail());
            existUser.setPhoneNumber(user.getPhoneNumber());
            existUser.setPassword(user.getPassword());
            existUser.setStatus(user.getStatus());
            return userRepository.save(existUser);
        }
        return null;
    }

    @Override
    public void removeUser(Long id) {
        userRepository.deleteById(id);
    }
}
