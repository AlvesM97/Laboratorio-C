/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.sprint1.WhatsAppMessageSender;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guzim
 */
public class WhatsAppMessageSenderTest {
    
    @Test
    public void testValidMessageDelivery() {
        WhatsAppMessageSender sender = new WhatsAppMessageSender();
        assertTrue(sender.sendMessage("Mensagem válida"));
    }

    @Test
    public void testInvalidMessageDelivery() {
        WhatsAppMessageSender sender = new WhatsAppMessageSender();
        assertFalse(sender.sendMessage("Mensagem com mais de 160 caracteres...".repeat(5)));
    }
}
