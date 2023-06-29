package com.example.final_exam2.models.materia;

import com.example.final_exam2.models.docente.Docente;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Getter
@Setter
@NoArgsConstructor  //costruttore vuoto
@AllArgsConstructor //costruttore con tutti i parametri
@Entity //dice al compilatore che questa classe è una tabella
public class Materia {

    @Id
    @GeneratedValue
    private long idMateria;
    private String mNome;
    private String descrizione;
    int oreMateria;

}
