package todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"inventory"})
public class ToDoList1 {

    public static void main(String[] args){
        SpringApplication.run(ToDoList1.class, args);
    }
}
