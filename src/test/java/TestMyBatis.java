import com.atguigu.bean.Account;
import com.atguigu.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 李政澎
 * @Description
 * @create 2022-05-12 15:47
 */
//public class TestMyBatis {
//    @Test
//    public void testMybatis(){
//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
////            List<Account> list = mapper.getAll();
////            list.forEach(System.out::println);
//            mapper.saveAccount(new Account(null,"张三",1000.0));
//            sqlSession.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
