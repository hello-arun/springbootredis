# Demo
We will implement Get API from Spring Boot.

## Get Request
When a GET request is sent to the server, the server sends back the requested data in the response body.

## Rest Controller
A Rest Controller is a specific type of Spring MVC controller that is used to handle RESTful web services requests. REST stands for Representational State Transfer, which is an architectural style that uses HTTP methods like GET, POST, PUT, DELETE, etc. to manipulate resources (such as data) over the web.

A Rest Controller in Spring is simply a Java class that is annotated with @RestController, which tells Spring that this class will handle RESTful web service requests. Inside a Rest Controller, we define methods that correspond to different HTTP methods (like GET, POST, etc.), and annotate them with appropriate HTTP method-specific annotations such as @GetMapping, @PostMapping, etc.

The Rest Controller receives the HTTP request, processes it and returns a response in a specific format, typically JSON or XML. The request and response bodies can be automatically serialized and deserialized to and from Java objects using Spring's built-in converters, making it easy to work with JSON and XML data in a Spring application.

In summary, a Rest Controller in Spring is a specialized type of controller that is designed to handle RESTful web service requests, allowing us to easily build robust and scalable RESTful web services in our Spring applications.

## GET mapping vs Request Mapping

Yes, I'd be happy to explain why we use both @GetMapping and @RequestMapping annotations in a Spring Boot application.

@RequestMapping is a more general-purpose annotation that can be used to map any HTTP request to a method in a Spring Controller. It can be used to specify the HTTP method, request URI, headers, and other parameters that are used to match the request to the appropriate method.

@GetMapping is a specific type of @RequestMapping that's used to map HTTP GET requests to a method in a Spring Controller. It's a shorthand annotation that's equivalent to @RequestMapping(method = RequestMethod.GET).

In other words, @GetMapping is a more specific version of @RequestMapping that's used to handle only HTTP GET requests. By using @GetMapping instead of @RequestMapping, we can make our code more concise and easier to read, since we don't have to specify the HTTP method explicitly.