package com.cashTrack.repository;

import com.cashTrack.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepo extends JpaRepository<RegisterEntity,Integer> {
}
