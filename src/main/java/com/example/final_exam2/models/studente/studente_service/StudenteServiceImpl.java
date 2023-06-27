package com.example.final_exam2.models.studente.studente_service;

import com.example.final_exam2.models.studente.Studente;
import com.example.final_exam2.models.studente.StudenteRepository;
import com.example.final_exam2.models.studente.studente_service.StudenteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenteServiceImpl implements StudenteService {

    private final StudenteRepository studenteRepository;

    public StudenteServiceImpl(StudenteRepository studenteRepository) {
        this.studenteRepository = studenteRepository;
    }

    @Override
    public Studente createStudente(Studente studente) {
        return studenteRepository.save(studente);
    }

    @Override
    public Studente updateStudente(Studente studente) {
        return studenteRepository.save(studente);
    }

    @Override
    public void deleteStudente(Long id) {
        studenteRepository.deleteById(id);
    }

    @Override
    public List <Studente> getAllStudente() {
        return studenteRepository.findAll();
    }


    @Override
    public Studente getStudente(Long id) {
        return studenteRepository.findById(id).orElseThrow();
    }
}
