# Projeto Swing com JInternalFrame para Acesso ao PostgreSQL

## Índice
1. [Descrição](#descrição)
2. [Funcionalidades](#funcionalidades)
3. [Tecnologias Utilizadas](#tecnologias-utilizadas)
4. [Instalação](#instalação)
5. [Exemplo de Uso](#exemplo-de-uso)
6. [Dependências](#dependências)
7. [Como Contribuir](#como-contribuir)
8. [Licença](#licença)
9. [Contato](#contato)

Este projeto utiliza a biblioteca Swing para criar interfaces gráficas com menus e exemplos de `JInternalFrame`. 
Além disso, ele oferece funcionalidades Acesso ao banco de dados, tais como:
CREATE, INSERT, DELETE, UPDATE, SELECT e vários exemplos de JOIN

## Funcionalidades

- **Menu Swing**: Interface gráfica com menus interativos.
- **JInternalFrame**: Uso de `JInternalFrame` para gerenciar janelas internas.
- **DDL**: Data Definition Language: Comandos de CREATE, ALTER, DROP, TRUNCATE
- **DML**: Data Manipulation Language: Comandos de  INSERT, UPDATE e DELETE e SELECT com foco no JOIN (INNER JOIN, LEFT JOIN, RIGHT JOIN, UNION e FULL JOIN)
- **CRUD**: Create Retrieved Update e Delete de carros para exemplo
- **Login/Histórico**: JInternalFrame com funcionalidades de login com bloqueio de conta, desbloqeio e histórico de logins
- **Transação**: Exemplo de comandos de SQL dentro de transação. AutoCommit(false). Commit e Rollback
- **Exemplo de Classe User e Operacao**: Classe Operacao para centralizar tarefas básicas de conversão e Classe USer para tratar o usuário
- **Envio de Email**: Usando uma conta google configurada para acesso a aplicativos não seguros
[Voltar ao Índice](#índice)

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto, JDK 21.
- **Swing**: Biblioteca para construção de interfaces gráficas.
- **org.postgresql**: Biblioteca acessar o banco PostgreSQL.
- **com.sun.mail**: Biblioteca para enviar email.
- **Maven**: Gerenciador de dependências.
[Voltar ao Índice](#índice)

## Instalação

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/Macelot/projetoBanco2024.git
    ```
2. **Instale as dependências**:
   Se estiver utilizando Maven, as dependências serão gerenciadas automaticamente. Para instalar o projeto, execute:
    ```bash
    mvn clean install
    ```

3. **Configuração no IDE**:
    - Importe o projeto em sua IDE preferida (como IntelliJ IDEA, Eclipse).
    - Certifique-se de que todas as dependências estão resolvidas.

4. **Executar a aplicação**:
    Execute o seguinte comando para rodar a aplicação:
    ```bash
    mvn exec:java
    ```
[Voltar ao Índice](#índice)

## Dependências

Este projeto utiliza várias bibliotecas externas que são necessárias para o correto funcionamento da aplicação. Abaixo estão as dependências Maven para o seu `pom.xml`:

```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>
<dependency>
    <groupId>com.sun.mail</groupId>
    <artifactId>javax.mail</artifactId>
    <version>1.6.2</version>
</dependency>
```
[Voltar ao Índice](#índice)

## Como Contribuir

Se você deseja contribuir para este projeto, siga as etapas abaixo:

1. Faça um fork deste repositório.
2. Crie uma branch para sua funcionalidade ou correção de bug.
3. Realize as mudanças e commit.
4. Abra um Pull Request com a descrição clara das alterações.
5. Teste as alterações para garantir que o projeto funcione como esperado.
[Voltar ao Índice](#índice)

## Licença

Este projeto está licenciado sob a [Licença MIT](Licenca.md)
[Voltar ao Índice](#índice)

## Contato

Se você tiver alguma dúvida ou sugestão, fique à vontade para me contactar:
[Voltar ao Índice](#índice)