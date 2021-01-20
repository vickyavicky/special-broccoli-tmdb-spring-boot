package com.special.broccoli.tmdb.spring.boot.repositories;

import com.special.broccoli.tmdb.spring.boot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
