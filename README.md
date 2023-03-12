# Grade-Management-API
API that allows users to perform CRUD operations on student, course, and grade information in a database.

For this project I am using spring boot with spring jpa to utilize an in-memory sql database to store the data. I used Postman to test the API functionality.
This project has a three layer design with repository, service, and web/controller layers as well as an entity folder to hold my pojo(plain old java object) files and an exception folder for all my exceptions.

In the pojo files I'm using lombok annotations to create my getters, setters, and constructors. I'm also using @Entity and @Table annotations to map my pojo classes to a table and specify the details of the table that will be used for the database. Additionally, I'm using @OneToMany annotations in the Course and Student files and a @ManyToOne annotation in the Grade file to create a one-to-many relationship between student, course, and grades such that one student can have multiple grades and one course can have multiple grades.

In the repository files I created an interface that inherits the CrudRepository interface, specifying the entity along with the data type of the entity's id. This allows the repository to interact with the sql database and to inherit methods such as save and findById.

In the service files, I have created a service interface with a few methods and a service implementation class which implements the service interface for each of the entity classes and is injecting the appropriate repository beans based on the dependencies of each class. I am using a constructor via the lombok annotation @AllArgsConstructor to inject the dependencies for each service implementation class. I also added the @Service annotation to the service implementation classes, indicating that this layer contains the business logic of the API.

In the web/controller files I am using a constructor via lombok to inject the appropriate service beans based on the dependencies of each class. I've also added the @RestController annotation which combines the @Controller and @ResponseBody annotations, indicating the class serves as a controller and that the object returned is automatically serialized into JSON and passed back into the HttpResponse object. I'm using various Mapping annotations to handle the HTTP requests; GET, POST, PUT, DELETE, for each of the handler methods.

Finally, I have created three {entity}NotFoundException classes for when a course/student/grade is not present in the database. Each of these classes extends the RuntimeException class and calls one of it's parameterized constructors using the super keyword, passing in a String message as the parameter.

