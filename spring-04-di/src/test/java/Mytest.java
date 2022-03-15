import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getAddress());
        System.out.println(student.getName());
        System.out.println(student.toString());
    }

    @Test
    public void test2(){
       ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user2 = (User) context.getBean("user2");
        User user = (User) context.getBean("user");

        System.out.println(user==user2);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user2.toString());
    }

}
