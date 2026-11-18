package com.spring.maratona.produtosapi.controller;

import com.spring.maratona.produtosapi.model.Produto;
import com.spring.maratona.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController // Indica ao spring que essa classe receberá requisições HTTP e devolver respostas geralmente em json
@RequestMapping("/produtos") // Indica qual será a rota de acesso base
public class ProdutoController {

    private ProdutoRepository produtoRepository;
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Cadastra um produto
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) { // Anotação para receber Objeto JSON
        var id = UUID.randomUUID().toString();
        produto.setIdProduto(id);
        produtoRepository.save(produto);
        return produto;
    }

    // Puxa a informação de um produto
    @GetMapping("/{id}") //
    public Produto buscarProdutosPorId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    // Deleta um produto
    @PutMapping("/{id}")
    public void atualizarProduto(@PathVariable("id") String id,
                                 @RequestBody Produto produto){
        produto.setIdProduto(id);
        produtoRepository.save(produto);
    }


    @GetMapping
    public List<Produto> buscarProdutoPorNome(@RequestParam("nomeProduto") String nomeProduto) {
        return produtoRepository.findByNomeProduto(nomeProduto);
    }

}
