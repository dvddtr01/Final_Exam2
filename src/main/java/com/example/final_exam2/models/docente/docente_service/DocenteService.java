package com.example.final_exam2.models.docente.docente_service;

import com.example.final_exam2.models.docente.Docente;

import java.util.List;

public interface DocenteService {

    Docente createDocente(Docente docente);

    Docente  updateDocente(Docente docente);
    void deleteDocente(Long id);
    List<Docente> getAllDocente();
    Docente getDocente(Long id);
}
