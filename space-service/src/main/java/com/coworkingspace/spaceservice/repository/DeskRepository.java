package com.coworkingspace.spaceservice.repository;

import com.coworkingspace.spaceservice.entity.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends JpaRepository<Desk,Long> {
}
