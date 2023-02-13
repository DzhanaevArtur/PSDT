package ru.mpei.nti.psdt;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {


    @Override <S extends User>
    @NotNull S save(@NotNull S entity);

    @Override <S extends User>
    @NotNull Iterable<S> saveAll(@NotNull Iterable<S> entities);

    @Override
    @NotNull
    Optional<User> findById( @NotNull Long aLong);

    @Override
    boolean existsById(@NotNull Long aLong);

    @Override
    @NotNull
    Iterable<User> findAll();

    @Override
    @NotNull
    Iterable<User> findAllById(@NotNull Iterable<Long> longs);

    @Override
    long count();

    @Override
    void deleteById(@NotNull Long aLong);

    @Override
    void delete(@NotNull User entity);

    @Override
    void deleteAllById(@NotNull Iterable<? extends Long> longs);

    @Override
    void deleteAll(@NotNull Iterable<? extends User> entities);

    @Override
    void deleteAll();
}
