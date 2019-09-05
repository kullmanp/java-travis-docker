package ch.kup.travistest;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CallPingIT {

    @Test
    public void callPing() throws IOException {
        String port = System.getProperty("PORT");
        URL url = new URL("http://localhost:" + port + "/travistest/resources/ping");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        assertTrue(in.readLine().startsWith("Helloo"));
        in.close();
    }

}
