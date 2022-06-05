import com.chen.pojo.Student;
import com.chen.pojo.StudentImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void studentImplTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentImpl studentImpl = context.getBean("studentImpl", StudentImpl.class);
        for (Student selectStudent : studentImpl.selectStudents()) {
            System.out.println(selectStudent);
        }
    }
}
