package com.example.final_exam2.models.docente;

import com.example.final_exam2.models.docente.Docente;
import com.example.final_exam2.models.docente.docente_service.DocenteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class DocenteController {
    private final DocenteService docenteService;

    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @GetMapping("/docente")
    public List<Docente> getAllDocente(){
        return docenteService.getAllDocente();
    }

    @GetMapping("/docente/{id}")
    public Docente getDocente(@PathVariable Long id){
        return docenteService.getDocente(id);
    }

    @PostMapping("/docente")
    public Docente createDocente(@RequestBody Docente docente){
        return docenteService.createDocente(docente);
    }

    @PutMapping("/docente/{id}")
    public Docente updateDocente(@PathVariable Long id, @RequestBody Docente docente){
        if(!id.equals(docente.getIdDocente())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match id in object");
        }
        return docenteService.updateDocente(docente);
    }

    @DeleteMapping("/docente/{id}")
    public void deleteDocente(@PathVariable Long id){docenteService.deleteDocente(id);}

}

