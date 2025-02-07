package ejercicio7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("A100", "Daniel Martinez Tenedor");
        Editorial editorial = new Editorial("2341", "VicenVives");
        Tema tema = new Tema("TR23", "Literatura");

        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);

        Libro libro = new Libro("123123123", "EL VALLE", editorial, autores, tema);
        Ejemplar ejemplar = new Ejemplar(1, libro);
        Lector lector = new Lector(123123, "Jeandeivid Zapata");

        Date fechaPrestamo = new Date();
        Prestamo prestamo = new Prestamo(ejemplar, lector, fechaPrestamo);

        System.out.println("Libro prestado: " + prestamo.getEjemplar().getLibro().getTitulo());
        System.out.println("A lector: " + prestamo.getLector().getNombre());


    }

    }
