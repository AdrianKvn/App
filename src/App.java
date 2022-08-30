import dto.Person;

import java.sql.Date;

public class App {
    public static void main(String[] args) {
        /**
         * Creacion de el objeto tipo Persona
         */
        Person person = new Person(1);

        person.setName("Marcos");
        person.setLastName1("Lopez");
        person.setLastName2("Benitez");
        person.setHeight(1.78f);
        person.setDateBrith(new Date(91, 2, 3));

        person.present();
        person.verify();

    }

}
