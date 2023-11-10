package com.controleDeAcesso.ControleDeAcesso;

import com.controleDeAcesso.ControleDeAcesso.model.User;
import com.controleDeAcesso.ControleDeAcesso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartAplication  implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run( String... args) throws Exception {

        User user = new User();
        user.setName("PHILIPPE");
        user.setUsername("antônio");
        user.setPassaword("spring-data-jpa");
        user.setRoles(null);
        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);




        }

    }

}
