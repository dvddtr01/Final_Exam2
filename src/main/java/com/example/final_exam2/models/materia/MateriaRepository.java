package com.example.final_exam2.models.materia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

    @Query(value = "select * from materia where id_docente = ?1", nativeQuery = true)
    public List<Materia> getMateriaByDocente(Long idDocente);
}


