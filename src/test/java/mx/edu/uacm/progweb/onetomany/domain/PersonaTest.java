package mx.edu.uacm.progweb.onetomany.domain;

import mx.edu.uacm.progweb.onetomany.OneToManyApplication;
import mx.edu.uacm.progweb.onetomany.repository.PersonaRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = {OneToManyApplication.class})
class PersonaTest {

    private Logger log = LogManager.getLogger(PersonaTest.class);

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    public void debeGuardarPersonaConTelefonos(){
        log.debug("> Entrando a debeGuardarPersonaConTelefonos <");

        Telefono t1 = new Telefono("3443434");
        Telefono t2 = new Telefono("8875555");

        //la asociacion es una persona muchos telefonos
        Persona p = new Persona("Angel");

        //coleccion
        List<Telefono> fones = new ArrayList<>();
        fones.add(t1);
        fones.add(t2);

        //asociacion de persona con los telefonos
        p.setTelefonos(fones);
        personaRepository.save(p);
    }

}