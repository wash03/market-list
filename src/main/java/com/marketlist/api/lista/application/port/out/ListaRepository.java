package com.marketlist.api.lista.application.port.out;

import com.marketlist.api.lista.application.domain.Lista;

import java.util.List;

public interface ListaRepository {

    List<Lista> findByUserId(Long usuarioId);
    Lista findById(Long id);
    void save(Lista lista);

}
