package app;

import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;

public class Main {
    public static void main(String[] args) {
        //Direcciones
        Direccion direccion1 = new Direccion("calle uno", 87, "Puerto Varas");

        Direccion direccion2 = new Direccion("calle dos", 380, "Frutillar");

        Direccion direccion3 = new Direccion("calle tres", 94, "Puerto Montt");

        //Clientes
        Cliente cliente1 = new Cliente("Karla Soto", "20387474-9", direccion1, "Volcán Osorno");

        Cliente cliente2 = new Cliente("Matias Flores","18387646-2", direccion2, "Saltos del Petrohué");

        //Guia
        GuiaTuristico guia1 = new GuiaTuristico("Katherine Espinosa", "20765382-6", direccion3, "Portugués");

        //Salidas por consola
        System.out.println(cliente1);
        System.out.println();

        System.out.println(cliente2);
        System.out.println();

        System.out.println(guia1);
    }
}