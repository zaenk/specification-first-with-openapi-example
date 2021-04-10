# Specification first development with OpenAPI

*This is not a template, don't try to use it as such*

This is an example for spec first development of a Spring Boot app with
using OpenAPI and the OpenAPI generator Gradle plugin. The workflow would look
something like this:

- The developer creates schemas, tags and operations in [petstore.yaml](src/main/resources/openapi/petstore.yaml)
- Runs the code generation `./gradlew openApiGenerate`
- Implements the generated `*Api` interfaces as `@RestControllers`, e.g.
  [generated PetsApi.kt](build/generated/src/main/kotlin/com/example/api/apis/PetsApi.kt) and
  [implemented PetController.kt](src/main/kotlin/com/example/specfirstopenapi/rest/PetController.kt)

This approach removes a nice amount of yak shaving (data classes, validation, controller annotations) and 
adds some kind of type safety to api implementors (with java-spring generator even compilation errors).
No coping required or syncing strings required.

**The generated sources should not be checked in git, these are checked in here for demonstration purposes only**
