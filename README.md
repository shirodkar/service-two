# Service Two

## A sample Quarkus application

This is a microservice which exposes the REST endpoint:

`GET /handle/{value}`

The input value is:

1. Stored in a database as an Access Log (timestamp, request value, response value)
2. Returned back in the format `<value>:<value>`

Database Configuration properties:

`quarkus.datasource.jdbc.url`  
`quarkus.datasource.username`  
`quarkus.datasource.password`  
`quarkus.datasource.db-kind`  
