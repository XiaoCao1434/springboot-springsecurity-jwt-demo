package com.beini.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beini.jwt.entity.User;

/**
 * @author lb_chen
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
