package com.fc.java.multiChat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        Scanner scan = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(9090);

            System.out.println("Server Socket open !");

            socket = serverSocket.accept();

            System.out.println("Server Socket wait for Client !");

            while(true) {
                InputThread inputThread = new InputThread(socket);
            }
//            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.getStackTrace();
        }


    }
}
