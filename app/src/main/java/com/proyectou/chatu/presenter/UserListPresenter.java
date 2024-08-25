package com.proyectou.chatu.presenter;

import com.proyectou.chatu.model.UserModel;

//[Interfaz para el presentador de la lista de usuarios]
public interface UserListPresenter {
    void loadUsers(); // Método para cargar la lista de usuarios
    UserModel findUserByEmail(String email);//Buscar un usuario de la lista por Mail
}

