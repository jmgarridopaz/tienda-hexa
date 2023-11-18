# tienda-hexa
### UHU - ETSI - Taller Arquitectura Hexagonal - Ejemplo App Hexagonal desde Web Tres Capas

#### Entorno de desarrollo utilizado:
- Ubuntu 20.04
- Java 17
- Maven 3.9.5
- Eclipse 2023-06
- MariaDB server 10.3.38

#### Base de datos
Configurar la conexión en el archivo "application.properties". Por defecto es la siguiente:
~~~
# Database connection
spring.datasource.url=jdbc:mariadb://localhost:3306/tiendabd
spring.datasource.username=admin
spring.datasource.password=admin
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
~~~
No es necesario crear tablas, sólo la base de datos vacía.
La aplicación elimina y crea las tablas cada vez que se ejecuta.
Este comportamiento se puede configurar en la siguiente propiedad:
~~~
# Database creation
spring.jpa.hibernate.ddl-auto=create
~~~

#### Instrucciones para ejecutar la aplicación
1. Descargar el repositorio GitHub
2. Abrir un terminal de comandos e ir a la carpeta donde lo hemos descargado
3. Ejecutar el comando: mvn clean verify
4. Ejecutar el comando: java -jar ./target/tienda-hexa-1.0.0.jar
5. Abrir un navegador e ir a la URL: http://localhost:8080/tiendahexa
