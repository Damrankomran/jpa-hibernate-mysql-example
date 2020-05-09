package com.project.jpaFactory.impl;

import com.project.jpaFactory.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFactoryImpl implements JpaFactory {

    private EntityManager entityManager = null;

    @Override
    public EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

        this.entityManager = factory.createEntityManager();

        return entityManager;
    }

    @Override
    public EntityTransaction getTransaction() {

        return this.entityManager.getTransaction();
    }
}
