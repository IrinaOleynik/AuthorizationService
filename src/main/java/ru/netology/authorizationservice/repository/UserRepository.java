package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("Ira") && password.equals("hey")) {
            return List.of(Authorities.class.getEnumConstants());
        }
        return new ArrayList<>();
    }
}