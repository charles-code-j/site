package br.com.csgo.site.controller;

import br.com.csgo.site.framework.CrudRestController;
import br.com.csgo.site.framework.CrudService;
import br.com.csgo.site.model.Resultado;
import br.com.csgo.site.service.ResultadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resultado")
public class ResultadoController extends CrudRestController<Resultado, Long> {

    private final ResultadoService resultadoService;

    public ResultadoController(ResultadoService resultadoService) {
        this.resultadoService = resultadoService;
    }

    @Override
    public CrudService<Resultado, Long> getService() {
        return resultadoService;
    }
}
