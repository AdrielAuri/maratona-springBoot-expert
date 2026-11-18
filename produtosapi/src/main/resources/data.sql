create table produto(
    idProduto varchar(255) not null, primary key(idProduto),
    nomeProduto varchar(50) not null,
    descricaoProduto varchar(300),
    precoProduto numeric(18, 2)
);