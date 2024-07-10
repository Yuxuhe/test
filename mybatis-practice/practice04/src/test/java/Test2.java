import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tommy.mapper.EmployeeMapper;
import com.tommy.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName: Test2
 * PackageName: PACKAGE_NAME
 * Create: 2024/6/16-16:58
 * Description:测试分页
 */
public class Test2 {
    private SqlSession sqlSession;
    @BeforeEach
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        sqlSession = factory.openSession(true);
    }

    @AfterEach
    public void close(){
        sqlSession.close();
    }

    @Test
    public void testLimit(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = mapper.queryList();

        PageHelper.startPage(1,2);
        PageInfo<Employee> employeePageInfo = new PageInfo<>(employeeList);

        // 查看当前页的数据
        List<Employee> list = employeePageInfo.getList();
    }
}
