# 📘 API – Gestión de Reservas

Esta API REST permite administrar reservas de mesas en un restaurante. Ofrece endpoints para crear, consultar y eliminar reservas. Está documentada con Swagger.

---

## 🔗 Endpoints De Reservas

| Método | Endpoint               | Descripción                       |
|--------|------------------------|-----------------------------------|
| GET    | `/api/reservas`        | Obtener todas las reservas        |
| GET    | `/api/reservas/{id}`   | Obtener una reserva por ID        |
| POST   | `/api/reservas`        | Crear una nueva reserva           |
| DELETE | `/api/reservas/{id}`   | Eliminar una reserva              |

---
## 🔗 Endpoints De Cliente

| Método | Endpoint               | Descripción                       |
|--------|------------------------|-----------------------------------|
| GET    | `/api/clientes`         | Obtener todas los clientes       |
| GET    | `/api/clientes/{id}`   | Obtener una cliente por ID        |
| POST   | `/api/clientes`        | Crear un nuevo cliente            |
| DELETE | `/api/clientess/{id}`  | Eliminar un cliente               |

---
## 🔗 Endpoints De Mesa

| Método | Endpoint               | Descripción                       |
|--------|------------------------|-----------------------------------|
| GET    | `/api/mesas`        | Obtener todas las mesas     |
| GET    | `/api/mesas/{id}`   | Obtener una mesa por ID        |
| POST   | `/api/mesas`        | Crear una nueva mesa           |
| DELETE | `/api/mesas/{id}`   | Eliminar una mesa              |

---
## 📦 Modelo de Datos: 
Los Id no se ponen prque son autoincrementable.

#### Cliente
```json
{
  "nombre": "string",
  "telefono": "string",
  "email": "string"
}
````
#### Reservas
```json
{
  "fechaHora": "2025-04-23T00:20:41.001Z",
  "cliente": {
    "id": 0
  },
  "mesa": {
    "id": 0
  }
}
````
tambien se puede 
```json
{
  "fechaHora": "2025-04-23T00:20:41.001Z",
  "cliente": {
    "id": 0,
    "nombre": "string",
    "telefono": "string",
    "email": "string"
  },
  "mesa": {
    "id": 0,
    "nombre": "string",
    "capacidad": 0
  }
}
````
#### Mesas
```json
{
  "nombre": "string",
  "capacidad": 0
}
````
## Swagger UI

La documentación interactiva de la API está disponible en:

📄 Swagger UI: http://localhost:8082/swagger-ui/index.html

📥 OpenAPI JSON:  http://localhost:8082/v3/api-docs

## Tecnologías

Lenguaje: Java 17

Framework: Spring Boot

Dependecias:
````
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-       
             ui</artifactId>
			<version>2.3.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
````