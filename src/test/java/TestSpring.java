import com.atguigu.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 李政澎
 * @Description
 * @create 2022-05-12 14:25
 */
public class TestSpring {
    @Test
    public void springTest(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService =(AccountService) ac.getBean("accountServiceImpl");
        //调用方法
        accountService.getAll();
    }
}
