package com.tutorials.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginService(){

    }

    public Boolean authenticateUser(String usr, String pass){
        return usr.equals("Kamlesh") || usr.equals("Kamlesh Kumar") && pass.equals("Dun Dun Dun") || pass.equals("dun") || pass.equals("dun dun dun");
    }

    @Service
    public static class TodoService {

        //private static List<com.tutorials.services.Todo> todos = new ArrayList<com.tutorials.services.Todo>();
        private static int todoCount=3;

        public TodoService(){

        }

    /*
        static {

            todos.add(new com.tutorials.services.Todo(1,"user1","Learning Spring MVC", new Date(),false));
            todos.add(new com.tutorials.services.Todo(2,"user1","Learning Spring MVC with Example", new Date(),false));
            todos.add(new com.tutorials.services.Todo(3,"user1","Learning Java in Details", new Date(),false));
        }

        public void addTodo(String name, String desc, Date date, Boolean isDone){
            todos.add(new com.tutorials.services.Todo(++todoCount, name, desc, new Date(), isDone));
        }

        public void deleteTodo(int id){
            Iterator<com.tutorials.services.Todo> iterable=todos.iterator();
            while (iterable.hasNext()){
                Todo todo =iterable.next();

                if (todo.getId()==id){
                    iterable.remove();
                     }

                }
        }

        public List<Todo> retrieve(String name){
            List<Todo> filteredresult = new ArrayList<Todo>();

            for (Todo todo : todos ){
                if (todo.getName().equals(name))
                    filteredresult.add(todo);
            }
                return todos;
        }*/

    }
}
