package domain;

import java.io.Serial;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/* Entidade domain.Person: representa a tabela no banco de dados */
@Entity
public class Person implements Serializable {

    /* Identificador de versão exigido para o controle de serialização da classe */
    @Serial
    private static final long serialVersionUID = 1L;

    /* Chave primária da tabela, gerada automaticamente pelo banco via auto-incremento (IDENTITY) */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;

    /* Construtor padrão sem argumentos: requisito obrigatório da especificação do JPA */
    public Person (){
    }

    /* Construtor completo: útil para testes, reconstrução de objetos e consultas JPQL */
    public Person(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    /* Construtor sem ID: ideal para instanciar novos registros antes de persisti-los no banco */
    public Person( String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* Sobrescreve toString para facilitar a visualização dos dados nos logs e depurações */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
