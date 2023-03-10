[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/Spring-Data-JPA-com-Java/blob/main/LICENSE)

<h1 align="center">Projeto Spring Data JPA com Java </h1>

<p align="center"><img width="450px" src="https://github.com/lucarauj/assets/blob/main/Spring%20Data%20JPA.png" /></p>

<br> 

<h2>🎯 Objetivo do Projeto</h2>
<p>Conhecer os principais conceitos de mapeamento objeto relacional (ORM) usando o <strong>Spring Data JPA</strong>. 
<p> Uma <strong>API Restfull</strong> foi desenvolvida com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.</p>

<br> 

### ☢ Dependências:

- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Validation
- Lombok
- Swagger

<br> 

### ✔ Utilizando o Swagger:

<img width="800px" src="https://github.com/lucarauj/Spring-Data-JPA-com-Java/blob/main/src/images/Swagger.png"/>

<br> 

## 📝 Anotações:

- @Autowired: delega ao Spring Boot a inicialização do objeto;
- @AllArgsConstructor: gera um construtor com 1 parâmetro para cada atributo de sua classe;
- @CPF: anotação que valida se um valor númerico passado equivale a um CPF;
- @Column: especifica o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados;
- @Data: gera o código padronizado (getters, setters, toString apropriado, equals e implementações hashCode;
- @DecimalMin: especifica se a propriedade de configuração decorada com essa anotação deve ter um valor maior ou igual ao mínimo especificado;
- @DeleteMapping: usada para mapear solicitações HTTP DELETE em métodos manipuladores específicos;
- @Entity: especifica que a classe anotada atualmente representa um tipo de entidade;
- @GeneratedValue: especifica que o valor do identificador de entidade é gerado automaticamente;
- @GetMapping: usada para mapear solicitações HTTP GET em métodos manipuladores específicos;
- @Id: especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado;
- @JsonIgnore: marca uma propriedade a ser ignorada no nível de campo;
- @JsonIgnoreProperties: marca uma propriedade ou um grupo de propriedades a serem ignoradas;
- @JoinColumn: especifica a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento;
- @ManyToOne: especifica um relacionamento de banco de dados muitos-para-um;
- @NotBlank: um atributo do tipo String não pode ser nulo e nem vazio;
- @NotNull: checa se o valor anotado não é nulo (null);
- @NoArgsConstructor: responsável por gerar um construtor sem parâmetros;
- @NotEmpty: valida se a propriedade não é nula nem vazia e pode ser utilizada com String, Collection, Map ou array;
- @OneToMany: especifica um relacionamento de banco de dados um-para-muitos;
- @OneToOne: especifica um relacionamento de banco de dados um-para-um;
- @Past: valida se o valor da data está no passado;
- @PostMapping: usada para mapear solicitações HTTP POST em métodos específicos de manipulador;
- @PutMapping: usada para mapear solicitações HTTP PUT em métodos manipuladores específicos;
- @PathVariable: indica que o valor da variável virá de uma informação da rota;
- @Positive: valida se o valor numérico passado é positivo;
- @Query: permite criar instruções SQL e expor essas instruções como métodos DAO;
- @RestController: marca a classe como um controlador onde cada método retorna um objeto de domínio em vez de uma visão;
- @RequestMapping: usada para mapear solicitações da web para classes manipuladoras especificas e métodos manipuladores;
- @Query: permite criar instruções SQL e expor essas instruções como métodos DAO;
- @Repository: serve para definir uma classe como pertencente à camada de persistência;
- @RequestBody: indica que o valor do objeto virá do corpo da requisição;
- @Service: marca uma classe Java que executa algum serviço;
- @Size: confere se a quantidade de elementos está entre o mínimo e o máximo, suportando tipos como: Strings, Collections, Maps e arrays;
- @Table: especifica a tabela principal da entidade atualmente anotada;
- @Valid: indica que o valor do objeto virá do corpo da requisição;

<br> 

### 🚀 Principais tecnologias utilizadas no projeto:

<div style="display: inline_block"><br>
<img align="center" alt="Lucarauj-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
<img align="center" alt="Lucarauj-Postman" height="50" width="90" src="https://github.com/lucarauj/assets/blob/main/postman.png">
<img align="center" alt="Lucarauj-Spring" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">
<img align="center" alt="Lucarauj-SpringBoot" height="40" width="110" src="https://github.com/lucarauj/assets/blob/main/SpringBoot.jpeg">
<img align="center" alt="Lucarauj-Maven" height="50" width="60" src="https://github.com/lucarauj/assets/blob/main/Maven-Apache.svg">
<img align="center" alt="Lucarauj-Swagger" height="30" width="90" src="https://github.com/lucarauj/assets/blob/main/Swagger.png">
<img align="center" alt="Lucarauj-Postgresql" height="40" width="50" src="https://github.com/lucarauj/assets/blob/main/postgresql.svg">
</div>

<br> 

<h2>🔗 Links Úteis</h2>
<ul>
    <li><a href="https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok">Spring Initializr</a></li>
    <li><a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html">Common application properties</a></li>
    <li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories">Spring Data JPA - Reference Documentation</a></li>
</ul>

<br> 

### 👉 Aula desenvolvida por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").

<br>

## Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>


