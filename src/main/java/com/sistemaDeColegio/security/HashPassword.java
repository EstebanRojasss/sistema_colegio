package com.sistemaDeColegio.security;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class HashPassword {

    public String hashearContrasenia(String contrasenia){
        return BCrypt.hashpw(contrasenia, BCrypt.gensalt());
    }
}
