package egovframework.example.ivory.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    @RequestMapping(value="/testDetail.do")
    public String testDetail(@RequestParam("testId") int testId , Model model) throws Exception{
    
    	TestVo testVo = testService.selectDetail(testId);
    
    	model.addAttribute("vo",testVo);
    
    	return "test/testDetail";
    }
    
    @RequestMapping(value="/testRegister.do" , method = RequestMethod.GET)
    public String testRegister() throws Exception {
    	return "test/testRegister";
    }
    @RequestMapping(value="/insertTest.do" , method = RequestMethod.POST)
    public String insertTest(TestVo vo) throws Exception {
    	testService.insertTest(vo);
    	return "redirect:testList.do";
    }
    @RequestMapping(value="/updateTest.do")
    public String updateTest(TestVo vo) throws Exception{
    	testService.updateTest(vo);
    	return "redirect:testDetail.do?testId="+vo.getTestId();
    }
    
    @RequestMapping(value="/deleteTest.do")
    public String deleteTest(@RequestParam("testId") int testId) throws Exception{
    	System.out.println(testId);
    	testService.deleteTest(testId);
    	
    	return "redirect:testList.do";
    }
    
}

