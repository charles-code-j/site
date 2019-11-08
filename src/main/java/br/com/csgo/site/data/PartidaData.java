package br.com.csgo.site.data;

import br.com.csgo.site.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaData extends JpaRepository<Partida,Long> {
}
