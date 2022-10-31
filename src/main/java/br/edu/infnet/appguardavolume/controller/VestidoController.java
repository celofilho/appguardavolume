package br.edu.infnet.appguardavolume.controller;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;
import br.edu.infnet.appguardavolume.model.domain.Vestido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VestidoController {
    @GetMapping(value = "/vestido/lista")
    public String telaLista(Model model) {

        Vestido v1 = new Vestido();
        v1.setCodigo(123);
        v1.setNome("Vestido 123");
        v1.setValor(10);
        v1.setImportado(true);
        v1.setTamanho("P");
        System.out.println("> " + v1);

        Vestido v2 = new Vestido();
        v2.setCodigo(234);
        v2.setNome("Vestido 234");
        v2.setValor(15);
        v2.setImportado(true);
        v2.setTamanho("PP");
        System.out.println("> " + v2);

        Vestido v3 = new Vestido();
        v3.setCodigo(345);
        v3.setNome("Vestido 345");
        v3.setValor(20);
        v3.setImportado(true);
        v3.setTamanho("GG");
        System.out.println("> " + v3);

        List<Vestido> vestidos = new ArrayList<Vestido>();
        vestidos.add(v1);
        vestidos.add(v2);
        vestidos.add(v3);

        model.addAttribute("listagem", vestidos);

        return "vestido/lista";
    }
}
