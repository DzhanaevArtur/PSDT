package ru.mpei.nti.psdt.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
@Data
@Entity
@Slf4j
@Table(name = "arturs")
public class User implements Serializable {


    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    @Column(name = "age", updatable = false)
    private Integer age;

    @Column(name = "email", updatable = false)
    private String email;

    @Column(name = "name", updatable = false)
    private String name;
}
