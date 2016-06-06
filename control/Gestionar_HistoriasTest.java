package control;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

<<<<<<< HEAD
public class Gestionar_HistoriasTest
{
=======
/**
 * The test class Gestionar_HistoriasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Gestionar_HistoriasTest
{
    /**
     * Default constructor for test class Gestionar_HistoriasTest
     */
>>>>>>> 5b5bbf794638db6650770358749622243a3ddf2d
    public Gestionar_HistoriasTest()
    {
    }

<<<<<<< HEAD
=======
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
>>>>>>> 5b5bbf794638db6650770358749622243a3ddf2d
    @Before
    public void setUp()
    {
    }

<<<<<<< HEAD
=======
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
>>>>>>> 5b5bbf794638db6650770358749622243a3ddf2d
    @After
    public void tearDown()
    {
    }

    @Test
    public void pruebaAdd()
    {
        Gestionar_Historias gestiona1 = new Gestionar_Historias();
        gestiona1.addHistoria("asdf", "asdf", "asdf", 5, 5, 1);
    }
    
    @Test
    public void pruebaEdit()
    {
        Gestionar_Historias gestiona1 = new Gestionar_Historias();
        gestiona1.editHistoria(5, "hola", "hola", "qwerqw", 2, 2, 1);
    }
    
    @Test
    public void pruebaDelete()
    {
        Gestionar_Historias gestiona1 = new Gestionar_Historias();
        gestiona1.delHistoria(5);
    }
}

