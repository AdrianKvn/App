package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase persona
 * @author Adrian Luengas
 */

public class Person {
    public final Integer id;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBrith;
    public Float height;
    /**
     * Implemetamos SimpleDateFormat para darle formato a la fecha
     * que es ingresada por el usiario.
     */
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Constructor con un parametro necesario para inicialiazar
     * @param id  identificador del objeto persona
     */
    public Person(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * Metodo que recibe nombre como parámetro
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    /**
     * Metodo que recibe primer apellido como parámetro
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    /**
     * Metodo que recibe segundo apellido como parámetro
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBrith() {
        return dateBrith;
    }

    /**
     * Metodo que recibe la fecha de cumpleaños como parámetro
     * @param dateBrith
     */
    public void setDateBrith(Date dateBrith) {
        this.dateBrith = dateBrith;
    }

    public Float getHeight() {
        return height;
    }

    /**
     * Metodo que recibe la altura como parámetro
     * @param height
     */
    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * Metodo que da la información de la persona
     */
    public void present() {
        System.out.println("Hola mi nombre completo es " + this.getName() + " "
                + this.getLastName1() + " "+this.lastName2+", identificado con codigo de registro " + this.getId() + ", naci el " + dateFormat.format(dateBrith));
    }

    /**
     * En este metodo calcula si la persona es mayor o menor de edad,
     * teniendo que la mayoria de edad es 18 años
     */
    public void verify() {
        Date current = new Date();
        int milisecondsByDay = 86400000;
        int days = (int) ((current.getTime() - dateBrith.getTime()) / milisecondsByDay);
        int years = days / 365;
        if (years > 18) {
            System.out.println("soy mayor de edad, tengo "+years +" años");
        } else {
            System.out.println("soy menor de edad, tengo "+years +" años");
        }

    }
}
