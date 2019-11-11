package br.com.csgo.site.controller;

import br.com.csgo.site.framework.CrudRestController;
import br.com.csgo.site.framework.CrudService;
import br.com.csgo.site.model.Equipe;
import br.com.csgo.site.service.EquipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("equipe")
public class EquipeController extends CrudRestController<Equipe,Long> {

    private final EquipeService equipeService;

    public EquipeController(EquipeService equipeService) {
        this.equipeService = equipeService;
    }

    @Override
    public CrudService<Equipe, Long> getService() {
        return equipeService;
    }
}
