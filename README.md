
# Spring boot App with RestFUL APIs

A simple spring boot application with in memory array list database to demonstrate 
the power of RESTFul services provided by it.


## Installation

Clone with :

```
git clone https://github.com/NavTheRaj/spring-boot-lab-1.git
```
And just hit the ▶ play button in your IntelliJ IDEA.

## USAGE
### API Endpoints
#### Get All Posts
```
GET localhost:8080/api/v1/posts
```
#### Get Post By ID
```
GET localhost:8080/api/v1/posts/{id}
```
#### Create Post By ID
```
POST localhost:8080/api/v1/posts/{id}
```
#### Update Post By ID
```
PUT localhost:8080/api/v1/posts/{id}
```
#### Delete Post By ID
```
DELETE localhost:8080/api/v1/posts/{id}
```
#### Filter Post By Author Name
```
GET localhost:8080/api/v1/posts/filter?authorName={authorName}
```
#### Versioning Endpoint
```
GET localhost:8080/api/v2/posts
```

 

