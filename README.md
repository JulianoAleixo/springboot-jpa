# 🚀 Spring Boot 4 REST API com JPA / Hibernate

Este projeto é uma **API REST profissional desenvolvida com Spring Boot 4**, utilizando **JPA/Hibernate** para persistência de dados, com foco em **arquitetura limpa, boas práticas e padrões de mercado**. Ele foi construído com foco em boas práticas de arquitetura, separação de responsabilidades e organização em camadas, servindo como base sólida para aplicações backend modernas em Java.

O projeto é inspirado no workshop *"Web services com Spring Boot e JPA / Hibernate"* do professor **Nélio Alves**, porém utiliza a **versão **Spring Boot 4****.

---

## 🎯 Objetivos do Projeto

Este projeto foi desenvolvido com foco em **portfólio**, demonstrando domínio em **backend Java**, **arquitetura REST** e **modelagem de dados relacional**.

* Criar uma API RESTful com Spring Boot
* Implementar um modelo de domínio consistente
* Estruturar corretamente as camadas da aplicação
* Configurar banco de dados em memória (H2) para testes
* Utilizar PostgreSQL em ambiente de desenvolvimento/produção
* Implementar operações CRUD completas
* Aplicar tratamento global de exceções
* Trabalhar com relacionamentos complexos entre entidades

---

## 🧱 Arquitetura Utilizada

A arquitetura adotada segue padrões amplamente utilizados no mercado, garantindo **manutenibilidade, escalabilidade e fácil evolução do código**.

O projeto segue uma **arquitetura em camadas**, separando claramente as responsabilidades:

### 📦 Camadas Lógicas

* **Resource (Controller)**
  Responsável por expor os endpoints REST e lidar com requisições HTTP.

* **Service**
  Contém a lógica de negócio da aplicação e coordena o acesso aos repositórios.

* **Repository**
  Camada de acesso a dados, utilizando **Spring Data JPA**.

* **Domain (Model)**
  Define as entidades do sistema, seus relacionamentos e regras básicas.

* **Exception Handling**
  Tratamento centralizado de erros com respostas HTTP padronizadas.

---

## 🛠️ Tecnologias Utilizadas

> Stack moderna e alinhada com aplicações backend profissionais

* **Java** (versão compatível com o Spring Boot mais recente)
* **Spring Boot 4**
* **Spring Web** (API REST)
* **Spring Data JPA**
* **Hibernate** (ORM)
* **H2 Database** (ambiente de testes)
* **PostgreSQL** (ambiente de desenvolvimento/produção)
* **Maven** (gerenciamento de dependências)
* **Jackson** (serialização JSON)

---

## 🗂️ Modelo de Domínio

O domínio da aplicação simula um sistema de pedidos, contendo entidades como:

* **User**
* **Order**
* **Product**
* **Category**
* **OrderItem** (entidade associativa com atributos extras)
* **Payment**

### 🔗 Relacionamentos

* One-to-Many
* Many-to-Many (com `@JoinTable`)
* Many-to-Many com atributos adicionais
* One-to-One

Todos os relacionamentos são devidamente mapeados com **JPA annotations**, utilizando carregamento lazy quando apropriado e evitando loops de serialização com `@JsonIgnore`.

---

## ⚙️ Perfis de Configuração

O projeto utiliza **Spring Profiles** para separar ambientes:

### 🧪 Test (`test`)

* Banco de dados H2 em memória
* Console H2 habilitado
* Criação e população automática do banco

### 💻 Dev (`dev`)

* PostgreSQL local
* `ddl-auto=update`
* Exibição de SQL no console

### 🚀 Prod (`prod`)

* PostgreSQL externo
* Configurações via variáveis de ambiente
* Sem geração automática de schema

---

## 🔄 Funcionalidades Implementadas

> Funcionalidades que demonstram domínio prático do ecossistema Spring

* CRUD completo de usuários
* Associação entre pedidos, produtos e categorias
* Cálculo de subtotal e total de pedidos
* Inserção de dados iniciais (database seeding)
* Tratamento de exceções como:

    * Recurso não encontrado
    * Violação de integridade
    * Erros de banco de dados

---

## 📡 Exemplo de Requisição

```json
{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}
```

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/JulianoAleixo/springboot-jpa.git
```

2. Abra o projeto em sua IDE (IntelliJ, Eclipse, VS Code)

3. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

4. Acesse:

* API: `http://localhost:8080`
* Console H2 (perfil test): `http://localhost:8080/h2-console`

---

## 📚 Referências

* Workshop Spring Boot & JPA — Nélio Alves (DevSuperior)
* Documentação oficial do Spring Boot
* Documentação do Hibernate

---

## 👤 Autor

Projeto desenvolvido com foco em **aprendizado avançado e demonstração de competências backend**.

**Juliano Aleixo**
📌 GitHub: [https://github.com/JulianoAleixo](https://github.com/JulianoAleixo)

---

Se quiser, este projeto pode servir como **template base** para APIs REST em Java com Spring Boot, seguindo padrões profissionais de mercado.
