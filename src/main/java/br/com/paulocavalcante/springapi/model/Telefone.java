package br.com.paulocavalcante.springapi.model;


import lombok.Data;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ddd;
    private String numero;

    @ForeignKey(name="usuario_id")
    @ManyToOne
    private  User user;

}
