package com.example.Flightservices.repo;

import com.example.Flightservices.entity.Paymentinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Payementrepo extends JpaRepository<Paymentinfo,String> {
}
