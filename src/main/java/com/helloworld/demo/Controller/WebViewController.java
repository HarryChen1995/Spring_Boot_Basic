package com.helloworld.demo.Controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class WebViewController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView HomePage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
