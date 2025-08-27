package com.aqsha.interntest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aqsha.interntest.model.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {}