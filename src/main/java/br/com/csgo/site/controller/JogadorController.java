package br.com.csgo.site.controller;


import br.com.csgo.site.framework.CrudRestController;
import br.com.csgo.site.framework.CrudService;
import br.com.csgo.site.model.Jogador;
import br.com.csgo.site.service.JogadorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jogador")
public class JogadorController extends CrudRestController<Jogador,Long> {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }


    @Override
    public CrudService<Jogador, Long> getService() {
        return jogadorService;
    }
}
