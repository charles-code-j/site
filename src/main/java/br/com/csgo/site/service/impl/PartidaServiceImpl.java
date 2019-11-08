package br.com.csgo.site.service.impl;

import br.com.csgo.site.data.PartidaData;
import br.com.csgo.site.framework.CrudServiceImpl;
import br.com.csgo.site.model.Partida;
import br.com.csgo.site.service.PartidaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class PartidaServiceImpl extends CrudServiceImpl<Partida, Long> implements PartidaService {

    private final PartidaData partidaData;

    public PartidaServiceImpl(PartidaData partidaData) {
        this.partidaData = partidaData;
    }

    @Override
    public JpaRepository<Partida, Long> getRepository() {
        return partidaData;
    }
}
