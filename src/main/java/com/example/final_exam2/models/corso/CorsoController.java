package com.example.final_exam2.models.corso;

import com.example.final_exam2.models.corso.Corso;
import com.example.final_exam2.models.corso.corso_service.CorsoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class CorsoController {
    private final CorsoService corsoService;

    public CorsoController(CorsoService corsoService) {
        this.corsoService = corsoService;
    }

    @GetMapping("/corso")
    public List<Corso> getAllCorso(){
        return corsoService.getAllCorso();
    }

    @GetMapping("/corso/{id}")
    public Corso getCorso(@PathVariable Long id){
        return corsoService.getCorso(id);
    }

    @PostMapping("/corso")
    public Corso createCorso(@RequestBody Corso corso){
        return corsoService.createCorso(corso);
    }

    @PutMapping("/corso/{id}")
    public Corso updateCorso(@PathVariable Long id, @RequestBody Corso corso){
        if(!id.equals(corso.getIdCorso())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match id in object");
        }
        return corsoService.updateCorso(corso);
    }

    @DeleteMapping("/corso/{id}")
    public void deleteCorso(@PathVariable Long id){
        corsoService.deleteCorso(id);
    }

}
