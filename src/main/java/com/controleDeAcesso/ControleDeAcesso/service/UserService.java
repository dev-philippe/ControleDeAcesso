package com.controleDeAcesso.ControleDeAcesso.service;

import com.controleDeAcesso.ControleDeAcesso.model.User;

import java.util.List;

public class UserService {

    public void gravar(User user) {
        System.out.println("Gravando usuário");

    }
    public void alterar(User user) {
        System.out.println("Alterando usuário");
    }
    public User buscarPorUsername(String username) {
        System.out.println("Buscando usuário pelo login");
                return null;
    }

    public List<User> listar() {
        System.out.println("Listando todos os usuários");
        return null;
    }

}
