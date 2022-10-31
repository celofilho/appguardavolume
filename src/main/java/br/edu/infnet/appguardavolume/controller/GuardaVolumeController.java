package br.edu.infnet.appguardavolume.controller;

import br.edu.infnet.appguardavolume.model.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GuardaVolumeController {
    @GetMapping(value = "/guardavolume/lista")
    public String telaLista(Model model) {

        Bebida bebida = new Bebida();
        bebida.setCodigo(123);
        bebida.setNome("Bebida 123");
        bebida.setValor(10);
        bebida.setMarca("Skol");

        Comida comida = new Comida();
        comida.setCodigo(133);
        comida.setNome("Comida 133");
        comida.setValor(10);
        comida.setPeso(100);
        comida.setPerecivel(true);

        Vestido vestido = new Vestido();
        vestido.setCodigo(123);
        vestido.setNome("Vestido 123");
        vestido.setValor(10);
        vestido.setImportado(true);
        vestido.setTamanho("P");

        Condomino c1 = new Condomino();
        c1.setCpf("44316312352");
        c1.setEmail("primeiro@Condomino.com");
        c1.setNome("Primeiro condomino");

        Condomino c2 = new Condomino();
        c2.setCpf("55316312348");
        c2.setEmail("primeiro@Condomino.com");
        c2.setNome("Segundo condomino");


        List<Volume> GuardaVolume01 = new ArrayList<Volume>();
        GuardaVolume01.add(bebida);
        GuardaVolume01.add(comida);

        List<Volume> GuardaVolume02 = new ArrayList<Volume>();
        GuardaVolume02.add(bebida);
        GuardaVolume02.add(comida);
        GuardaVolume02.add(vestido);

        GuardaVolume g1 = new GuardaVolume();
        g1.setData(LocalDateTime.now());
        g1.setDescricao("Primeiro Guarda Volume");
        g1.setCondomino(c1);
        g1.setVolumes(GuardaVolume01);
        System.out.println("> " + g1);

        GuardaVolume g2 = new GuardaVolume();
        g2.setData(LocalDateTime.now());
        g2.setDescricao("Segundo Guarda Volume");
        g2.setCondomino(c1);
        g2.setVolumes(GuardaVolume02);
        System.out.println("> " + g2);

        GuardaVolume g3 = new GuardaVolume();
        g3.setData(LocalDateTime.now());
        g3.setDescricao("Terceiro Guarda Volume");
        g3.setVolumes(GuardaVolume02);
        System.out.println("> " + g3);

        List<GuardaVolume> guardavolumes = new ArrayList<GuardaVolume>();
        guardavolumes.add(g1);
        guardavolumes.add(g2);
        guardavolumes.add(g3);

        model.addAttribute("listagem", guardavolumes);

        return "guardavolume/lista";
    }
}
