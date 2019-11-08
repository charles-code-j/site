package br.com.csgo.site.data;

import br.com.csgo.site.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorData extends JpaRepository<Jogador, Long> {
}
