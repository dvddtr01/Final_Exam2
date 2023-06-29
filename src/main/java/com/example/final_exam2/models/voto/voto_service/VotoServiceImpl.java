package com.example.final_exam2.models.voto.voto_service;

import com.example.final_exam2.models.voto.Voto;
import com.example.final_exam2.models.voto.VotoRepository;
import com.example.final_exam2.models.voto.voto_service.VotoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotoServiceImpl implements VotoService {

    private final VotoRepository votoRepository;

    public VotoServiceImpl(VotoRepository votoRepository) {
        this.votoRepository = votoRepository;
    }

    @Override
    public Voto createVoto(Voto voto) {
        return votoRepository.save(voto);
    }

    @Override
    public Voto updateVoto(Voto voto) {
        return votoRepository.save(voto);
    }

    @Override
    public void deleteVoto(Long id) {
        votoRepository.deleteById(id);
    }

    @Override
    public List <Voto> getAllVoto() {
        return votoRepository.findAll();
    }


    @Override
    public Voto getVoto(Long id) {
        return votoRepository.findById(id).orElseThrow();
    }
}
