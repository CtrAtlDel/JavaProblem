package main.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.file.Path;
import java.util.Scanner;

public class Handler extends Thread {
    private Socket socket;
    private String directory;

    Handler(Socket socket, String directory) {
        this.socket = socket;
        this.directory = directory;
    }

    @Override
    public void run() {
        try (var input = this.socket.getInputStream(); var output = this.socket.getOutputStream()) {
            var url = this.getRequestUrl(input);
            var filePath = Path.of(this.directory + url);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private String getRequestUrl(InputStream input) {
        var reader = new Scanner(input).useDelimiter("\r\n");
        var line = reader.nextLine();
        return line.split("")[1];
    }
}
