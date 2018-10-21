package com.tutorials.Controller;

import com.tutorials.Classes.Todo;
import com.tutorials.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.Date;

@Controller
@SessionAttributes({"name","password"})
public class TodoController {

    @Autowired
    TodoService service;

@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showLoginPage(ModelMap modelMap){
    modelMap.addAttribute("todos", service.retrieve("user1"));
    return "list-todos";
}

    @RequestMapping(value = "/add-todos", method = RequestMethod.GET)
    public String addTodos(ModelMap modelMap){
        modelMap.addAttribute("todo" , new Todo(0,"user1","",new Date(),false));
        return "add-todos";
    }

    @RequestMapping(value = "/add-todos" , method = RequestMethod.POST)
    public String addTodos1(ModelMap modelMap, @Valid Todo todo, BindingResult result){

    if (result.hasErrors()){
        return "/add-todo";
    }
    service.addtodo(todo.getId(), todo.getUser());
    return "redirect:list-todos";
    }

    @RequestMapping(value = "/delete-todos" , method = RequestMethod.GET)
    public String deleteTodos(@RequestParam int id){
        service.deleteTodo(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value = "/update-todos", method = RequestMethod.GET)
    public String updateTodos(@RequestParam int id){
        Todo todo = service.retrievetodo(id);
        return "todo";
    }


}


