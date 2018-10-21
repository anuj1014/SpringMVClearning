package com.tutorials.services;


import com.tutorials.Classes.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todoList = new ArrayList<Todo>();

    private int size =3;
static{

    todoList.add(new Todo(1,"user1", "learning mvc",new Date(),false));
    todoList.add(new Todo(2,"user1", "learning mvc in details",new Date(),false));
    todoList.add(new Todo(3,"user1", "learning mvc all",new Date(),false));
        }

        public void addtodo(int id, String user){
    todoList.add(new Todo(id,user,"learning Java in Details", new Date(), false));
    System.out.print(todoList);
        }

        public void deleteTodo(int id){

                Iterator<Todo> iterator = todoList.iterator();
                while (iterator.hasNext()){
                    Todo todo = iterator.next();
                    if (todo.getId()==id){
                        iterator.remove();
                    }
                }
        }

        public void update(Todo todo){

        todoList.remove(todo);
        todoList.add(todo);
        }

        public Todo retrievetodo(int id){
            Iterator<Todo> iterator = todoList.iterator();
                while (iterator.hasNext()){
                    Todo todo =iterator.next();
                    if(todo.getId()==id)
                return todo;
                 }
            return null;
        }

        public List retrieve(String user){

            List<Todo> filteredlist = new ArrayList<Todo>();
           for(Todo todo : todoList){
                 if (todo.getUser().equals(user))
                 filteredlist.add(todo);
                 }
            return filteredlist;

        }
}