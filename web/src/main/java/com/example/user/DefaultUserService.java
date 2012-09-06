package com.example.user;


import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
@Service
@Transactional(readOnly = false)
class DefaultUserService implements UserService {

    private EntityManager entityManager;
    private PasswordEncoder encoder;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Inject
    public void setEndoder(final PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @Override
    public void add(User admin) {
        admin.setPassword(encoder.encodePassword(admin.getPassword(), null));
        entityManager.persist(admin);
        entityManager.flush();
    }

    @Override
    public User update(User admin) {
        return entityManager.merge(admin);
    }

    @Override
    public List<User> getAllAdmins() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User read(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void delete(long id) {
        entityManager.remove(read(id));
    }
}
