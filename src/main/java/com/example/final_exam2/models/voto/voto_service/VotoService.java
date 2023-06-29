package com.example.final_exam2.models.voto.voto_service;

import com.example.final_exam2.models.voto.Voto;

import java.util.List;

public interface VotoService {

    Voto createVoto(Voto voto);

    Voto updateVoto(Voto voto);
    void deleteVoto(Long id);
    List<Voto> getAllVoto();
    Voto getVoto(Long id);

}
