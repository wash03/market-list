package com.marketlist.api.lista.adapters.out.persistence;

import com.marketlist.api.lista.application.domain.Lista;
import com.marketlist.api.lista.application.port.out.ListaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListaDBAdapter implements ListaRepository {

    @Override
    public List<Lista> findByUserId(Long usuarioId) {
        return null;
    }

    @Override
    public Lista findById(Long id) {
        return null;
    }

    @Override
    public void save(Lista lista) {

    }
}

