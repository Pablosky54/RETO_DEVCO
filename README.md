#RETO-DEVCO

Reto para Devco, consiste en automatizar la pagina de viajes https://www.travelocity.com/ , automatizando 5 escenario y 15 en ejecucion manual

##Automatizados
Caso #1 - Se busca el precio mas economico en la opcion Stay
Caso #2 - Buscar el carro mas caro en la opcion Cars
Caso #3 - Bucar el vuelo mas barato en la opcion Flights
Caso #4 - Probar que ingrese a la opcion things-to-do y luego a History & culture
Caso #5 - Probar el cambio de idioma de ingles a español

##Manuales

Caso #6 - Cambiar de lenguaje y se busca el precio mas economico en la opcion Hospedaje
Caso #7 - Cambiar de lenguaje y se buscar el carro mas caro en la opcion Autos
Caso #8 - Cambiar de lenguaje y se bucar el vuelo mas barato en la opcion Vuelos
Caso #9 - Probar que ingrese a la opcion Actividades y luego buscar la que tenga mejor calificacion
Caso #10 - Descargar la aplicacion
Caso #11 - Validar la lectura del codigo QR para descargar la aplicacion
Caso #12 - En la opcion de Actividades buscar una fecha superior a 15 dias y validar qeu salga el mensaje de advertencia 
Caso #13 - En la opcion de Actividades buscar una fecha inferiro a 15 dias
Caso #14 - Escoger un estadia y validar que se pueda abrir la ubicacion de GPS
Caso #15 - Escoger un estadia y luego una actividad a menos de 1.5km
Caso #16 - Escoger un estadia y luego una actividad a mas de 5km
Caso #17 - Buscar una estadia para 5 adultos y 3 niños menores de 1 año
Caso #18 - Buscar uan estadia para 10 adultos con dos carros en alquiler
Caso #19 - Entrar en la opcion mis viajes y crear un ususario
Caso #20 - Generar una reserva sin la creacion de un ususario

Pre-requisitos Java v1.8 update 151 o superior y JDK (variables de entorno configuradas) Eclipse IDE (Oxigen o Neon) o IntelliJ IDEA (2019.1) Gradle v4.10.2 o superior Cucumber Instalación Para clonar este repositorio localmente, se debe ejecutar el siguiente comando: git clone https://github.com/Pablosky54/RETO_DEVCO.git Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente Configurar JRE System Library con JavaSE-1.8 Configurar la codificación a UTF-8 al proyecto una vez sea importado Detalles Generales De La Implementación Cada línea de los escenarios de pruebas creados en el feature bajo lenguaje Gherkin, se conectan con un método de las clases StepDefinitions con la ayuda de anotaciones @Given, @When y @Then, desde el StepDefinitions se conectan con las clases tipo Task donde se realizan las acciones de alto nivel (p. ej. ingresar datos en una pantalla).

Construido Con La automatización fue desarrollada con : BDD - Estrategia de desarrollo Screenplay Gradle Cucumber Serenity BDD Gherkin - Lenguaje Business Readable DSL (Lenguaje específico de dominio legible por el negocio) Versionado Se uso GIT para el control de versiones

Autor Juan Pablo Gallon Roldan - cefit.pablo@gmail.com
