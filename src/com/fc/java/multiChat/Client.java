package com.fc.java.multiChat;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9090);

            while(true) {

            }
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
