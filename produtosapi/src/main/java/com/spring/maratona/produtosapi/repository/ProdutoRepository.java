package com.spring.maratona.produtosapi.repository;

import com.spring.maratona.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Aqui eu posso criar novos metodos para a aplicação.
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findByNomeProduto(String nomeProduto);
}
