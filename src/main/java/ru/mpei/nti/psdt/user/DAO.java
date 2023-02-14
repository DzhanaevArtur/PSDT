package ru.mpei.nti.psdt.user;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Artur Dzhanaev
 * @created 13.02.2023
 */
@Slf4j
//@Component
public class DAO {


//    private final JdbcTemplate jdbcTemplate;
//
//
//    @Contract(pure = true)
//    public DAO(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }
//
//    public List<User> showAll() {
//        return jdbcTemplate.query("SELECT * FROM user", new BeanPropertyRowMapper<>(User.class));
//    }
//
//    public User showOne(int id) {
//        return jdbcTemplate
//                .query("SELECT * FROM user WHERE id=?", new BeanPropertyRowMapper<>(User.class), id)
//                .stream()
//                .findAny()
//                .orElse(null);
//    }
//
//    public void addUser(@NotNull User user) {
//        jdbcTemplate.update("INSERT INTO user(name, age, email) VALUES(?, ?, ?)",
//                user.getName(), user.getAge(), user.getEmail());
//    }
//
//    public void updateUser(@NotNull User user, int id) {
//        jdbcTemplate.update("UPDATE user SET name=?, age=?, email=? WHERE id=?",
//                user.getName(), user.getAge(), user.getEmail(), id);
//    }
//
//    public void deleteUser(int id) { jdbcTemplate.update("DELETE FROM user WHERE id=?", id); }
//
//    public void deleteAll() { jdbcTemplate.update("DELETE FROM user WHERE TRUE"); }
}
