package egovframework.example.ivory.dao;
 
import java.util.List;
 
import egovframework.example.ivory.vo.TestVo;
 
public interface TestDao {
 
    public List<TestVo> selectTest(TestVo testVo) throws Exception;
 
    
    public TestVo selectDetail(int testId) throws Exception;

    public void insertTest(TestVo vo) throws Exception;

    public void updateTest(TestVo vo) throws Exception;

    public void deleteTest(int testId) throws Exception;
}  	


