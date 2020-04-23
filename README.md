# hello-spring-boot-autoconfigure

## How to impl custom auto configuration

- pom.xml中引入spring boot的依赖项：`spring-boot-autoconfigure`
- 编写自定义配置类
- 在`META_INF/spring.factories`文件中指定需要自动配置的类: `org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.iterators.HelloAutoConfiguration`