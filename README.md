# Clean Architecture en Spring Boot

Backend Spring Boot del taller. Los datos de ejemplo se generan en memoria con JavaFaker.

## Arquitectura

Cada módulo sigue el flujo `controller -> use case -> repository -> datasource`. Las entidades y los contratos de repositorio están en `domain`; los casos de uso, en `application`; y los controladores, implementaciones y fuentes de datos, en `infrastructure`. `config/AppConfig.java` compone las dependencias mediante beans de Spring.

Los módulos disponibles son Users, Products, Categories, Orders y Suppliers.

## Requisitos y ejecución

- JDK 25, requerido por el toolchain definido en `build.gradle`.
- Windows: `./gradlew.bat bootRun` desde PowerShell.
- Linux/macOS: `./gradlew bootRun`.

La aplicación escucha en el puerto `8080` y utiliza `/api` como context path.

## API

Todas las rutas son `GET`, reciben la cantidad de registros como entero en la ruta y responden con una lista JSON. Por ejemplo, `GET /api/users/5` devuelve cinco usuarios.

| Ruta | Campos de respuesta |
|---|---|
| `/api/users/{countUsers}` | `id`, `name`, `lastName`, `age`, `email`, `engineering` |
| `/api/products/{countProducts}` | `id`, `name`, `category`, `price` |
| `/api/categories/{countCategories}` | `id`, `name`, `description` |
| `/api/orders/{countOrders}` | `id`, `customer`, `total`, `status` (`Pendiente`, `Enviado`, `Entregado`) |
| `/api/suppliers/{countSuppliers}` | `id`, `name`, `email`, `phone` |

Swagger UI: `http://localhost:8080/api/swagger-ui.html`
OpenAPI JSON: `http://localhost:8080/api/v3/api-docs`

## Pruebas

En Windows, ejecutar `./gradlew.bat test` desde PowerShell; en Linux/macOS, ejecutar `./gradlew test`.