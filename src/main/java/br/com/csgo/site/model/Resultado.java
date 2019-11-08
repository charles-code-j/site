package br.com.csgo.site.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "RESULTADO")
@Data
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long id;


    @ManyToOne(optional = false)
    @JoinColumn(name = "PARTIDA")
    private Partida partida;


    @Column(name = "ROUND_EQUIPE_1")
    private Integer roundsEquipe1;


    @Column(name = "ROUND_EQUIPE_2")
    private Integer roundsEquipe2;

}
