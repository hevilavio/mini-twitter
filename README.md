# mini-twitter

Um projeto de Lab para consolidar o aprendizado na linguagem Clojure.

# Endpoints 
- POST /tweet - Recebe o tweet do usuário e salva na base de dados.
```
{ 
    "user": "@my_user",
    "text": "the tweet text"
}  
```    

- GET /tweet/_user_ - Retorna os tweets postados por um determinado usuário.

## Comandos úteis para executar o projeto

```
# Subir o server
$ lein ring server-headless

# gerar uber-jar
$ lein ring uberjar 
```
