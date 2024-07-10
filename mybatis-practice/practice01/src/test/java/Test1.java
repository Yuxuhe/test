import com.tommy.mapper.EmployeeMapper;
import com.tommy.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: Test1
 * PackageName: PACKAGE_NAME
 * Create: 2024/6/11-21:07
 * Description:
 */
public class Test1 {

    @Test
    public void testMybatis() throws IOException {
        // 先读取外部配置文件，即mybatis的配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        // 创建sqlSessionFactory
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 根据sqlSessionFactory创建sqlSession对象
        SqlSession sqlSession = build.openSession();

        // 获取接口的代理对象，通过代理对象来实现接口中的目标方法
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectEmployee(2);
        System.out.println(employee);

        // 释放资源
        sqlSession.commit();
        sqlSession.close();
    }

}
