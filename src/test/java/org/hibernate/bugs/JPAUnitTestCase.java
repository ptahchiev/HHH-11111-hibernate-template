package org.hibernate.bugs;

import org.hibernate.bugs.hhh111111.LocalizedLobValue;
import org.hibernate.bugs.hhh111111.LocalizedValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.assertNotNull;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM, using the Java Persistence API.
 */
public class JPAUnitTestCase {

    private EntityManagerFactory entityManagerFactory;

    @Before
    public void init() {
        entityManagerFactory = Persistence.createEntityManagerFactory("templatePU");
    }

    @After
    public void destroy() {
        entityManagerFactory.close();
    }

    @Test
    public void hhh11111() throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        assertNotNull(entityManager.getMetamodel().embeddable(LocalizedValue.class));
        assertNotNull(entityManager.getMetamodel().embeddable(LocalizedLobValue.class));
    }
}
