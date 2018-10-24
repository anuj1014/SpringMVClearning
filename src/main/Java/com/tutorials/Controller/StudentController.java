package com.tutorials.Controller;


import com.tutorials.Classes.Student;
import com.tutorials.Support.StudentNameSupport;
import com.tutorials.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Binding;
import javax.validation.Valid;


@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    Student student;


    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setDisallowedFields(new String[]{"city"});
        binder.registerCustomEditor(String.class,"studentName",new StudentNameSupport());
    }

    @RequestMapping(value = "StudentRegistration")
    public String studentRegistration(ModelAndView modelAndView){

        return "StudentRegistration";
    }

    //1st Method to capture data from registration page and display to view using @RequestParam
    /*@RequestMapping(value = "StudentDetails", method=RequestMethod.POST)
    public ModelAndView showStudent(@RequestParam ("studentName") String studentName,
                              @RequestParam ("city") String city,
                              @RequestParam ("country") String country,
                              @RequestParam ("pincode") int pincode,
                              @RequestParam ("hobbies") String hobbies,
                              @RequestParam("gender") String gender,
                              ModelMap modelMap){

        student.setStudentName(studentName);
        student.setCountry(country);
        student.setCity(city);
        student.setPincode(pincode);
        student.setHobbies(hobbies);
        student.setGender(gender);
        ModelAndView model = new ModelAndView("StudentDetails");
        model.addObject(student);

        //Second Way to Use ModelAndView
        *//*modelMap.addAttribute("student" ,student);
        return  new ModelAndView("StudentDetails",modelMap);*//*
        return model;
    }*/

    //Second Method using @ModelAttribute annotation


    /*@ModelAttribute
    public ModelMap Show(ModelMap modelMap){
        modelMap.addAttribute("Welcome","Welcome to STMS");
        return modelMap;
    }*/


    @RequestMapping(value = "StudentDetails", method=RequestMethod.POST)
    public ModelAndView showStudent(@Valid @ModelAttribute("student1") Student student, BindingResult result){
        if(result.hasErrors()){
            ModelAndView model = new ModelAndView("StudentRegistration");
            model.addObject(result);
            return model;
        }else {

            ModelAndView model = new ModelAndView("StudentDetails");
            model.addObject(student);
            return model;
        }
    }

}
