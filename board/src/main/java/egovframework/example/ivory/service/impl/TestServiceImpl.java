package egovframework.example.ivory.service.impl;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.ivory.dao.TestDao;
import egovframework.example.ivory.service.TestService;
import egovframework.example.ivory.vo.TestVo;
 
@Service
public class TestServiceImpl implements TestService{
 
    @Autowired
    private TestDao testDao;
    
    @Override
    public List<TestVo> selectTest(TestVo testVo) throws Exception {
        return testDao.selectTest(testVo);
    }
    
    @Override
    public TestVo selectDetail(int testId) throws Exception {
    	return testDao.selectDetail(testId);
    }
    
    @Override
    public void insertTest(TestVo vo) throws Exception {
    	// TODO Auto-generated method stub
    	testDao.insertTest(vo);
    }
    
    @Override
    public void updateTest(TestVo vo) throws Exception {
    	// TODO Auto-generated method stub
    	testDao.updateTest(vo);
    }
    
    @Override
    public void deleteTest(int testId) throws Exception {
    	// TODO Auto-generated method stub
    	testDao.deleteTest(testId);
    }
 
}
