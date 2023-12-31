![Encabezado del Proyecto](./header.png)

# Spring Boot con GraphQL

Esta es una aplicación Spring Boot que utiliza GraphQL y una base de datos PostgreSQL con contenedores Docker. La aplicación te permite modificar y consultar una base de datos llamada `spring_graphql`, a la cual se puede acceder en `localhost:5432`. La base de datos consta de dos tablas: `students` (estudiantes) y `courses` (cursos), con una relación entre ellos basada en el ID del curso.

## Requisitos previos

Para ejecutar este proyecto, necesitas tener Docker instalado en tu máquina.

## Empezando

1. Clona este repositorio en tu máquina local:

```bash
git clone https://github.com/agcadu/Spring-Boot-Graphql.git
```
2. Navega al directorio del proyecto:

```bash
cd SpringBootGraphql
```
3. Inicia los contenedores Docker usando Docker Compose:
```bash
docker compose up
```
Este comando iniciará el contenedor de la base de datos PostgreSQL y el contenedor de la aplicación Spring Boot.

## Accede a la interfaz de GraphQL:

Abre Postman y haz una solicitud tipo GraphQL a: http://localhost:8080/graphql

## Consultas y Mutaciones de GraphQL.
### Consultas
- findStudentById: Obtiene detalles específicos de un estudiante proporcionando el ID del estudiante.
- findAllStudents: Obtiene detalles de todos los estudiantes.
- findCourseById: Obtiene detalles específicos de un curso proporcionando el ID del curso.
- findAllCourses: Obtiene detalles de todos los cursos.
### Mutaciones
- createStudent: Crea un nuevo estudiante proporcionando todos los detalles necesarios, incluyendo nombre, apellido, edad e ID del curso.
- deleteStudentById: Elimina un estudiante proporcionando el ID del estudiante.
- createCourse: Crea un nuevo curso proporcionando todos los detalles necesarios, incluyendo nombre, categoría y profesor.
- deleteCourseById: Elimina un curso proporcionando el ID del curso.
## Beneficios de Usar GraphQL
- Obtención Eficiente de Datos: GraphQL permite a los clientes solicitar solo los datos que necesitan, minimizando el exceso o falta de datos.

- Endpoint Único: A diferencia de las API REST, GraphQL utiliza un único punto final para todas las solicitudes de datos, reduciendo el número de peticiones de red y simplificando la comunicación cliente-servidor.

- Esquema Fuertemente Tipado: Las APIs de GraphQL están definidas por un esquema que describe claramente los tipos y operaciones disponibles. Esto facilita que los desarrolladores comprendan y utilicen la API.

- Flexibilidad: Los clientes pueden especificar la forma y estructura de los datos de respuesta, otorgándoles más control sobre los datos que reciben.

- Agrupación y Caché: GraphQL permite a los clientes agrupar varias solicitudes en una sola consulta, y las respuestas se pueden cachear eficientemente.
