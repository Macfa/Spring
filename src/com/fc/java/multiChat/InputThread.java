package com.fc.java.multiChat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class InputThread extends Thread {
    Socket socket = null;
    BufferedReader in = null;
    PrintWriter out = null;
    Scanner scan = new Scanner(System.in);

    public InputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader( new InputStreamReader( socket.getInputStream()));
            out = new PrintWriter( new OutputStreamWriter( socket.getOutputStream()));

            while(true) {
                String data = scan.nextLine();
                out.println(data);


            }

        } catch ( IOException e) {
            e.getStackTrace();
        }

    }
}
