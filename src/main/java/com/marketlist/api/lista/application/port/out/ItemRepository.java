package com.marketlist.api.lista.application.port.out;

import com.marketlist.api.lista.application.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    Optional<Item> findById(Long id);
    List<Item> findByListaId(Long listaId);
    Item save(Item item);

}
