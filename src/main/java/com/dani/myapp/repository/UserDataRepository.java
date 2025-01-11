package com.dani.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dani.myapp.dto.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
