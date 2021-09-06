package egovframework.example.ivory.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
import egovframework.example.ivory.service.TestService;
import egovframework.example.ivory.vo.TestVo;
 
@Controller
public class TestController {
    //https://ivory-room.tistory.com/60?category=875739
    @Autowired
    private TestService testService;
    
    @RequestMapping(value="/testList.do")
    public String testListDo(TestVo testVo, Model model) throws Exception{
        
        model.addAttribute("list", testService.selectTest(testVo));
        
        return "test/testList";
    }
}

