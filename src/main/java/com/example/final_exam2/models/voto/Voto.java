package com.example.final_exam2.models.voto;

import com.example.final_exam2.models.docente.Docente;
import com.example.final_exam2.models.materia.Materia;
import com.example.final_exam2.models.studente.Studente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter //Getter
@Setter
@NoArgsConstructor  //costruttore vuoto
@AllArgsConstructor //costruttore con tutti i parametri
@Entity //dice al compilatore che questa classe è una tabella
public class Voto {

    @Id
    @GeneratedValue
    private long idVoto;
    private int valore;

    @ManyToMany
    private List<Materia> materie;



}
