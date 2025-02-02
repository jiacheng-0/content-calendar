# Content Calendar - Spring Course

https://www.youtube.com/watch?v=UgX5lgv4uVM

![image-20250202174832939](README.assets/image-20250202174832939.png)

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

















