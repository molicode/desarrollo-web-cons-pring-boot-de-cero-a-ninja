package com.udemy.controller;

import com.udemy.component.ExampleComponent;
import com.udemy.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {

    public static final String EXAMPLE_VIEW = "example";

    @Autowired
    @Qualifier("exampleService")
    private ExampleService exampleService;

    @Autowired
    @Qualifier("exampleComponent")
    private ExampleComponent exampleComponent;

    //Primera forma
    @GetMapping("/exampleString")
    //@RequestMapping(value="exampleString", method = RequestMethod.GET)
    public String exampleString(Model model) {
        exampleComponent.sayHello();

        //model.addAttribute("person", new Person("Alejandro",36));
        model.addAttribute("people", exampleService.getListPeople());
        return EXAMPLE_VIEW;
    }

    //Segunda forma
    @GetMapping("/exampleMAV")
    //@RequestMapping(value="exampleMAV", method = RequestMethod.GET)
    public ModelAndView exampleMAV() {
        ModelAndView modelAndView = new ModelAndView(EXAMPLE_VIEW);
        //modelAndView.addObject("person", new Person("Alberto",30));
        modelAndView.addObject("people", exampleService.getListPeople());
        return modelAndView;
    }


}
