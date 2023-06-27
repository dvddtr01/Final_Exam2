package com.example.final_exam2.models.docente;

import com.example.final_exam2.models.materia.Materia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

public class Docente {

    @Id
    @GeneratedValue
    private String idDocente;
    //idMateria;
    private String dcNome;
    private String dcCognome;
    private String dcTitoloDiStudio;
    @OneToMany
    List<Materia> materie;
}
