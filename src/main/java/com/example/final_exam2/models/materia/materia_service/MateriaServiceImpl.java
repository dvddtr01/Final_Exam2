package com.example.final_exam2.models.materia.materia_service;

import com.example.final_exam2.models.materia.Materia;
import com.example.final_exam2.models.materia.MateriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    private final MateriaRepository materiaRepository;

    public MateriaServiceImpl(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    @Override
    public Materia createMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia updateMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public void deleteMateria(Long id) {
        materiaRepository.deleteById(id);
    }

    @Override
    public List<Materia> getAllMateria() {
        return materiaRepository.findAll();
    }


    @Override
    public Materia getMateria(Long id) {
        return materiaRepository.findById(id).orElseThrow();
    }
}
