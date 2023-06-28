package com.example.final_exam2.models.docente;

import com.example.final_exam2.models.materia.Materia;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter //Getter
@Setter
@NoArgsConstructor  //costruttore vuoto
@AllArgsConstructor //costruttore con tutti i parametri
@Entity //dice al compilatore che questa classe è una tabella

public class Docente {

    @Id
    @GeneratedValue
    private Long idDocente;
    private String dcNome;
    private String dcCognome;
    private String dcTitoloDiStudio;
    @Transient
    private List<Materia> materie;


}
