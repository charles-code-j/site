package br.com.csgo.site.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PARTIDA")
@Data
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long id;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "EQUIPE_1")
    private Equipe equipe1;

    @ManyToOne
    @JoinColumn(name = "EQUIPE_2")
    private Equipe equipe2;
}
