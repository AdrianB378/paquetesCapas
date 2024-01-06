
package com.todocode.paquetesCapas.service;

import com.todocode.paquetesCapas.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    // Metodos de logica de negocio
    
        

    @Override
    public void crearPersona(Persona per) {
        // Logica de negocio creacion
        System.out.println("Persona Creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        // Aca deberia ir la logica de devolver la lista de  personas
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
