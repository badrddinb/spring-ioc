# spring-ioc-xml
Spring Inversion of Control (IoC) using xml configuration

## The Inversion of Control
The Spring IoC container and is responsible for instantiating, configuring, and assembling the aforementioned beans.

Example
-------
1. Create required interface. Example: [Menu.kt](https://github.com/badrddinb/spring-ioc-xml/blob/main/src/main/kotlin/com/badrddinb/spring/springiocxml/Menu.kt)
2. Create objects needed from exact interface (Step 1). Example: [Menus Package](https://github.com/badrddinb/spring-ioc-xml/tree/main/src/main/kotlin/com/badrddinb/spring/springiocxml/Menus)
3. Define bean with a selected object (Step 2) in xml context file. Example: [menu-beans-config.xml](https://github.com/badrddinb/spring-ioc-xml/blob/main/src/main/resources/menu-beans-config.xml)
4. Load bean config from context file and run the app. Example: [SpringIocXmlApplication.kt](https://github.com/badrddinb/spring-ioc-xml/blob/main/src/main/kotlin/com/badrddinb/spring/springiocxml/SpringIocXmlApplication.kt)


Implementation of the IoC using XML configuration
-------------------------------------------------
In the example below, [Menu.kt](https://github.com/badrddinb/spring-ioc-xml/blob/main/src/main/kotlin/com/badrddinb/spring/springiocxml/Menu.kt) used as *Interface* and Categories ([Menus Package](https://github.com/badrddinb/spring-ioc-xml/tree/main/src/main/kotlin/com/badrddinb/spring/springiocxml/Menus)) as *Objects* for bean configuration in XML context file [SpringIocXmlApplication.kt](https://github.com/badrddinb/spring-ioc-xml/blob/main/src/main/kotlin/com/badrddinb/spring/springiocxml/SpringIocXmlApplication.kt).

Read more
---------
[The IoC container](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/beans.html) (docs.spring.io)
