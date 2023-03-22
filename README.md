Criterios para la primera evaluación de Back End I

Manejo del tiempo: 
Los primeros 10 minutos serán utilizados por el docente para explicar la consigna de la evaluación.
Luego, su duración será de 110 minutos por alumno —tendrán un aviso del docente 10 minutos antes de cumplirse el tiempo establecido—.
 
 El examen es individual y a partir de un enunciado deberán realizar:
El código en Java en su IDE el cual deberán exportarlo en .zip.

El .zip deberán subirlo a un formulario que el docente les proporcionará. Este deberá tener el siguiente formato de nombre: APELLIDO-NOMBRE.zip

 Temas a evaluar:

Correcta utilización de las clases de acceso a datos de la API de Java: JDBC.
Implementación del patrón DAO (Data Access Object).
Uso de buenas prácticas:
Logueo con Log4J ante excepciones.
Testeo unitario a través del uso de JUnit.

Buenas prácticas
Unas horas del examen recomendamos chequear el funcionamiento de su conexión a Internet.
Tener ya preparado el IDE con las librerías de JUnit y Log4J.
Repasar las clases de Acceso a Datos (JDBC), Testeo Unitario (JUnit) y Logging (Log4J).
Administrar bien los tiempos.



ENUNCIADO: 

La clínica odontológica ahora nos pide que desarrollemos la posibilidad de gestionar a los odontólogos. Es decir, que el sistema permita registrar los odontólogos y listarlos.

Luego del relevamiento obtuvimos la siguiente información:

Un odontólogo tiene
Número de matrícula
Nombre
Apellido

Nuestro chapter lead de arquitectura nos pide:

Utilizar H2 como base de datos aplicando el patrón DAO para acceder a los datos, realizar los métodos que nos permitan guardar un odontólogo, y listar todos los odontólogos. 

Loguear el resultado o la ejecución de cada operación utilizando log4j.

Crear un script SQL para la creación de las tablas con sus respectivos atributos.
Tests: Con JUnit testear el listado de todos los odontólogos (previamente guardar algunos odontólogos).

