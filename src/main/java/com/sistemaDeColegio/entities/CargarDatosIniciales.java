package com.sistemaDeColegio.entities;

import com.sistemaDeColegio.entities.permisos.Permiso;
import com.sistemaDeColegio.entities.permisos.TipoPermiso;
import com.sistemaDeColegio.entities.roles.Rol;
import com.sistemaDeColegio.entities.roles.TipoRol;
import com.sistemaDeColegio.repository.PermisoRepository;
import com.sistemaDeColegio.repository.RolRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CargarDatosIniciales {

    private final PermisoRepository permisoRepository;

    private final RolRepository rolRepository;


    public CargarDatosIniciales(PermisoRepository permisoRepository, RolRepository rolRepository) {
        this.permisoRepository = permisoRepository;
        this.rolRepository = rolRepository;
    }

    @PostConstruct
    public void permisoSeed(){
        List<TipoPermiso>tiposPermisos = Arrays.asList(TipoPermiso.values());

        for(int i= 0; i < tiposPermisos.size(); i++){
            Permiso permiso = new Permiso();
            permiso.setTipoPermiso(tiposPermisos.get(i));
            permisoRepository.save(permiso);
        }

        List<TipoRol>tiposRol = Arrays.asList(TipoRol.values());

        for(int i= 0; i < tiposRol.size(); i++){
            Rol rol = new Rol();
            rol.setTipoRol(tiposRol.get(i));
            rolRepository.save(rol);
        }
    }
}
