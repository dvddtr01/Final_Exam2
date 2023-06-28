package com.example.final_exam2.models.docente.docente_service;

import com.example.final_exam2.models.docente.Docente;
import com.example.final_exam2.models.docente.DocenteRepository;
import com.example.final_exam2.models.materia.Materia;
import com.example.final_exam2.models.materia.MateriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {

    private final DocenteRepository docenteRepository;
    private final MateriaRepository materiaRepository;

    public DocenteServiceImpl(DocenteRepository docenteRepository, MateriaRepository materiaRepository) {
        this.docenteRepository = docenteRepository;
        this.materiaRepository = materiaRepository;
    }

    @Override
    public Docente createDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Docente updateDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void deleteDocente(Long id) {
        docenteRepository.deleteById(id);
    }

    @Override
    public List <Docente> getAllDocente() {
        return docenteRepository.findAll();
    }


    @Override
    public Docente getDocente(Long id) {
        Docente docente = docenteRepository.findById(id).orElseThrow();
        List<Materia> materie = materiaRepository.getMateriaByDocente(docente.getIdDocente());
        docente.setMaterie(materie);
        return docente;
    }
}
