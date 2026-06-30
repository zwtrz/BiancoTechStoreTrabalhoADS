# Testes para printar no Postman

URL base:

```text
http://localhost:8080
```

## 1. POST Cliente

Metodo: `POST`

URL:

```text
http://localhost:8080/clientes
```

Body JSON:

```json
{
  "nome": "Bianca123456",
  "clienteDesde": "2026-06-28"
}
```

Print esperado: resposta com o cliente criado e um `id`.

## 2. POST Produto

Metodo: `POST`

URL:

```text
http://localhost:8080/produtos
```

Body JSON:

```json
{
  "nome": "SSD Kingston 480GB",
  "preco": 249.90,
  "estoque": true
}
```

Print esperado: resposta com o produto criado e um `id`.

## 3. POST Pedido

Metodo: `POST`

URL:

```text
http://localhost:8080/pedidos
```

Body JSON:

```json
{
  "clienteId": 1,
  "produtoId": 1,
  "quantidade": 2
}
```

Print esperado: resposta com o pedido criado e um `id`.

## 4. GET geral de clientes

Metodo: `GET`

URL:

```text
http://localhost:8080/clientes
```

Print esperado: lista de clientes cadastrados.

## 5. GET geral de produtos

Metodo: `GET`

URL:

```text
http://localhost:8080/produtos
```

Print esperado: lista de produtos cadastrados, como SSD, mouse, teclado, memoria RAM ou notebook.

## 6. GET geral de pedidos

Metodo: `GET`

URL:

```text
http://localhost:8080/pedidos
```

Print esperado: lista de pedidos cadastrados.

## 7. GET por ID

Faca pelo menos um print de consulta por ID.

Exemplo cliente:

```text
GET http://localhost:8080/clientes/1
```

Exemplo produto:

```text
GET http://localhost:8080/produtos/1
```

Exemplo pedido:

```text
GET http://localhost:8080/pedidos/1
```

Print esperado: registro encontrado pelo ID.

## 8. DELETE

Faca pelo menos um print de exclusao por ID.

Exemplo:

```text
DELETE http://localhost:8080/pedidos/1
```

Outros exemplos:

```text
DELETE http://localhost:8080/produtos/1
DELETE http://localhost:8080/clientes/1
```

Print esperado: status `204 No Content` quando apagar com sucesso.

Depois do DELETE, voce pode fazer um GET por ID no mesmo endereco para mostrar que agora retorna `404 Not Found`.
