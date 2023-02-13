package ru.mpei.nti.psdt;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
@CrossOrigin(origins = "http://localhost:4200")
@Data
@RestController
@Slf4j
public class Controller {


    private final UserRepository userRepository;


    @GetMapping("/users")
    public List<User> getUsers() {return (List<User>) userRepository.findAll();}

    @PostMapping("/users")
    void addUser(@RequestBody User user) {userRepository.save(user);}
}
