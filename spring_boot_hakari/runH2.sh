dialect="org.hibernate.dialect.H2Dialect"
url="jdbc:h2:mem:testdb"
driverClassName="org.h2.Driver"
username="sa"
password="password"

mvn spring-boot:run -Dspring-boot.run.arguments="
--spring.jpa.database-platform=${dialect}
--spring.datasource.jdbc-url=${url}
--spring.datasource.driverClassName=${driverClassName}
--spring.datasource.username=${username}
--spring.datasource.password=${password}
--spring.flyway.url=${url}
--spring.flyway.user=${username}
--spring.flyway.password=${password}"