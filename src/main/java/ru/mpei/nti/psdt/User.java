package ru.mpei.nti.psdt;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;

import javax.persistence.*;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
@Data
@Entity
@Slf4j
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String email;


    @Contract(pure = true)
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Contract(pure = true)
    public User() {}
}
