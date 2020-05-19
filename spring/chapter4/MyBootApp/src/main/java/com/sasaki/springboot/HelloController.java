package com.sasaki.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/{id}")
    public ModelAndView index(@PathVariable int id, ModelAndView mav) {
        mav.setViewName("index");
        mav.addObject("id",id);
        mav.addObject("check",id >= 0);
        mav.addObject("trueVal","POSITIVE!");
        mav.addObject("falseVal","negative...");
        return mav;
    }

}

class DataObject {
    private int id;
    private String name;
    private String value;

    public DataObject(int id, String name, String value) {
        //super();
        this.id = id;
        this.name = name;
        this.value = value;
    }

    // getterとsetterを用意
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getvalue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}