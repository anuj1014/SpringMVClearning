package com.tutorials.Controller;


import com.tutorials.Classes.Student;
import com.tutorials.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    Student student;


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
                              ModelMap modelMap){

        student.setStudentName(studentName);
        student.setCountry(country);
        student.setCity(city);
        student.setPincode(pincode);
        student.setHobbies(hobbies);
        ModelAndView model = new ModelAndView("StudentDetails");
        model.addObject(student);

        //Second Way to Use ModelAndView
        *//*modelMap.addAttribute("student" ,student);
        return  new ModelAndView("StudentDetails",modelMap);*//*
        return model;
    }*/

    @RequestMapping(value = "StudentDetails", method=RequestMethod.POST)
    public ModelAndView showStudent(@ModelAttribute("student1") Student student){
        ModelAndView model = new ModelAndView("StudentDetails");
        model.addObject(student);

        //Second Way to Use ModelAndView
        /*modelMap.addAttribute("student" ,student);
        return  new ModelAndView("StudentDetails",modelMap);*/
        return model;
    }


}
