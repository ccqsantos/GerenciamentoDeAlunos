# 📚 Gerenciamento de Alunos

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![React](https://img.shields.io/badge/React-18-61dafb.svg)](https://reactjs.org/)
[![H2 Database](https://img.shields.io/badge/Database-H2-004088.svg)](https://www.h2database.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## 📝 Sobre o Projeto

**Gerenciamento de Alunos** é uma aplicação full-stack para gerenciamento acadêmico, permitindo o cadastro e autenticação de alunos por meio de matrículas. O sistema foi desenvolvido com Spring Boot no backend e React no frontend, utilizando um banco de dados em memória H2 para persistência.

### ✨ Funcionalidades

- ✅ Cadastro de novos alunos
- ✅ Autenticação por matrícula e senha
- ✅ Geração de hash seguro para senhas (BCrypt)
- ✅ Interface com campo de senha com toggle de visibilidade
- ✅ Banco de dados em memória para desenvolvimento e testes

## 🛠️ Tecnologias Utilizadas

### Backend (Spring Boot)
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Security Crypto** (para hash de senhas BCrypt)
- **H2 Database** (banco em memória)
- **Maven**

### Frontend (React)
- **React 18**
- **Axios** (para requisições HTTP)
- **Lucide React** (para ícones)
- **CSS3**

## 🚀 Como Executar o Projeto

### Pré-requisitos

- [JDK 17+](https://adoptium.net/)
- [Node.js 16+](https://nodejs.org/)
- [Maven](https://maven.apache.org/) (ou use o wrapper do Maven incluso)

### 1. Clone o repositório

git clone https://github.com/ccqsantos/GerenciamentoDeAlunos.git
cd GerenciamentoDeAlunos

### 1.5 Adicione um application.properties em /main/resources

cd src/main/resources
touch application.properties

: exemplo de application.properties:
  /////
  # Configurações básicas do banco H2
    spring.datasource.url=jdbc:h2:mem:alunosdb
    spring.datasource.driver-class-name=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=
  
  # Habilitar console H2
    spring.h2.console.enabled=true
    spring.h2.console.path=/h2-console
  
  # Configurações do JPA
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
  
  # Porta do servidor
    server.port=8080
  /////

### 2. Execute o Backend (Spring Boot)

cd GereciamentoAlunosBACKEND
mvn spring-boot:run
O servidor backend será iniciado em: http://localhost:8080

### 3. Execute o Frontend (React)

cd ../GereciamentoAlunosFRONTEND
npm install
npm start
A aplicação frontend será iniciada em: http://localhost:3000

### 📋 Endpoints da API

Método	Endpoint	Descrição
POST	/aluno/register	Cadastra um novo aluno (senha em texto plano, sistema aplica hash)
POST	/aluno/login	Autentica um aluno por matrícula e senha

### Exemplo de Requisição (Cadastro)

json
POST /aluno/register
Content-Type: application/json

{
  "name": "João Silva",
  "birthDate": "2000-01-01",
  "course": "DESENVOLVIMENTO_DE_SOFTWARE",
  "matricula": "20240001",
  "password": "senha123"
}

### 📁 Estrutura do Projeto

GerenciamentoDeAlunos/
├── GereciamentoAlunosBACKEND/     # Backend Spring Boot
│   ├── src/main/java/.../         # Código Java (Controllers, Services, Entities)
│   ├── application.properties     # Configurações do Spring (H2, JPA, etc.)
│   └── pom.xml                    # Dependências do Maven
│
├── GereciamentoAlunosFRONTEND/    # Frontend React
│   ├── src/
│   │   ├── App.js                 # Componente principal
│   │   ├── App.css                # Estilos da aplicação
│   │   └── index.js               # Ponto de entrada React
│   ├── package.json               # Dependências do Node
│   └── public/                    # Arquivos estáticos
│
└── README.md                      # Este arquivo

