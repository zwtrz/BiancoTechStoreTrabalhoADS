# Bianco Tech Store

Este projeto e uma API REST simples feita em Spring Boot para a loja ficticia Bianco Tech Store.

A Bianco Tech Store vende produtos de informatica, como notebooks, SSDs, mouses, teclados, memorias RAM e acessorios de tecnologia.

O objetivo do projeto e controlar clientes, produtos e pedidos usando endpoints JSON que podem ser testados no Postman.

## Tecnologias usadas

- Java 17
- Spring Boot
- Maven
- Spring Web
- Spring Data JPA
- MySQL Driver
- JSON nos endpoints

## Estrutura do projeto

O projeto usa a estrutura minima pedida na atividade:

- `model`: classes que representam as entidades do sistema.
- `repository`: interfaces que acessam o banco de dados.
- `controller`: classes que recebem as requisicoes da API REST.

Pacote base:

```text
br.com.uninter.biancotechstore
```

## Entidades

### Cliente

Representa uma pessoa cadastrada como cliente da loja.

Campos:

- `id` Long
- `nome` String
- `clienteDesde` LocalDate

Exemplo JSON:

```json
{
  "nome": "Bianca123456",
  "clienteDesde": "2026-06-28"
}
```

### Produto

Representa um produto de informatica vendido pela loja.

Campos:

- `id` Long
- `nome` String
- `preco` BigDecimal
- `estoque` Boolean

Exemplo JSON:

```json
{
  "nome": "SSD Kingston 480GB",
  "preco": 249.90,
  "estoque": true
}
```

Outros exemplos de produtos:

- Mouse Gamer Logitech
- Teclado Mecanico Redragon
- Memoria RAM 8GB DDR4
- Notebook Dell Latitude

### Pedido

Representa um pedido feito por um cliente.

Campos:

- `id` Long
- `clienteId` Long
- `produtoId` Long
- `quantidade` Integer

Exemplo JSON:

```json
{
  "clienteId": 1,
  "produtoId": 1,
  "quantidade": 2
}
```

## Endpoints

URL base:

```text
http://localhost:8080
```

### Clientes

- `POST /clientes`: cria um cliente.
- `GET /clientes`: lista todos os clientes.
- `GET /clientes/{id}`: busca um cliente pelo ID.
- `PUT /clientes/{id}`: atualiza um cliente pelo ID.
- `DELETE /clientes/{id}`: apaga um cliente pelo ID.

### Produtos

- `POST /produtos`: cria um produto.
- `GET /produtos`: lista todos os produtos.
- `GET /produtos/{id}`: busca um produto pelo ID.
- `PUT /produtos/{id}`: atualiza um produto pelo ID.
- `DELETE /produtos/{id}`: apaga um produto pelo ID.

### Pedidos

- `POST /pedidos`: cria um pedido.
- `GET /pedidos`: lista todos os pedidos.
- `GET /pedidos/{id}`: busca um pedido pelo ID.
- `PUT /pedidos/{id}`: atualiza um pedido pelo ID.
- `DELETE /pedidos/{id}`: apaga um pedido pelo ID.

## Exemplos para testar no Postman

### Criar cliente

```http
POST http://localhost:8080/clientes
Content-Type: application/json
```

```json
{
  "nome": "Bianca123456",
  "clienteDesde": "2026-06-28"
}
```

### Criar produto

```http
POST http://localhost:8080/produtos
Content-Type: application/json
```

```json
{
  "nome": "SSD Kingston 480GB",
  "preco": 249.90,
  "estoque": true
}
```

### Criar pedido

```http
POST http://localhost:8080/pedidos
Content-Type: application/json
```

```json
{
  "clienteId": 1,
  "produtoId": 1,
  "quantidade": 2
}
```

### Atualizar produto

```http
PUT http://localhost:8080/produtos/1
Content-Type: application/json
```

```json
{
  "nome": "Notebook Dell Latitude",
  "preco": 3499.90,
  "estoque": true
}
```

## Banco de dados

Configuracao usada no arquivo `application.properties`:

- Banco: `biancotechstore_db`
- Porta: `3306`
- Usuario: `root`
- Senha: `root`
- `spring.jpa.hibernate.ddl-auto=update`
- `spring.jpa.show-sql=true`

## Decisoes do projeto

- O projeto usa `controller`, `model` e `repository` para seguir a arquitetura minima pedida.
- O `Pedido` usa `clienteId` e `produtoId` simples para manter compatibilidade com o DER simplificado.
- Nao foi criado front-end porque o trabalho pede uma API REST testada no Postman.
- Nao foi criada autenticacao porque nao faz parte do escopo da atividade.
- O foco foi cumprir os endpoints obrigatorios e os testes no Postman.

## Como rodar

1. Abra o MySQL e confira se o usuario `root` usa a senha `root`.
2. Abra o terminal na pasta do projeto.
3. Rode o comando:

```powershell
mvn spring-boot:run
```

4. Teste a API no Postman usando a URL base:

```text
http://localhost:8080
```
