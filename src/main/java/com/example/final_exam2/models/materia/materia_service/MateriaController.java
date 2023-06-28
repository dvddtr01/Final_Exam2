package com.example.final_exam2.models.materia.materia_service;

import com.example.final_exam2.models.materia.Materia;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class
MateriaController {
    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping("/materia")
    public List<Materia> getAllMateria(){
        return materiaService.getAllMateria();
    }

    @GetMapping("/materia/{id}")
    public Materia getMateria(@PathVariable Long id){
        return materiaService.getMateria(id);
    }

    @PostMapping("/materia")
    public Materia createMateria(@RequestBody Materia materia){
        return materiaService.createMateria(materia);
    }

    @PutMapping("/materia/{id}")
    public Materia updateMateria(@PathVariable Long id, @RequestBody Materia materia){
        if(!id.equals(materia.getIdMateria())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match id in object");
        }
        return materiaService.updateMateria(materia);
    }

    @DeleteMapping("/materia/{id}")
    public void deleteMateria(@PathVariable Long id){
        materiaService.deleteMateria(id);
    }

}
