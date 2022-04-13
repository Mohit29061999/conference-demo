package com.pluralsight.repository;

import com.pluralsight.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session,Long> {   ///Session is data type and Long is primary key


    
}
