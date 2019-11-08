package br.com.csgo.site.service.impl;

import br.com.csgo.site.data.JogadorData;
import br.com.csgo.site.framework.CrudServiceImpl;
import br.com.csgo.site.model.Jogador;
import br.com.csgo.site.service.JogadorService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class JogadorServiceImpl extends CrudServiceImpl<Jogador,Long> implements JogadorService {

    private final JogadorData jogadorData;

    public JogadorServiceImpl(JogadorData jogadorData) {
        this.jogadorData = jogadorData;

    }

    @Override
    public JpaRepository<Jogador, Long> getRepository() {
        return jogadorData;
    }
}
