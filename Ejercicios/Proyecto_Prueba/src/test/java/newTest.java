/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import login.LoginForm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vania
 */
public class newTest {
    
    public newTest() {
    }
    @Test
    public void testIniciarSesionExitoso(){
        LoginForm loginForm = new LoginForm();
        boolean resultado= loginForm.inicioSesion("vania", "1234");
        assertTrue(resultado);
    }
    @Test
    public void testIniciarSesionFallido() {
        LoginForm loginForm = new LoginForm();
        boolean resultado = loginForm.inicioSesion("usuario", "contraseña_incorrecta");
        assertFalse(resultado);
    }
}
