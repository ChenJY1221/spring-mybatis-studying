import com.chen.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void HelloTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //默认使用无参构造创建对象
        //使用有参构造 要用constructor-arg
        Hello hello = (Hello) context.getBean("helloo");
        System.out.println(hello.toString());
    }
}
