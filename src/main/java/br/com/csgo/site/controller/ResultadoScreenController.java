package br.com.csgo.site.controller;


import br.com.csgo.site.model.Resultado;
import br.com.csgo.site.service.JogadorService;
import br.com.csgo.site.service.ResultadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("screen-resultado")
public class ResultadoScreenController {

    @Autowired private ResultadoService resultadoService;


    @GetMapping
    public String porPartida(Model model){
        model.addAttribute("resultados", resultadoService.findAll());
        return "resultados";
    }
}
