package com.example.final_exam2.models.corso.corso_service;

import com.example.final_exam2.models.corso.Corso;
import com.example.final_exam2.models.corso.CorsoRepository;
import com.example.final_exam2.models.corso.corso_service.CorsoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorsoServiceImpl implements CorsoService {

        private final CorsoRepository corsoRepository;

        public CorsoServiceImpl(CorsoRepository corsoRepository) {
            this.corsoRepository = corsoRepository;
        }

        @Override
        public Corso createCorso(Corso corso) {
            return corsoRepository.save(corso);
        }

        @Override
        public Corso updateCorso(Corso corso) {
            return corsoRepository.save(corso);
        }

        @Override
        public void deleteCorso(Long id) {
            corsoRepository.deleteById(id);
        }

        @Override
        public List<Corso> getAllCorso() {
            return corsoRepository.findAll();
        }


        @Override
        public Corso getCorso(Long id) {
            return corsoRepository.findById(id).orElseThrow();
        }
    }


