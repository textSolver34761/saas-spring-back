package com.test.saas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.saas.model.Welcome;

@Repository
public interface WelcomeRepository extends JpaRepository<Welcome, Long> {

}
