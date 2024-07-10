import com.tommy.mapper.EmployeeMapper;
import com.tommy.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: Test1
 * PackageName: PACKAGE_NAME
 * Create: 2024/6/12-21:23
 * Description: 测试#{}方法
 */
public class Test1 {
    @Test
    public void testAssign() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = factory.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.queryById(1);

        System.out.println(employee);
    }
}
