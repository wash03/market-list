package com.marketlist.api.lista.application.services;

import com.marketlist.api.lista.application.domain.Item;
import com.marketlist.api.lista.application.domain.Lista;
import com.marketlist.api.lista.application.port.in.AdicionarItemListaUC;
import com.marketlist.api.lista.application.port.in.CriarListaUC;
import com.marketlist.api.lista.application.port.out.ListaRepository;

import java.time.LocalDate;
import java.util.List;

public class ListaService implements CriarListaUC, AdicionarItemListaUC {

    private final ListaRepository listaRepository;

    public ListaService(ListaRepository listaRepository) {
        this.listaRepository = listaRepository;
    }

    @Override
    public void criarLista(Long id, String nome, String descricao, LocalDate dataCriacao, List<Item> itens) {
        dataCriacao = LocalDate.now();
        Lista novaLista = new Lista(id, nome, descricao, dataCriacao, itens);

        listaRepository.save(novaLista);
    }

    @Override
    public void adicionarItem(Long id, Item item) {
        Lista lista = listaRepository.findById(id);

        lista.addItem(item);
    }
}
