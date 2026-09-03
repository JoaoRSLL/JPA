import domain.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        /* Instanciação de objetos para simular o cadastro de novos registros.
        *  A ausência do ID inicial deixa a geração do campo para o auto-incremento
        * no banco via IDENTITY
        * */
        Person p1 = new Person("Joao", "joao@gmail.com");
        Person p2 = new Person("Maria", "maria@gmail.com");
        Person p3 = new Person("Jose", "jose@gmail.com");

        /* Inicializa a unidade de persistência "JPA" definida no persistence.xml */
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("JPA");

        /* Cria o gerenciador de entidades responsável pelas operações de CRUD */
        EntityManager em1 = emf1.createEntityManager();

        /* Inicia a transação local necessária para operações de escrita */
        em1.getTransaction().begin();

        /* Prepara os objetos para serem salvos no banco de dados */
        em1.persist(p1);
        em1.persist(p2);
        em1.persist(p3);

        /* Confirma e executa os comandos SQL no PostgreSQL */
        em1.getTransaction().commit();

        /* Busca um registro no banco pela chave primária (ID = 2) */
        Person p0 = em1.find(Person.class, 2);
        System.out.println(p0);

        /* Libera os recursos e encerra as conexões ativas */

        em1.close();
        emf1.close();
    }
}