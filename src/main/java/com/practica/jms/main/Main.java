package com.practica.jms.main;

import com.practica.jms.modelo.Consumidor;

import javax.jms.JMSException;
import javax.jms.Session;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Session> usuariosConectados = new ArrayList<>();

    public static void main(String[] args) throws JMSException {


        String cola = "notificaciones.cola";


        Consumidor servicioConsumidor = new Consumidor(cola);
        servicioConsumidor.conectar();


    }
}
