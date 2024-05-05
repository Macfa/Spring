package com.fc.java.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
Websocket = ip, port 로 들어오는 통신 요청을 기다리는 역할
socket = ( tcp/ip ) 통신을 하기위한 개념
 */

public class Server {
    public static void main(String[] args) {


        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);

        try {

            // 1. 서버 소켓 생성
            serverSocket = new ServerSocket(9999);

            // 2. 연결 대기
            System.out.println("연결 대기중...");

            socket = serverSocket.accept();
            System.out.println("연결 되었습니다.");

            // 3. 네트워크 입출력 스트림 생성
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // 4. 클라이언트로부터 데이터 수신 (서버<-클라이언트)
            while(true) {
                // 스트림으로부터 라인 한줄 받기 ( 스트림을 받을 때까지 대기이기 때문에, 채팅은 문장을 보낸 후 답변 형태이다 ( 송신 or 수신 -> 수신 or 송신 )
                String inMsg = in.readLine();
                System.out.println("from client : " + inMsg);



                // 5. 클라이언트로 데이터 전송 (서버->클라이언트)
                System.out.print("보내기 by Server >> ");
                String outMsg = sc.nextLine();
                out.write(outMsg + "\n");
                out.flush();
            }


        } catch (IOException e) {
            e.getStackTrace();
            sc.close();
        } catch (Exception exception) {
            exception.getStackTrace();
        } finally {
            // 6. 접속 종료
            try {
                sc.close();
                socket.close();
            } catch (Exception e) {
                e.getStackTrace();
            }


        }

    }
}