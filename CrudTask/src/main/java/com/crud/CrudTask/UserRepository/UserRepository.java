package com.crud.CrudTask.UserRepository;

import com.crud.CrudTask.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
