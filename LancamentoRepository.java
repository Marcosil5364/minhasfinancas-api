package com.marsilva.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marsilva.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
