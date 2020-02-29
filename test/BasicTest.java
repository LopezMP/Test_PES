import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void createAndRetrieveUser() {
        // Create a new user and save it
        new Jugador("Marie", 20, "45121232R").save();

        // Retrieve the user with e-mail address bob@gmail.com
        Jugador jugador= Jugador.find("byNom", "Marie").first();

        // Test
        assertNotNull(jugador);
        assertEquals("Marie", jugador.getNom());
    }

}
