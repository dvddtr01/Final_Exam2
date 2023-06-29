package com.example.final_exam2.models.registro.registro_service;

import com.example.final_exam2.models.registro.Registro;
import com.example.final_exam2.models.registro.RegistroRepository;
import com.example.final_exam2.models.registro.registro_service.RegistroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroServiceImpl implements RegistroService {

    private final RegistroRepository registroRepository;

    public RegistroServiceImpl(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    @Override
    public Registro createRegistro(Registro registro) {
        return registroRepository.save(registro);
    }

    @Override
    public Registro updateRegistro(Registro registro) {
        return registroRepository.save(registro);
    }

    @Override
    public void deleteRegistro(Long id) {
        registroRepository.deleteById(id);
    }

    @Override
    public List<Registro> getAllRegistro() {
        return registroRepository.findAll();
    }


    @Override
    public Registro getRegistro(Long id) {
        return registroRepository.findById(id).orElseThrow();
    }
}
