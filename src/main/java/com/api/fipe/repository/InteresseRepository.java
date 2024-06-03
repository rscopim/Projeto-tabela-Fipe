package com.api.fipe.repository;

import com.api.fipe.model.InteresseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteresseRepository extends JpaRepository<InteresseModel, Long> {
}
