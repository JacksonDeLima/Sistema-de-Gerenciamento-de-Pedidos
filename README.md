# PatternCommerce - Sistema de Gerenciamento de Pedidos

## 📝 Descrição

`PatternCommerce` é uma aplicação Spring Boot demonstrativa que serve como um Sistema de Gerenciamento de Pedidos. O principal objetivo deste projeto é aplicar e demonstrar o uso de diversos Padrões de Projeto (Design Patterns) em um contexto prático e realista de um e-commerce.

## ✨ Funcionalidades

*   Gerenciamento de Pedidos (em desenvolvimento)
*   Diferentes estratégias de pagamento

## 🚀 Tecnologias Utilizadas

*   **Java 21:** Versão mais recente do Java, trazendo melhorias de performance e novas funcionalidades da linguagem.
*   **Spring Boot 3.5.5:** Framework para criação de aplicações Java de forma rápida e configurável.
*   **Spring Web:** Para a construção de APIs RESTful.
*   **Spring Data JPA:** Para a persistência de dados e abstração do acesso ao banco de dados.
*   **Maven:** Gerenciador de dependências e build do projeto.
*   **H2 Database:** Banco de dados em memória para facilitar o desenvolvimento e os testes, sem a necessidade de configurar um banco de dados externo.

## ⚙️ Como Executar o Projeto

Siga os passos abaixo para executar a aplicação em seu ambiente local.

### Pré-requisitos

*   JDK 21 ou superior instalado.
*   Maven instalado (ou utilize o Maven Wrapper incluído no projeto).
*   Um cliente Git para clonar o repositório.

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/JacksonDeLima/Sistema-de-Gerenciamento-de-Pedidos.git
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd Sistema-de-Gerenciamento-de-Pedidos/design-patterns
    ```

3.  **Execute a aplicação com o Maven Wrapper:**
    *   No Linux ou macOS:
        ```bash
        ./mvnw spring-boot:run
        ```
    *   No Windows:
        ```bash
        mvnw.cmd spring-boot:run
        ```

4.  **Acesse a aplicação:**
    *   A API estará disponível em `http://localhost:8080`.
    *   O console do banco de dados H2 pode ser acessado em `http://localhost:8080/h2-console`.

### Configuração do Banco de Dados H2

Para acessar o console do H2, utilize as seguintes configurações (conforme definido em `application.properties`):

*   **Driver Class:** `org.h2.Driver`
*   **JDBC URL:** `jdbc:h2:mem:testdb`
*   **User Name:** `sa`
*   **Password:** (deixe em branco)

## 🎨 Padrões de Projeto Implementados

Este projeto visa implementar e documentar os seguintes padrões de projeto:

*   **Strategy:** Utilizado para definir diferentes algoritmos de pagamento (ex: Cartão de Crédito, Pix, Boleto), permitindo que o cliente escolha a forma de pagamento dinamicamente em tempo de execução.
*   *(Outros padrões serão adicionados conforme o desenvolvimento do projeto)*