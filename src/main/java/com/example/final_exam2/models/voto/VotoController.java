package com.example.final_exam2.models.voto;

import com.example.final_exam2.models.voto.Voto;
import com.example.final_exam2.models.voto.voto_service.VotoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class VotoController {
    private final VotoService votoService;

    public VotoController(VotoService votoService) {
        this.votoService = votoService;
    }

    @GetMapping("/voto")
    public List<Voto> getAllVoto(){
        return votoService.getAllVoto();
    }

    @GetMapping("/voto/{id}")
    public Voto getVoto(@PathVariable Long id){
        return votoService.getVoto(id);
    }

    @PostMapping("/voto")
    public Voto createVoto(@RequestBody Voto voto){
        return votoService.createVoto(voto);
    }

    @PutMapping("/voto/{id}")
    public Voto updateVoto(@PathVariable Long id, @RequestBody Voto voto){
        if(!id.equals(voto.getIdVoto())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match id in object");
        }
        return votoService.updateVoto(voto);
    }

    @DeleteMapping("/voto/{id}")
    public void deleteVoto(@PathVariable Long id){
        votoService.deleteVoto(id);
    }

}

