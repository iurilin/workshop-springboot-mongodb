# Projeto com MongoDB e Spring Boot

Este projeto foi desenvolvido como prática do curso de Java com Programação Orientada a Objetos, ministrado pelo professor [Nélio Alves](https://github.com/acenelio), com foco na criação de uma API RESTful utilizando Spring Boot com banco de dados NoSQL (MongoDB).

## 🎯 Objetivos

- Criar uma API RESTful com Spring Boot
- Trabalhar com banco de dados orientado a documentos (MongoDB)
- Implementar operações básicas de CRUD
- Modelar entidades com relacionamentos (referência e embutido)
- Utilizar Spring Data MongoDB para persistência
- Aplicar tratamento de exceções
- Realizar consultas simples e avançadas com Spring Data

## 🛠️ Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB
- MongoDB Compass
- Maven

## 🗂️ Estrutura do Projeto

O projeto segue uma arquitetura em camadas, com separação entre:

- **Camada de recursos (Resource)**: controladores REST (`UserResource`, `PostResource`)
- **Camada de serviços (Service)**: lógica de negócio
- **Camada de repositórios (Repository)**: acesso ao banco de dados
- **DTOs**: projeção de dados para otimizar respostas
- **Configuração inicial (Config)**: carga de dados no banco

As principais entidades do sistema incluem: `User`, `Post`, `CommentDTO`, `AuthorDTO`.

## 👨‍🏫 Base do Projeto

Este projeto foi baseado nas aulas do professor [Nélio Alves](https://github.com/acenelio), disponíveis na plataforma [EducandoWeb](http://educandoweb.com.br).

---

Projeto criado para fins de aprendizado e prática com Spring Boot e MongoDB.
