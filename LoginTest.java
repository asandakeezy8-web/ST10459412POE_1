package com.mycompany.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    public Login createLogin() {
        return new Login("Kyle", "Doe");
    }

    @Test
    public void testValidUsername() {
        Login login = createLogin();
        assertTrue(login.checkUserName("kyl_1"), "Valid username should pass");
    }

    @Test
    public void testInvalidUsername() {
        Login login = createLogin();
        assertFalse(login.checkUserName("kyle!!!!!!"), "Invalid username should fail");
    }

    @Test
    public void testValidPassword() {
        Login login = createLogin();
        assertTrue(login.checkPasswordComplexity("Ch@sec8ke99!"), "Valid password should pass");
    }

    @Test
    public void testInvalidPassword() {
        Login login = createLogin();
        assertFalse(login.checkPasswordComplexity("password"), "Invalid password should fail");
    }
}