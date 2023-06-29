package com.example.final_exam2.models.registro;

import com.example.final_exam2.models.registro.Registro;
import com.example.final_exam2.models.registro.registro_service.RegistroService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class RegistroController {
    private final RegistroService registroService;

    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }

    @GetMapping("/registro")
    public List<Registro> getAllRegistro(){
        return registroService.getAllRegistro();
    }

    @GetMapping("/registro/{id}")
    public Registro getRegistro(@PathVariable Long id){
        return registroService.getRegistro(id);
    }

    @PostMapping("/registro")
    public Registro createRegistro(@RequestBody Registro registro){
        return registroService.createRegistro(registro);
    }

    @PutMapping("/registro/{id}")
    public Registro updateRegistro(@PathVariable Long id, @RequestBody Registro registro){
        if(!id.equals(registro.getIdRegistro())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match id in object");
        }
        return registroService.updateRegistro(registro);
    }

    @DeleteMapping("/registro/{id}")
    public void deleteRegistro(@PathVariable Long id){
        registroService.deleteRegistro(id);
    }

}
