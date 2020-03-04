import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Before
    public void setup() {
        Fixtures.deleteDatabase();
    }

    @Test
    public void afegirNouJugador() {
        // Create a new user and save it
        new Jugador("Marie", 20, "45121232R").save();
        //Trobar jugador
        Jugador jugador= Jugador.find("byNom", "Marie").first();

        // Test
        assertNotNull(jugador);
        assertEquals("Marie", jugador.getNom());
    }

    @Test
    public void trobarJugador() {
        // Create a new user and save it
        new Jugador("Marie", 20, "45121232R").save();

        // Test
        assertNotNull(Jugador.trobarJugador("Marie", "45121232R"));
        assertNull(Jugador.trobarJugador("Marie", "123456"));
        assertNull(Jugador.trobarJugador("Alex", "45121232R"));
    }

    @Test
    public void crearEquipAndAfegirJugador(){

        new Equip("Barça", "Camp Nou").save();
        Equip equip = Equip.trobarEquip("Barça");
        assertNotNull(equip);
        afegirNouJugador();
        Jugador jugador= Jugador.find("byNom", "Marie").first();
        assertNotNull(jugador);
        equip.afegirJugador(jugador);

    }

}
