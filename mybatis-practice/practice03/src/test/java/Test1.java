import com.tommy.mapper.UserMapper;
import com.tommy.pojo.User;
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
 * Create: 2024/6/14-17:34
 * Description:
 */
public class Test1 {
    @Test
    public void testInsert() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-comfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = factory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setUsername("Jay");
        user.setPassword("123456");
        mapper.insert(user);

        sqlSession.close();
    }
}
