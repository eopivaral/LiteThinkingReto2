# Microservicio Java

Este proyecto es un microservicio básico desarrollado en Java. A continuación se presentan las instrucciones para compilar y ejecutar el microservicio.

## Estructura del Proyecto

```
microservicio-java
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── ejemplo
│   │   │           └── Application.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── ejemplo
│                   └── ApplicationTest.java
├── pom.xml
└── README.md
```

## Requisitos

- Java 11 o superior
- Maven 3.6 o superior

## Compilación

Para compilar el proyecto, navega a la raíz del proyecto y ejecuta el siguiente comando:

```
mvn clean install
```

## Ejecución

Para ejecutar el microservicio, utiliza el siguiente comando:

```
mvn spring-boot:run
```

El microservicio se iniciará en el puerto configurado en `src/main/resources/application.properties`.

## Pruebas

Para ejecutar las pruebas unitarias, utiliza el siguiente comando:

```
mvn test
```

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor abre un issue o envía un pull request.