package br.com.csgo.site.data;

import br.com.csgo.site.model.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ResultadoData extends JpaRepository<Resultado,Long> {
}
