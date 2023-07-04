package cat.itacademy.barcelona.apellidos.nombre.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Gradle!";
    }

    @GetMapping("/HelloWorld2/{nombre}")
    public String saluda2(@PathVariable(value = "nombre", required = false) String nombre) {
        return "Hola, " + (nombre != null ? nombre : "UNKNOWN") + ". Estás ejecutando un proyecto Gradle!.";
    }

}