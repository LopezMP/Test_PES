package controllers;

import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void sayHello(@Required String myName) {
        if(validation.hasErrors()) {
            flash.error("Oops... Escriu el teu nom :)");
            index();
        }
        render(myName);
    }

    public static void newEquips(@Required String name, @Required int edat, @Required String dni){
        if(validation.hasErrors()) {
        flash.error("Oops... Falten paràmetres :)");
        }

        new Jugador(name, edat, dni).save();
        flash.success("Registrat!");
        render();
    }

    /*public static void newJugador(@Required String name, @Required int edat, @Required String dni){
        if(validation.hasErrors()) {
            flash.error("Oops... Falten paràmetres :)");
        }

        new Jugador(name, edat, dni).save();
        flash.success("Registrat!");
        newEquips();
    }*/
}