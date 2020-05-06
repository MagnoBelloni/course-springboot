package com.magnus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnus.course.entities.User;

public interface UserRepository extends  JpaRepository<User, Long>{

}
