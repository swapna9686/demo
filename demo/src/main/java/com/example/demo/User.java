package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String email;

    // Constructors
    public User() {}

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
@Repositiry
public interface UserRepo JpaRepository<User Long>{


Optional<User> findByEmail(String email);
}




@service

publice class UserServce{

 private final UserRepo userRepository;

public UserService(UserRepo userRepository){
this.userRepository = usserRepository

}
    public User getUserByEmail(String email){
     return userRepository.findByEmail(email).orElseThrow(()-> new UsernameNotFoundException("User not found"));
}
}
