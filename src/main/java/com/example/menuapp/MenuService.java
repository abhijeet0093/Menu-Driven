package com.example.menuapp;

import com.example.menuapp.entity.User;
import com.example.menuapp.util.HibernateUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class MenuService {
    public void createUser(String name, String email) {
        EntityManager em = HibernateUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        em.persist(user);
        tx.commit();
        em.close();
    }

    public void listUsers() {
        EntityManager em = HibernateUtil.getEntityManager();
        List<User> users = em.createQuery("FROM User", User.class).getResultList();
        users.forEach(u -> System.out.println(u.getId() + " " + u.getName() + " " + u.getEmail()));
        em.close();
    }
}
