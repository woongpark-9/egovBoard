package egovframework.example.ivory.dao;
 
import java.util.List;
 
import egovframework.example.ivory.vo.TestVo;
 
public interface TestDao {
 
    public List<TestVo> selectTest(TestVo testVo) throws Exception;
 
}


