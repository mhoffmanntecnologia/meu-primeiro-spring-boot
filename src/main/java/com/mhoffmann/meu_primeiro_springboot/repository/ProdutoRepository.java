package com.mhoffmann.meu_primeiro_springboot.repository;

import com.mhoffmann.meu_primeiro_springboot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
