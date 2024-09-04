# Service Two

## A sample Quarkus application

This is a microservice which exposes a REST endpoint:

`GET /handle/{value}`

The input value is:

- Stored in a database as an access log
- Returned back in the format `<value>:<value>`

Database Configuration properties:

`quarkus.datasource.jdbc.url
quarkus.datasource.username
quarkus.datasource.password
quarkus.datasource.db-kind`