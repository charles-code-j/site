package br.com.csgo.site.controller;


import br.com.csgo.site.service.EquipeService;
import br.com.csgo.site.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("screen-partida")
public class PartidaScreenController {
    @Autowired
    private PartidaService partidaService;

    @GetMapping("{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("partida", partidaService.findOne(id).get());
        return "partida";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("partidas", partidaService.findAll());
        return "partidas";
    }


}
