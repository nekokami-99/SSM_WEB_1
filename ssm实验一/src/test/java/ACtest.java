import com.itheima.mapper.AcMapper;
import com.itheima.pojo.Ac;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ACtest {


/*     （1）*查询课程id=2的课程信息*
* */

@Test
public void textselectById() throws IOException  {
    int id=2;
    //* 1.
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //* 2.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    //* 3.
    AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
    //* 4.
    Ac ac = acMapper.selectById1(id);
    System.out.println(ac);
    //* 5.
    sqlSession.close();
}
/*     (2)查询出所有计算机学院开设的课程信息
* */

    @Test
    public void textselectAll() throws IOException  {
        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.
        List<Ac> brands = acMapper.selectAll1();
        System.out.println(brands);
        //* 5.
        sqlSession.close();
    }


    /*     (3)将 id=4 这?课程的课时数修改为 32+8=40；
     * */


    @Test
    public void update() throws IOException  {
       int id =4;
       int hours = 40;
        //处理参数
        //companyName="%" + companyName +"%";
        //brandName = "%" + brandName + "%";
        //description = "%" + description + "%";


        Map map = new HashMap();
        map.put("hours",hours);
        map.put("id",id);
        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.openSession()中改为ture则传回数据库，否则不改变数据库中数据
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.
        acMapper.update1(map);

        //*提交事务
        //*sqlsession.commit();
        // * 5.
        sqlSession.close();
    }


    /*     (4). 插??条新的课程记录： name=”?数据存储“，hours=32，schools =1；
     * */
    @Test
    public void add() throws IOException  {

        String  name ="大数据存储";
        int hours = 32;
        int sid =1;
        //处理参数
        //companyName="%" + companyName +"%";
        //brandName = "%" + brandName + "%";
        //description = "%" + description + "%";


        Map map = new HashMap();
        map.put("name" , name);
        map.put("hours", hours);
        map.put("sid" , sid);

        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.

        acMapper.add1(map);

        //*提交事务
        //*sqlsession.commit();
        // * 5.
        sqlSession.close();
    }

    /*     (5). .输出所有的学院开设的课程信息。
     * */
    @Test
    public void textselectAll2() throws IOException  {
        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.
        List<Ac> brands = acMapper.selectAllSid();
        System.out.println(brands);
        //* 5.
        sqlSession.close();
    }
}

