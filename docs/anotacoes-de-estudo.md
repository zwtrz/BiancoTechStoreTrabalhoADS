# Anotações de estudo

Este arquivo tem um resumo simples para eu entender e explicar o projeto da Bianco Tech Store.

## O que é uma entidade JPA

Uma entidade JPA é uma classe Java que representa uma tabela no banco de dados.

No meu projeto, `Cliente`, `Produto` e `Pedido` são entidades. A anotação `@Entity` mostra para o Spring que aquela classe deve ser usada pelo JPA.

## O que é um repository

Um repository é uma interface que ajuda a acessar o banco de dados.

No projeto, os repositories estendem `JpaRepository`. Com isso, o Spring Data JPA já fornece métodos prontos, como salvar, listar, buscar por ID e deletar.

## O que é um controller REST

Um controller REST é a classe que recebe as requisições da API.

No meu projeto, os controllers recebem as chamadas feitas pelo Postman e usam os repositories para salvar, buscar, atualizar ou apagar dados.

## O que o @RestController faz

O `@RestController` indica que a classe é um controller de API REST.

Ele faz com que os métodos retornem dados diretamente no formato de resposta da API, normalmente em JSON.

## O que o @RequestMapping faz

O `@RequestMapping` define o caminho principal de um controller.

Por exemplo, em `ClienteController`, o caminho principal é `/clientes`. Então os métodos dessa classe respondem a URLs que começam com `/clientes`.

## O que o ResponseEntity faz

O `ResponseEntity` permite controlar melhor a resposta da API.

No projeto, ele é usado para retornar o objeto quando o ID existe ou retornar `404 Not Found` quando o ID não é encontrado.

## Como o Postman envia JSON para a API

No Postman, eu escolho o método, como `POST`, `GET`, `PUT` ou `DELETE`, informo a URL e, quando preciso enviar dados, uso o Body no formato JSON.

Exemplo de JSON enviado para criar um produto:

```json
{
  "nome": "SSD Kingston 480GB",
  "preco": 249.90,
  "estoque": true
}
```

O Spring recebe esse JSON e transforma os campos em um objeto Java.

## Como o Spring Data JPA salva os dados no banco

O Spring Data JPA usa o repository para conversar com o banco de dados.

Quando o controller chama `repository.save(objeto)`, o Spring Data JPA gera o comando necessário para salvar ou atualizar os dados no MySQL.

Com `spring.jpa.hibernate.ddl-auto=update`, o Hibernate também ajuda a criar ou atualizar as tabelas conforme as entidades do projeto.
