package ru.mpei.nti.psdt.user;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

/**
 * @author Artur Dzhanaev
 * @created 14.02.2023
 */
@Service
@Slf4j
@Transactional
public class UserService {


    private final UserRepository userRepository;


    @Contract(pure = true)
    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public User findById(Long id) {return userRepository.findAll().stream().filter(user -> user.getId().intValue() == id).findAny().orElse(null);}

    public User addUser(@NotNull User user) {user.setAge(new Random().nextInt(0, 100));return userRepository.save(user);}

    public User updateUser(@NotNull User user) {return userRepository.save(user);}

    public List<User> findAll() {return userRepository.findAll();}

    public void deleteUser(Long id) {userRepository.delete(findById(id));}
}
