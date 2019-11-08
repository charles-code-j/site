package br.com.csgo.site.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "JOGADOR")
@Data
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long id;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name ="EQUIPAMENTO", length = 100, nullable = false)
    private String equipamento;

    @Column(name ="MORTES", length = 100, nullable = false)
    private Integer mortes;

    @Column(name = "KILLS", length = 100, nullable = false)
    private Integer kills;


}
