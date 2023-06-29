package com.example.final_exam2.models.registro.registro_service;

import com.example.final_exam2.models.registro.Registro;

import java.util.List;

public interface RegistroService {

    Registro createRegistro(Registro registro);

    Registro  updateRegistro(Registro registro);
    void deleteRegistro(Long id);
    List<Registro> getAllRegistro();
    Registro getRegistro(Long id);
}
