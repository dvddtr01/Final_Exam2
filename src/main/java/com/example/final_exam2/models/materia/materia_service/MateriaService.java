package com.example.final_exam2.models.materia.materia_service;

import com.example.final_exam2.models.materia.Materia;

import java.util.List;

public interface MateriaService {

    Materia createMateria(Materia materia);

    Materia  updateMateria(Materia materia);
    void deleteMateria(Long id);
    List<Materia> getAllMateria();
    Materia getMateria(Long id);

}
