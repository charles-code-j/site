package br.com.csgo.site.controller;

import br.com.csgo.site.framework.CrudRestController;
import br.com.csgo.site.model.Partida;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("partida")
public class PartidaController extends CrudRestController<Partida, long> {
}
