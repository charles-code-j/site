package br.com.csgo.site.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "EQUIPE")
@Data
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private Long id;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

  @ManyToOne(optional = false)
  @JoinColumn(name = "Jogador_1")
  private Jogador jogador1;


  @ManyToOne(optional = false)
  @JoinColumn(name = "Jodador_2")
    private Jogador jogador2;


  @ManyToOne(optional = false)
  @JoinColumn(name = "Jogador_3")
  private Jogador jogador3;

  @ManyToOne(optional = false)
  @JoinColumn(name = "Jogador_4")
  private Jogador jogador4;


  @ManyToOne(optional = false)
  @JoinColumn(name = "Jogador_5")
  private Jogador jogador5;
}
