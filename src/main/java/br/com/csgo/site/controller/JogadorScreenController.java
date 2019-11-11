package br.com.csgo.site.controller;

import br.com.csgo.site.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("screen-jogador")
public class JogadorScreenController {
        @Autowired
        private JogadorService jogadorService;


        @GetMapping("{id}")
        public String findById(@PathVariable("id") Long id, Model model) {
            model.addAttribute("jogador", jogadorService.findOne(id).get());
            return "jogador";
        }

        @GetMapping
        public String findAll(Model model) {
            model.addAttribute("jogadores", jogadorService.findAll());
            return "jogadores";
        }

    }

