import com.tommy.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: Test1
 * PackageName: PACKAGE_NAME
 * Create: 2024/6/15-16:22
 * Description:
 */
public class Test1 {

    private SqlSession sqlSession;
    @BeforeEach
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        sqlSession = factory.openSession(true);
    }

    @AfterEach
    public void clean(){
        sqlSession.close();
    }
    @Test
    public void testMap() throws IOException {
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        System.out.println(mapper.queryOrderById(1));
    }
}
