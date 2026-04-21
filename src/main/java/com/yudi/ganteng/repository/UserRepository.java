package com.yudi.ganteng.repository;

import com.yudi.ganteng.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {
}

