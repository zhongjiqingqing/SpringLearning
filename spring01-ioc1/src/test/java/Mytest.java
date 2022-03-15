import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Mytest {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
         service.setUserDao(new UserDaoMysqlImpl());
        service.getUser();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();
        System.out.println();

    }
    @Test
    public void test3(){
        //获取applicationContext 拿到spring的容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 容器在手 天下我有 需要什么 直接get什么
        UserServiceImpl serviceImpl = (UserServiceImpl) applicationContext.getBean("ServiceImpl");

        serviceImpl.getUser();
    }
}
