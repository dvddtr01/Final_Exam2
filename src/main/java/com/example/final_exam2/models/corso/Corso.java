package com.example.final_exam2.models.corso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
