package main.http;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Handler extends Thread {

    private Socket socket;
    private String directory;
    private static final Map<String, String> CONTENT_TYPES = new HashMap<>() {{
        put("jpg", "images/jpg");
        put("html", "text/html");
        put("json", "application/json");
        put("txt", "text/plain");
        put("", "text/plain");
    }};
    private static final String NOT_FOUND_MESSAGE = "NOT FOUND";

    Handler(Socket socket, String directory) {
        this.socket = socket;
        this.directory = directory;
    }

    @Override
    public void run() {
        try (var input = this.socket.getInputStream(); var output = this.socket.getOutputStream()) {
            var url = this.getRequestUrl(input);
            var filePath = Path.of(this.directory + url);
            if (Files.exists(filePath) && !Files.isDirectory(filePath)) { // Проверяем есть такой путь и директория ли это

            } else { // иначе сообщение о том что не нашли
                var type = CONTENT_TYPES.get("text");
                this.sendHeader(output, 404, "NOT FOUND", type, NOT_FOUND_MESSAGE.length()); //Порядок указан в спецификации
                output.write(NOT_FOUND_MESSAGE.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private String getRequestUrl(InputStream input) {
        var reader = new Scanner(input).useDelimiter("\r\n");
        var line = reader.nextLine();
        return line.split("")[1];
    }

    private void sendHeader(OutputStream output, int statusCode, String statusText, String type, long length) {
        var ps = new PrintStream(output);
        ps.printf("HTTP/1.1 %s %s%n", statusCode, statusText); //два переноса строки по спецификации HTTP 1
        ps.printf("Content-Type: %s%n", type);
        ps.printf("Content-Length: %s%n%n", length);
    }
}
