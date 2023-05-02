package com.example.Person1.repository;

import com.example.Person1.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalityRepository extends JpaRepository<Nationality,Integer> {
}
