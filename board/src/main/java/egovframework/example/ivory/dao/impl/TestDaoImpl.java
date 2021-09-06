package egovframework.example.ivory.dao.impl;
 
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.ivory.dao.TestDao;
import egovframework.example.ivory.vo.TestVo;
 
@Repository
public class TestDaoImpl implements TestDao {
 
    @Autowired
    private SqlSession sqlSession;
    
    private static String namespace = "egovframework.example.mappers.test";
    
    
    @Override
    public List<TestVo> selectTest(TestVo testVo) throws Exception {
       
        return sqlSession.selectList(namespace+".selectTest");
    }
 
}

