# Content Calendar - Spring Course

Just practising with the tutorial below

![image-20250202174832939](README.assets/image-20250202174832939.png)

[Spring Boot Tutorial for Beginners - Crash Course using Spring Boot 3](https://www.youtube.com/watch?v=UgX5lgv4uVM)

# Important Concepts

- Application Context
- CRUD
- HttpStatus
- Enum
- Spring Validation @NotBlank constraint

# Notes 

- Spring Boot 3

### **Core Configuration and Annotation Processing**

1. **`org.springframework.context.annotation.internalConfigurationAnnotationProcessor`**
   - Responsible for processing `@Configuration` classes and creating bean definitions.
2. **`org.springframework.context.annotation.internalAutowiredAnnotationProcessor`**
   - Handles `@Autowired` and `@Value` annotations for dependency injection.
3. **`org.springframework.context.annotation.internalCommonAnnotationProcessor`**
   - Processes common annotations like `@PostConstruct`, `@PreDestroy`, and `@Resource`.
4. **`org.springframework.context.event.internalEventListenerProcessor`**
   - Detects and processes `@EventListener` methods for event handling.
5. **`org.springframework.context.event.internalEventListenerFactory`**
   - Creates `ApplicationListener` instances for `@EventListener` methods.

















