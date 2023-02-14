package ru.mpei.nti.psdt.user;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
//@CrossOrigin(origins = "http://localhost:4200")
@Data
@RequestMapping("/users")
@RestController
@Slf4j
public class Controller {


    private final UserService userService;


    @Contract(pure = true)
    public Controller(UserService userService) {this.userService = userService;}

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);}

    @GetMapping("/findById{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);}

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);}

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user) {return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);}

    @DeleteMapping("/deleteUser{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {userService.deleteUser(id);return new ResponseEntity<>(HttpStatus.OK);}









//    private final DAO dao;
//
//
//    @Contract(pure = true)
//    public Controller(DAO dao) {this.dao = dao;}
//
//    @GetMapping()
//    public void showAll(@NotNull Model model) {model.addAttribute("users", dao.showAll());}
//
//    @GetMapping("/{id}")
//    public void showOne(@NotNull Model model, @PathVariable("id") int id) {model.addAttribute("user", dao.showOne(id));}
//
//    @GetMapping("/new")
//    public String newPerson(@ModelAttribute("user") User user) {return "templates/newPerson.html";}
//
//    @PostMapping()
//    public void addUser(@ModelAttribute("user") User user) {dao.addUser(user);}
//
//    @GetMapping("/{id}/edit")
//    public void update(@NotNull Model model, @PathVariable("id") int id) {model.addAttribute("person", dao.showOne(id));}
//
//    @PatchMapping("/{id}")
//    public void updateUser(@ModelAttribute("user") User user, @PathVariable("id") int id) {dao.updateUser(user, id);}
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable("id") int id) {dao.deleteUser(id);}
//
//    @DeleteMapping("/delete")
//    public void deleteAll() {dao.deleteAll();}
}
