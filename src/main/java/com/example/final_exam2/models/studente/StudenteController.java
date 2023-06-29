package com.example.final_exam2.models.studente;

import com.example.final_exam2.models.studente.Studente;
import com.example.final_exam2.models.studente.studente_service.StudenteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class
StudenteController {
    private final StudenteService studenteService;

    public StudenteController(StudenteService studenteService) {
        this.studenteService = studenteService;
    }

    @GetMapping("/studente")
    public List<Studente> getAllStudente(){
        return studenteService.getAllStudente();
    }

    @GetMapping("/studente/{id}")
    public Studente getStudente(@PathVariable Long id){
        return studenteService.getStudente(id);
    }

    @PostMapping("/studente")
    public Studente createStudente(@RequestBody Studente studente){
        return studenteService.createStudente(studente);
    }

    @PutMapping("/studente/{id}")
    public Studente updateStudente(@PathVariable Long id, @RequestBody Studente studente){
        if(!id.equals(studente.getIdStudente())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match id in object");
        }
        return studenteService.updateStudente(studente);
    }

    @DeleteMapping("/studente/{id}")
    public void deleteStudente(@PathVariable Long id){
        studenteService.deleteStudente(id);
    }

}
