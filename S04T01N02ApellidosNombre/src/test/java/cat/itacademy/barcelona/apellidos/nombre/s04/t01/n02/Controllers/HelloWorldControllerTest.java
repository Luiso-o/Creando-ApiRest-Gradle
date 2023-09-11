package cat.itacademy.barcelona.apellidos.nombre.s04.t01.n02.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSaludaConParametroSinNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConParametro")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, UNKNOWN. Estás ejecutando un proyecto Gradle!"));
    }

    @Test
    public void testSaludaConParametroConNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConParametro?nombre=Martha")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, Martha. Estás ejecutando un proyecto Gradle!"));
    }

    @Test
    public void testSaludaConVariableSinNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConVariable")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, UNKNOWN. Estás ejecutando un proyecto Gradle!"));
    }

    @Test
    public void testSaludaConVariableConNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConVariable/TúNombre")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, TúNombre. Estás ejecutando un proyecto Gradle!"));
    }

}