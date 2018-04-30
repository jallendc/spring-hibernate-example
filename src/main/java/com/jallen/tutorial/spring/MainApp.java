package com.jallen.tutorial.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jallen.tutorial.spring.config.AppConfig;
import com.jallen.tutorial.spring.entity.User;
import com.jallen.tutorial.spring.service.UserService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        // Add Users
        userService.add(new User("Jeff", "Grosso", "jeff.grosso@example.com"));
        userService.add(new User("Caleb", "Bushman", "caleb.bushman@example.com"));
        userService.add(new User("Jason", "Allen", "jason.allen@example.com"));
        userService.add(new User("Kevin", "Pinto", "kevin.pinto@example.com"));

        // Get Users
        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println();
        }

        context.close();
    }
}
