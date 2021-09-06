package egovframework.example.ivory.service;
 
import java.util.List;
 
import egovframework.example.ivory.vo.TestVo;
 
public interface TestService {
 
    public List<TestVo> selectTest(TestVo testVo) throws Exception;
 
}


