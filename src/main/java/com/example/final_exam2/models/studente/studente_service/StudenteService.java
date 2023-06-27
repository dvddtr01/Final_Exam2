package com.example.final_exam2.models.studente.studente_service;

import com.example.final_exam2.models.studente.Studente;

import java.util.List;

public interface StudenteService {

    Studente createStudente(Studente studente);

    Studente updateStudente(Studente studente);
    void deleteStudente(Long id);
    List<Studente> getAllStudente();
    Studente getStudente(Long id);
}
