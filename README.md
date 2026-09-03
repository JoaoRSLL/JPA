# 🚀 Mapeamento de Objetos com JPA e Hibernate

Projeto prático desenvolvido para exercitar os conceitos fundamentais do **Jakarta Persistence (JPA)** utilizando **Hibernate** como provedor ORM e o banco de dados **PostgreSQL**.

---

## 🛠️ Tecnologias Utilizadas

- **Java** (Versão 25 / 17+)
- **JPA / Jakarta Persistence** (Especificação de Mapeamento Objeto-Relacional)
- **Hibernate Core** (Implementação do ORM)
- **PostgreSQL** (Sistema Gerenciador de Banco de Dados Relacional)
- **Apache Maven** (Gerenciador de dependências e build)

---

## 📌 Funcionalidades e Conceitos Demonstrados

- [x] Mapeamento de entidade com `@Entity`, `@Id` e estratégia de geração `@GeneratedValue(strategy = GenerationType.IDENTITY)`
- [x] Implementação da interface `Serializable` e versionamento com `@Serial`
- [x] Gerenciamento das entidades com `EntityManagerFactory` e `EntityManager`
- [x] Controle de transações locais (`EntityTransaction` com `begin()` e `commit()`)
- [x] Operações de persistência (`persist`) e consulta por chave primária (`find`)
- [x] Configuração da unidade de persistência via `persistence.xml` para conexões PostgreSQL

---

## 📁 Estrutura do Projeto

```text
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── domain
│   │   │   │   └── Person.java       # Entidade mapeada no banco
│   │   │   └── Main.java             # Classe executável (CRUD e testes)
│   │   └── resources
│   │       └── META-INF
│   │           └── persistence.xml   # Configurações da Persistence Unit e PostgreSQL
├── .gitignore                        # Arquivos ignorados pelo Git
├── pom.xml                           # Dependências do Maven (Hibernate + Driver JDBC)
└── README.md                         # Documentação do projeto