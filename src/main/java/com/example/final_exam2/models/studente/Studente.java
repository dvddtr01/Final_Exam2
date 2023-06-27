package com.example.final_exam2.models.studente;

import com.example.final_exam2.models.corso.Corso;
import com.example.final_exam2.models.registro.Registro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter //Getter
@Setter
@NoArgsConstructor  //costruttore vuoto
@AllArgsConstructor //costruttore con tutti i parametri
@Entity //dice al compilatore che questa classe è una tabella
public class Studente {

    @Id
    @GeneratedValue
    private long idStudente;
    //idCorso;
    private String stNome;
    private String stCognome;
    private String dataDiNascita;
    private String stTitoloDiStudio;

    @OneToOne
    private Corso corso;
    @OneToOne
    private Registro registro;
}



