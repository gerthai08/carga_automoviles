package com.gutierrezcar.automovil.logica;

import com.gutierrezcar.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    //conectar la logica con la persistencia 
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {

        //crear un auto para el modelado 
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.guardarAutomovil(auto);
    }


    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }


    public void borrarAuto(int idAuto) {

        controlPersis.borrarAuto(idAuto);
        
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
 
        //le pido a la persis que modifique
        controlPersis.modificarAutomovil(auto);
    }

    


}
