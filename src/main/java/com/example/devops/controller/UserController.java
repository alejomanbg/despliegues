package com.example.devops.controller;

import com.example.devops.model.UserCell;
import com.example.devops.model.UserResource;
import com.example.devops.repository.UserCellRepository;
import com.example.devops.repository.UserResourceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserResourceRepository resourceRepo;
    private final UserCellRepository cellRepo;

    public UserController(UserResourceRepository resourceRepo, UserCellRepository cellRepo) {
        this.resourceRepo = resourceRepo;
        this.cellRepo = cellRepo;
    }

    @GetMapping("/resources")
    public List<UserResource> listResources() {
        return resourceRepo.findAll();
    }

    @PostMapping("/cells")
    public ResponseEntity<UserCell> createCell(@RequestBody UserCell cell) {
        UserCell saved = cellRepo.save(cell);
        return ResponseEntity.ok(saved);
    }
}
