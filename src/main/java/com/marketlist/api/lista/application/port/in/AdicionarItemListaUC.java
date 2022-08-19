package com.marketlist.api.lista.application.port.in;

import com.marketlist.api.lista.application.domain.Item;

public interface AdicionarItemListaUC {

    void adicionarItem(Long id, Item item);

}
