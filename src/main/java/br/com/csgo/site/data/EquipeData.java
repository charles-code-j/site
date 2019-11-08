package br.com.csgo.site.data;

import br.com.csgo.site.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeData extends JpaRepository<Equipe, Long> {
}
