package com.marketlist.api.lista.application.port.in;

import com.marketlist.api.lista.application.domain.Item;

import java.time.LocalDate;
import java.util.List;

public interface CriarListaUC {

    void criarLista(Long id, String nome, String descricao, LocalDate dataCriacao, List<Item> itens);

}
