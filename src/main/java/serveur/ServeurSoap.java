package serveur;

import jakarta.xml.ws.Endpoint;

public class ServeurSoap {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new EtudiantWService());
        System.out.println(url);
    }
}
