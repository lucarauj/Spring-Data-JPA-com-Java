<h1>Projeto Spring Data JPA na Prática </h1>

<h2>🎯 Objetivo do Projeto</h2>
<p>Conhecer os principais conceitos de mapeamento objeto relacional (ORM) usando o <strong>Spring Data JPA</strong>. 
Uma <strong>API Restfull</strong> foi desenvolvida com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.</p>


<h2> 🚦 Guia </h2>

<ol>
    <li> Apresentação do Projeto Base </li>
    <li> Configuração do banco de dados (SGBD <em>PostgreSQL</em>)</li>
    <li> Aplicando as <em>annotations</em></li>
    <li>Execução do fluxo back-end: <em>Controller - Service - Repository</em></li>
    <li>Validação - <em>Hibernate Validator</em> </li>
    <li>Consultas Avançadas - <em>Derived Query - Native Query</em></li>
</ol>

<h2>🛠 Tecnologias Utilizadas</h2>

- Java 11
- Maven
- Postman

Dependências:

- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Validation
- Lombok

Anotações:

- @Data
- @NoArgsConstructor
- @AllArgsConstructor
- @Entity: especifica que a classe anotada atualmente representa um tipo de entidade;
- @Table: especifica a tabela principal da entidade atualmente anotada;
- @Id: especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado;
- @GeneratedValue: especifica que o valor do identificador de entidade é gerado automaticamente;
- @Column: especifica o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados;
- @OneToMany: especifica um relacionamento de banco de dados um-para-muitos;
- @JsonIgnore
- @JsonIgnoreProperties
- @ManyToOne: especifica um relacionamento de banco de dados muitos-para-um;
- @JoinColumn: especifica a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento;
- @OneToOne: especifica um relacionamento de banco de dados um-para-um;
- @RestController
- @RequestMapping
- @Autowired
- @PostMapping
- @GetMapping
- @PutMapping
- @DeleteMapping
- @Service
- @Repository
- @ResquestBody
- @PathVariable
- @Valid
- @NotBlank
- @NotNull
- @CPF
- @Past
- @Size
- @Positive
- @DecimalMin
- @NotEmpty
- @RequestParam
- @Query


<h2><a href="https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/"> Anotações de Mapeamento </a></h2>




<h2>🔗 Links Úteis</h2>
<ul>
    <li><a href="https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok">Spring Initializr</a></li>
    <li><a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html">Common application properties</a></li>
    <li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories">Spring Data JPA - Reference Documentation</a></li>
</ul>


Disponibilizado com ♥ por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").




