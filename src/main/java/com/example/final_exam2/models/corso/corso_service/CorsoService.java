package com.example.final_exam2.models.corso.corso_service;

import com.example.final_exam2.models.corso.Corso;

import java.util.List;

public interface CorsoService {

        Corso createCorso(Corso corso);
        Corso  updateCorso(Corso corso);
        void deleteCorso(Long id);
        List<Corso> getAllCorso();
        Corso getCorso(Long id);

}

