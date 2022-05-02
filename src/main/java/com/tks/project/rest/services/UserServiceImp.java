package com.tks.project.rest.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tks.project.rest.model.Users;
import com.tks.project.rest.repository.UserRepository;

@Service
public class UserServiceImp {
    @Autowired
    private UserRepository userRepository;

    public String forgotPassword(String email) {

        Optional<Users> userOptional = Optional
                .ofNullable(userRepository.findByEmail(email));

        if (!userOptional.isPresent()) {
            return "Invalid email.";
        }

        Users user = userOptional.get();
        user.setResetToken(generateToken());
    

        user = userRepository.save(user);

        return user.getResetToken();
    }
    public String resetPassword(String resetToken, String password) {

        Optional<Users> userOptional = Optional
                .ofNullable(userRepository.findByResetToken(resetToken));

        if (!userOptional.isPresent()) {
            return "Invalid token.";
        }

        

        Users user = userOptional.get();

        user.setPassword(password);
        user.setResetToken(null);
        

        userRepository.save(user);

        return "Your password successfully updated.";
    }
     
    private String generateToken() {
        StringBuilder token = new StringBuilder();

        return token.append(UUID.randomUUID().toString())
                .append(UUID.randomUUID().toString()).toString();
    }

}