package com.marketlist.api.lista.adapters.out.persistence;

import com.marketlist.api.lista.application.domain.Lista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface ListaPGRepository extends JpaRepository<Lista, Long> {



}
