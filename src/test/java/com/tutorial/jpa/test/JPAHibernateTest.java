package com.tutorial.jpa.test;

import org.h2.tools.RunScript;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;

public class JPAHibernateTest {
	
	private final static String REPOSITORY_UNIT="tutorial-jpa";

	protected static EntityManagerFactory emf;
    protected static EntityManager em;
    
    @BeforeClass
    public static void init() throws FileNotFoundException, SQLException {
        emf = Persistence.createEntityManagerFactory(REPOSITORY_UNIT);
        em = emf.createEntityManager();
    }
    @Before
    public void initializeDatabase(){
        Session session = em.unwrap(Session.class);
        session.doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                try {
//                	hack %20 is on file path Edgar%20Barradas%Alves
//                	final File script = new File(getClass().getResource("/data.sql").getFile());
                	final File script = new File("C:\\Users\\Edgar Barradas Alves\\workspace\\Tutorial-Jpa\\target\\test-classes\\data.sql");
                    RunScript.execute(connection, new FileReader(script));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException("could not initialize with script");
                }
            }
        });
    }

    @AfterClass
    public static void tearDown(){
        em.clear();
        em.close();
        emf.close();
    }

}
