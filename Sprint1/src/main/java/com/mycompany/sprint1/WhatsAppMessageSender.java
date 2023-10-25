/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sprint1;

/**
 *
 * @author guzim
 */
public class WhatsAppMessageSender {

    public boolean sendMessage(String message) {
        return message != null && message.length() <= 160;
    }

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
}
