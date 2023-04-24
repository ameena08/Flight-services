package com.example.Flightservices.repo;

import com.example.Flightservices.entity.Passengerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Passengerrepo extends JpaRepository<Passengerinfo,String> {
}
