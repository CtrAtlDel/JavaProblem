package main.http;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    private int port;

    private String directory;

    public Server(int port, String directory) {
        this.port = port;
        this.directory = directory;
    }

    void start(){
        try(var server = new ServerSocket(this.port)){
            while(true){
                var socket = server.accept();
                var thread = new Handler(socket, this.directory);
                thread.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
