package org.sharon.springboot.repository;

import org.sharon.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sharon
 * @create 2020-08-14-14:31
 */
public interface UserRepository extends JpaRepository<User, Integer> {



}
