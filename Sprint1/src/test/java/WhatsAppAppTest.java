/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.sprint1.WhatsAppApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guzim
 */
public class WhatsAppAppTest {

    @Test
    public void testAcceptableResponseTime() {
        WhatsAppApp app = new WhatsAppApp();
        assertTrue(app.openApp());

        // Simular um carregamento rápido com uma pausa curta (100 milissegundos)
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(app.loadConversations());
    }

    @Test
    public void testSlowResponseTime() {
        WhatsAppApp app = new WhatsAppApp();
        assertTrue(app.openApp());

        // Simular um carregamento lento com uma pausa mais longa (3 segundos)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(app.loadConversations());
    }
}
