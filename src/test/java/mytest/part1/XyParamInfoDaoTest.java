package mytest.part1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by liufq on 10/1/18.
 */
public class XyParamInfoDaoTest {
    public static void main(String[] args) {
        SqlSession session = null;
        try{

            String resource = "resources/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession();
            XyParamInfoDao xyParamInfoDao = session.getMapper(XyParamInfoDao.class);
            XyParamInfo xyParamInfo = xyParamInfoDao.getByPrimaryKey("busiType","t001");
            System.out.println(xyParamInfo.getParamValue());
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
