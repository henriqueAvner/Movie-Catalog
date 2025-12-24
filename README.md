# 💻 Exercício: Movie Catalog API (Modelo Fitness API)

Este projeto tem como objetivo replicar a estrutura e o fluxo de dados do projeto **Fitness API** da Trybe, aplicando os conceitos de **API REST com Spring Boot**, **Controladores** e **DTOs** no contexto de um catálogo de filmes.

## 🎯 Tema Central: Gerenciamento de Filmes Simples

O sistema deve permitir o CRUD (Create, Read, Update, Delete) de filmes, focando na separação de responsabilidades entre as camadas.

## 📝 Requisitos

### 1. Modelagem de Entidade e DTOs

Crie as seguintes classes:

*   **`Filme` (Entidade):** Deve ter os campos: `id` (Long), `titulo` (String), `diretor` (String), `anoLancamento` (Integer).
*   **`FilmeDTO` (Entrada e Saída):** Usado para comunicação com o cliente. Deve conter `id`, `titulo`, `diretor` e `anoLancamento`.

### 2. Camada de Serviço e Mapeamento

*   Crie a classe `FilmeService` (`@Service`) para a lógica de negócio.
*   Crie uma classe `FilmeMapper` (ou use métodos estáticos no `Service`) para converter:
    *   `FilmeDTO` **para** `Filme`.
    *   `Filme` **para** `FilmeDTO`.
*   Implemente os seguintes métodos no `FilmeService`:
    *   `criar(Filme filme)`: Salva o novo filme.
    *   `buscarTodos()`: Retorna a lista de todos os filmes.
    *   `atualizar(Long id, Filme filme)`: Atualiza o filme existente.
    *   `deletar(Long id)`: Remove o filme.

### 3. Implementação do Controlador REST

Crie a classe `FilmeController` (`@RestController` e `@RequestMapping("/filmes")`) e implemente os seguintes *endpoints*, utilizando o `FilmeDTO` para todas as operações de entrada e saída:

| Verbo HTTP | Rota | DTO de Entrada | DTO de Saída | Objetivo |
| :--- | :--- | :--- | :--- | :--- |
| **POST** | `/filmes` | `FilmeDTO` | `FilmeDTO` | Criar um novo filme. |
| **GET** | `/filmes` | Nenhum | `List<FilmeDTO>` | Listar todos os filmes. |
| **PUT** | `/filmes/{id}` | `FilmeDTO` | `FilmeDTO` | Atualizar um filme por ID. |
| **DELETE** | `/filmes/{id}` | Nenhum | Nenhum (Status 204) | Excluir um filme por ID. |

### 4. Camada de Repositório (Mock)

*   Crie uma interface `FilmeRepository` e uma implementação `FilmeRepositoryMock` (`@Repository`) para simular o banco de dados (usando uma `List` em memória).
*   O `FilmeService` deve injetar a interface `FilmeRepository`.

---

## 🚀 Estrutura Sugerida

```
src/main/java/com/example/moviecatalog/
├── controller/
│   └── FilmeController.java
├── service/
│   └── FilmeService.java
├── repository/
│   ├── FilmeRepository.java (Interface)
│   └── FilmeRepositoryMock.java (Implementação @Repository)
├── model/
│   └── Filme.java (Entidade)
└── dto/
    └── FilmeDTO.java
```

**Autor:** Manus AI
**Data:** Dezembro de 2025
