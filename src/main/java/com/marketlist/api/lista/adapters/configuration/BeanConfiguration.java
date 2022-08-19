package com.marketlist.api.lista.adapters.configuration;

import com.marketlist.MarketListApplication;
import com.marketlist.api.lista.application.port.in.AdicionarItemListaUC;
import com.marketlist.api.lista.application.port.in.CriarListaUC;
import com.marketlist.api.lista.application.port.out.ListaRepository;
import com.marketlist.api.lista.application.services.ListaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = MarketListApplication.class)
public class BeanConfiguration {

    @Bean
    CriarListaUC criarListaUC(ListaRepository listaRepository) {
        return new ListaService(listaRepository);
    }

    @Bean
    AdicionarItemListaUC adicionarItemListaUC(ListaRepository listaRepository) {
        return new ListaService(listaRepository);
    }

}
