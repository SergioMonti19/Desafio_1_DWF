# BookAPI

A simple RESTful API built with Spring Boot to manage books.

##  Features

- List all books
- Add a new book
- Search books by title
- Delete a book by ID

# How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/SergioMonti19/Desafio_1_DWF.git
2.	Open the project in IntelliJ IDEA or your preferred Java IDE.
3.	Make sure you have:
o	Java 17+
o	Maven
4.	Run the project:
5.	./mvnw spring-boot:run
6.	Test the endpoints using Postman, Hoppscotch or curl.
Example Endpoints
Method	Endpoint	Description
GET	/books	Get all books
POST	/books	Add a new book
GET	/books/search?title=	Search books by title
DELETE	/books/{id}	Delete book by ID
 Sample JSON for POST
{
  "title": "The Hobbit",
  "author": "J.R.R. Tolkien",
  "publicationYear": 1937
}
 Technologies
•	Java 17+
•	Spring Boot 3.5.4
•	Spring Web
•	Spring Data JPA
•	H2 Database
•	Maven
