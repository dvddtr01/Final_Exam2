package com.example.final_exam2.models.voto;

import com.example.final_exam2.models.voto.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends JpaRepository <Voto, Long> {

}
