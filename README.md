Старт глубинного изучения Spring Framework на базе Udemy
***
Metadata - представляет собой совокупность объектов (Bean Definitions)б
которые говорят IoC Container как создавать Beans, конфигурировать и внедрять их зависимости
***
Spring Application:
- POJOs: обычный объект, с набором свойств, констукторов и get/set методов. Не содержит логики (DTO, Entity)
- Metadata (Bean Definitions): XML-based, Annotation-based, Java-based
- IoC Container -> org.springframework.beans.factory.BeanFactory, org.springframework.context.ApplicationContext
***
Beans lifecycle:
BeanDefinitions -> IoC Container: {Sorted Bean Definition -> Bean constructor called -> Setter called -> Initialization callbacks: @PostConstruct, afterPropertiesSet(), init-method} 
-> Beans -> { Destruction callbacks: @PreDestroy, destroy() DisposableBean, destroy-method
