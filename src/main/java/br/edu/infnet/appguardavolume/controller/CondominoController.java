package br.edu.infnet.appguardavolume.controller;

import br.edu.infnet.appguardavolume.model.domain.Comida;
import br.edu.infnet.appguardavolume.model.domain.Condomino;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CondominoController {

    @GetMapping(value = "/condomino/lista")
    public String telaLista(Model model) {

        Condomino c1 = new Condomino();
        c1.setCpf("33344412312");
        c1.setEmail("condomino123@mrv.com.br");
        c1.setNome("Primeiro condomino");
        System.out.println("> " + c1);

        Condomino c2 = new Condomino();
        c2.setCpf("43354412312");
        c2.setEmail("condomino423@mrv.com.br");
        c2.setNome("Segundo condomino");
        System.out.println("> " + c2);

        Condomino c3 = new Condomino();
        c3.setCpf("63355412555");
        c3.setEmail("condomino543@mrv.com.br");
        c3.setNome("Terceiro condomino");
        System.out.println("> " + c3);

        List<Condomino> condominos = new ArrayList<Condomino>();
        condominos.add(c1);
        condominos.add(c2);
        condominos.add(c3);

        model.addAttribute("listagem", condominos);

        return "condomino/lista";
    }
}
