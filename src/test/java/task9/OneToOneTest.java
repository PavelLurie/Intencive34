package task9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task9.connection.GetConnectionWithDB;
import ru.aston.lurie_pa.task9.entity.OneToOne.Mentor;
import ru.aston.lurie_pa.task9.entity.OneToOne.Trainee;


public class OneToOneTest {
    private static SessionFactory sessionFactory;
    private Session session;
    private Mentor mentor;
    private Trainee trainee;
    @Test
    public void addMentorAndTraineeTest(){
        sessionFactory = GetConnectionWithDB.startSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

        mentor = Mentor.builder()
                .name("Сергей")
                .surname("Смирнов")
                .grade("Middle")
                .jsonFile("{\"author\":\"pavel lurie\"}")
                .build();

        trainee = Trainee.builder()
                .name("Николай")
                .surname("Иванов")
                .course("Java")
                .mentor(mentor)
                .build();

        session.save(mentor);
        session.save(trainee);

        session.getTransaction().commit();
        GetConnectionWithDB.shutdown();
    }
}
