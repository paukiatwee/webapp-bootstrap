package com.example.user;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional(readOnly = false)
class DefaultUserService implements UserService {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Admin admin) {
        entityManager.persist(admin);
        entityManager.flush();
    }

    @Override
    public Admin update(Admin admin) {
        return entityManager.merge(admin);
    }

    @Override
    public List<Admin> getAllAdmins() {
        return entityManager.createQuery("FROM Admin", Admin.class).getResultList();
    }

    @Override
    public Admin read(long id) {
        return entityManager.find(Admin.class, id);
    }

    @Override
    public void delete(long id) {
        entityManager.remove(read(id));
    }
}
