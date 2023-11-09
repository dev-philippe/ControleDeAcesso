package com.controleDeAcesso.ControleDeAcesso;

import com.controleDeAcesso.ControleDeAcesso.model.User;
import com.controleDeAcesso.ControleDeAcesso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartAplication  implements CommandLineRunner {
    @Autowired
    private UserService service;
    @Override
    public void run( String... args) throws Exception {
        for( int x =1; x<= 5; x++) {
            service.gravar(new User("user"+ x));
        }
        User user2 = service.buscarPorUsername("user2");
        user2.setName("MASTER");
        service.alterar(user2);

        for(User user: service.listar()){
            System.out.println(user);
        }

    }

}
