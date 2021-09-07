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
 
    
    @Override
    public TestVo selectDetail(int testId) throws Exception {
    	// TODO Auto-generated method stub

    	return sqlSession.selectOne(namespace+".selectDetail",testId);
    }
    
    @Override
    public void insertTest(TestVo vo) throws Exception {
    	// TODO Auto-generated method stub
    	sqlSession.insert(namespace+".insertTest",vo);
    }
    
    
    @Override
    public void updateTest(TestVo vo) throws Exception {
    	// TODO Auto-generated method stub
    	sqlSession.update(namespace+".updateTest",vo);
    }
    
    @Override
    public void deleteTest(int testId) throws Exception {
    	// TODO Auto-generated method stub
    	sqlSession.delete(namespace+".deleteTest",testId);
    }
}

