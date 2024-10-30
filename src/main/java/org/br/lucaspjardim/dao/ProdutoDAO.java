package org.br.lucaspjardim.dao;

import org.br.lucaspjardim.domain.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Author: Lucas Jardim
 */
public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Produto cadastrar(Produto produto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("HibernateeJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return produto;
    }
}
