package task9;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task9.entity.OneToManyAndManyToOne.Department;
import ru.aston.lurie_pa.task9.entity.OneToManyAndManyToOne.Developer;
import ru.aston.lurie_pa.task9.entity.OneToManyAndManyToOne.Grade;
import ru.aston.lurie_pa.task9.entity.OneToManyAndManyToOne.Language;
import ru.aston.lurie_pa.task9.connection.GetConnectionWithDB;
import ru.aston.lurie_pa.task9.entity.convertor.Birthday;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class OneToManyAndManyToOneTest {
    private static SessionFactory sessionFactory;
    private Session session;
    private Department department;
    private Developer developers;
    private List<Developer> developerList;


    @Test
    public void addDepartmentTest(){
        sessionFactory = GetConnectionWithDB.startSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

        developers = Developer.builder()
                .name("John")
                .surname("Dorian")
                .birthday(new Birthday(LocalDate.of(1990, 6, 15)))
                .language(Language.JAVASCRIPT)
                .grade(Grade.SENIOR)
                .build();

        developerList = new ArrayList<>();
        developerList.add(developers);

        department = Department.builder()
                .name("Department of Development")
                .nameChief("Mike Smith")
                .amountOfWorkers(20)
                .developers(developerList)
                .build();

        session.saveOrUpdate(developers);
        session.saveOrUpdate(department);

        session.getTransaction().commit();
        GetConnectionWithDB.shutdown();
    }

    @Test
    public void addDevelopersTest(){
        sessionFactory = GetConnectionWithDB.startSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

        developers = Developer.builder()
                .name("Kate")
                .surname("Jonson")
                .birthday(new Birthday(LocalDate.of(2002, 5, 7)))
                .language(Language.JAVA)
                .grade(Grade.JUNIOR)
                .build();

        developerList = new ArrayList<>();
        developerList.add(developers);

        Department department1 = session.get(Department.class, 1L);
        department1.getDevelopers().add(developers);

        session.getTransaction().commit();
        GetConnectionWithDB.shutdown();
    }

    @Test
    public void getDeveloperTest(){
        sessionFactory = GetConnectionWithDB.startSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

        Department department1 = session.get(Department.class, 1L);
        for (Developer dev : department1.getDevelopers()){
            System.out.println(dev.getName() + " " +
                    dev.getSurname() + " " +
                    dev.getDepartment().getName());
        }
        session.getTransaction().commit();
        GetConnectionWithDB.shutdown();
    }

    @Test
    public void getDepartment(){
        sessionFactory = GetConnectionWithDB.startSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

        Developer developer = session.get(Developer.class, 2L);
        System.out.println(developer.getDepartment().getName() + " " +
                developer.getName() + " " +
                developer.getSurname());


        session.getTransaction().commit();
        GetConnectionWithDB.shutdown();
    }
}
