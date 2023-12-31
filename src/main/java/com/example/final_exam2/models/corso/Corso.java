package com.example.final_exam2.models.corso;

import com.example.final_exam2.models.docente.Docente;
import com.example.final_exam2.models.registro.Registro;
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
public class Corso {

    @Id
    @GeneratedValue
    private long idCorso;
    private String nomeCorso;
    private String specializzazione;
    private String annoAccademico;

    @OneToOne
    private Registro registro;

}
