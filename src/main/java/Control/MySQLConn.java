package Control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class MySQLConn {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public MySQLConn() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("pinastravel"); 
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
    }


