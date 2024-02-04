dialect="org.hibernate.dialect.PostgreSQLDialect"
url="jdbc:postgresql://localhost:5432/postgres"
driverClassName="org.postgresql.Driver"
username="postgres"
password="1234"

mvn spring-boot:run -Dspring-boot.run.arguments="
--spring.jpa.database-platform=${dialect}
--spring.datasource.jdbc-url=${url}
--spring.datasource.driverClassName=${driverClassName}
--spring.datasource.username=${username}
--spring.datasource.password=${password}
--spring.flyway.url=${url}
--spring.flyway.user=${username}
--spring.flyway.password=${password}"