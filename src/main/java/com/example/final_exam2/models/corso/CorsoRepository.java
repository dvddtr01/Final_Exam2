package com.example.final_exam2.models.corso;

import com.example.final_exam2.models.corso.Corso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorsoRepository extends JpaRepository<Corso, Long> {

}
