package es.iesclaradelrey.da2d1a.psp.chucknorris.clienterest;

import es.iesclaradelrey.da2d1a.psp.chucknorris.clienterest.objects.ChuckJoke;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteREST {
    @GetMapping("/chuck")
    public ChuckJoke obtenerChuck() {
        String url = "https://api.chucknorris.io/jokes/random";
        // Creamos un objeto RestTemplate para sacar de él la respuesta a la petición en el objeto ChuckJoke
        RestTemplate restTemplate = new RestTemplate();
        ChuckJoke respuesta = restTemplate.getForObject(url, ChuckJoke.class);
        // Esto muestra el contenido de la respuesta en el objeto creado
        System.out.println(respuesta.getValue());
        // Esto muestra el ID de la respuesta en el objeto creado
        System.out.println(respuesta.getId());
        return respuesta;
    }
}
