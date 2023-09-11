# Creando-ApiRest-Gradle

Crea un proyecto con Spring boot Inizializr
![Estructura del Proyecto](https://github.com/Luiso-o/Creando-ApiRest-Gradle/assets/128043647/c3e07010-9cdb-437a-b543-af717ba6e4eb)

Convertiremos esta aplicación en una API REST: Dependiendo del package principal, crea otro subpackage llamado Controllers, y en su interior, añade la clase HelloWorldController.

Tendrá que tener dos métodos: String saluda String saluda2

Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:

"Hola, " + nombre + ". Estás ejecutando un proyecto Maven”.

El primer método responderá a una petición GET y deberá ser configurado para recibir el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor predeterminado “UNKNOWN”.

Deberá responder a:
http://localhost:9001/saludaConParametro
![ParametroSinNombre](https://github.com/Luiso-o/Creando-ApiRest-Gradle/assets/128043647/ead98558-73b8-4ed1-9d46-52b3bd4f4ca9)

http://localhost:9001/saludaConParametro?nombre=Minombre
![ParametroConNombre](https://github.com/Luiso-o/Creando-ApiRest-Gradle/assets/128043647/d8dba67b-1cd0-4dbf-a2bb-eb89ce57fc4d)

El segundo método responderá a una petición GET, y deberá ser configurado para recibir el parámetro como PathVariable. El parámetro "nombre" será opcional.

Deberá responder a:

http://localhost:9001/saludaConVariable
![VariableSinNombre](https://github.com/Luiso-o/Creando-ApiRest-Gradle/assets/128043647/c52b7d97-6edf-464c-a7a1-fe72f3b0507a)

http://localhost:9001/saludaConVariable/Minombre
![VariableConNombre](https://github.com/Luiso-o/Creando-ApiRest-Gradle/assets/128043647/9b230ba6-8591-4fa3-a8d3-854aea2d37ac)

Test de Integración del controlador
![TestDeIntegracion](https://github.com/Luiso-o/Creando-ApiRest-Gradle/assets/128043647/d9f0ea27-76b9-42d6-a31e-c9a4613a6a58)

