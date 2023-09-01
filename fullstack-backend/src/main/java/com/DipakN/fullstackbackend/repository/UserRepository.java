package com.DipakN.fullstackbackend.repository;

import com.DipakN.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
