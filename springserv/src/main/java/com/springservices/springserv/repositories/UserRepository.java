package com.springservices.springserv.repositories;


import com.springservices.springserv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
//    User findByEmail(String email);
}
