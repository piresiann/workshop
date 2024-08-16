# CRUD de Estoque de Produtos com Spring Boot
##  Sobre o projeto
Este projeto é uma aplicação backend desenvolvida com Spring Boot, organizada em camadas lógicas para implementar um CRUD (Create, Read, Update, Delete) de um estoque de produtos, integrando-o com pedidos associados.  


## Funcionalidades
- Gerenciamento de Usuários: Criação, leitura, atualização e exclusão de usuários.
- Gerenciamento de Pedidos: Registro e consulta de pedidos realizados por usuários.
- Gerenciamento de Produtos: Cadastro e manipulação de produtos disponíveis no estoque.
- Associações entre Entidades: Relacionamento entre usuários, pedidos, produtos e categorias.
- Tratamento de Exceções: tratamento de exceções para lidar com erros durante a execução das operações.

## Retorno da API no Postman
![image](https://github.com/user-attachments/assets/3ee71416-0d81-4f8d-9407-3d1fe6a0b2fb)

## Camadas Lógicas
![image](https://github.com/user-attachments/assets/5ff7eb61-7156-4d0c-8c44-a37b6077dc83)
 
## modelo de domínio
![image](https://github.com/user-attachments/assets/eab75b1d-aba1-4bbc-a37c-3e3fbfc2409b)

## Tecnologias Utilizadas

- Spring Boot
- Maven
- Java 17
- JPA/Hibernate
- H2 Database
- Postman

## Configuração do Banco de Dados
- Banco de dados em memória H2 com perfil de teste
- Configuração das propriedades em application.properties e application-test.properties
- Mapeamento JPA

## Como Executar
1 - Clone o repositório: git clone git@github.com:piresiann/workshop.git

2 - Navegue até o diretório do projeto: cd workshop

3 - Execute o projeto: ./mvnw spring-boot:run

4 - Acesse a aplicação em http://localhost:8080

## Testes
#### Para testar a inserção de um novo usuário, utilize o seguinte JSON:
{  
  "name": "Bob Brown",  
  "email": "bob@gmail.com",  
  "phone": "977557755",  
  "password": "123456"  
}  

#### Para testar a atualização de um usuário, utilize o seguinte JSON:
{  
  "name": "Bob Brown",  
  "email": "bob@gmail.com",  
  "phone": "977557755"  
}  








