package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller  // 이 클래스가 웹 요청 처리 담당
public class HomeController {

    @ModelAttribute("course") // 기본 세팅값 자동 주입
    public String courseName() {
        return "java";
    }

    @RequestMapping("/")  // "/" 요청 처리
    public String home() {
        return "index";  // /views/index.jsp 반환
    }

    @RequestMapping("add")  // "/add" 요청 처리
    public ModelAndView add(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            ModelAndView mv) {

        int result = num1 + num2;  // 계산

        mv.addObject("result", result);  // JSP로 데이터 전달
        mv.setViewName("result");        // result.jsp 이동
        return mv;
    }

    @RequestMapping("addAlien")  // "/addAlien" 요청 처리
    public String addAlien(Alien alien) {
        return "result";
    }
}
