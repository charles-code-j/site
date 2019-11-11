package br.com.csgo.site.controller;


import br.com.csgo.site.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("screen-equipe")
public class EquipeScreenController {

    @Autowired
    private EquipeService equipeService;

    @GetMapping("{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("equipe", equipeService.findOne(id).get());
        return "equipe";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("equipes", equipeService.findAll());
        return "equipes";
    }
}
