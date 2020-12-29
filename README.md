# dogService
A simple REST/CRUD api that records a dog entity consisting of a dog name and an owner name
##### Dependancies
JDK 8+, Maven
##### Install
```mvn install```
##### Run
```mvn spring-boot:run``` 
## REST API 

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/e1094487fb1e0afa5ffe)
##### endpoints


POST - Create a new dog entry

```localhost:8080/dog```

{
       "dogName": "string",
       "ownerName": "string"
   }

GET - Read all dog entries

```localhost:8080/dog```

GET - Read a dog entry by Id

```localhost:8080/dog/{id}```

GET = Read dog entry by dog name & owner name

```localhost:8080/dog/search?dogName=string&ownerName=string```

PUT - Update a dog entry
```localhost:8080/dog```

{
    "id": int,
    "dogName": "string",
    "ownerName": "string"
}

DELETE - Delete a dog entry

```localhost:8080/dog/{id}```
