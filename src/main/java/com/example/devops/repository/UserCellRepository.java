package com.example.devops.repository;

import com.example.devops.model.UserCell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCellRepository extends JpaRepository<UserCell, Long> {
}
