package com.sistemaDeColegio.security;

import org.mindrot.jbcrypt.BCrypt;

public class HashPassword {

    public String hashearContrasenia(String contrasenia){
        return BCrypt.hashpw(contrasenia, BCrypt.gensalt());
    }
}
