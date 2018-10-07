package com.tutorials.Controller;

import com.tutorials.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    LoginService auth;

    @RequestMapping(value = "/login", method =RequestMethod.GET)
    public String showhome(ModelMap model) {
        model.addAttribute("Name", "Kamlesh");
        return "login";
    }
    @RequestMapping(value = "/login" ,method =RequestMethod.POST)
    public String showhomewithuser(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {

        if(auth.authenticateUser(name,password)) {
            modelMap.put("name", name);
            modelMap.put("password", password);
            return "home";
        }
        else{
            modelMap.put("errormessage","Invalid Credentials..!! You aren't Kamlesh bro...");
            return "login"  ;
        }

    }
}
