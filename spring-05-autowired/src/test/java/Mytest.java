import com.kuang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {


    @Test
    public void  test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People person = (People) context.getBean("people");
        System.out.println(person.toString());
        person.getCat().shout();
        person.getDog().shout();
    }
}

