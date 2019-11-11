package br.com.csgo.site.controller;

import br.com.csgo.site.framework.CrudRestController;
import br.com.csgo.site.framework.CrudService;
import br.com.csgo.site.model.Partida;
import br.com.csgo.site.service.PartidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("partida")
public class PartidaController extends CrudRestController<Partida, Long> {

    private final PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @Override
    public CrudService<Partida, Long> getService() {
        return partidaService;
    }
}
