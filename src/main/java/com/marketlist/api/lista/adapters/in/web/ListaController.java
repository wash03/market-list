package com.marketlist.api.lista.adapters.in.web;

import com.marketlist.api.lista.application.domain.Item;
import com.marketlist.api.lista.application.domain.Lista;
import com.marketlist.api.lista.application.port.in.AdicionarItemListaUC;
import com.marketlist.api.lista.application.port.in.CriarListaUC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista")
public class ListaController {

    private final CriarListaUC criarListaUC;
    private final AdicionarItemListaUC adicionarItemListaUC;

    public ListaController(CriarListaUC criarListaUC, AdicionarItemListaUC adicionarItemListaUC) {
        this.criarListaUC = criarListaUC;
        this.adicionarItemListaUC = adicionarItemListaUC;
    }

    @PostMapping("/criar")
    ResponseEntity<Lista> criar (Lista lista) {
        return ResponseEntity.ok(criarListaUC.criarLista(lista));
    }

    @PostMapping("/adicionaritem")
    ResponseEntity<Lista> adicionarItem (Long id, Item item) {
        return ResponseEntity.ok(adicionarItemListaUC.adicionarItem(id, item));
    }

}
