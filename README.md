# Restaurant-Management-System
Making a Restaurant Management System using Spring Boot

### Restaurant is having following properties
   - A tipical Restaurant  in our system will have these following properties
* restId
* restName
* restAddress
* restStaff
* restSpecial

#### Our Base Endpoing
   ```
    http://localhost:8080/api/v1/restaurant
```
  ### our project is having following endpoints
   * addRestaurant ( http://localhost:8080/api/v1/restaurant/add)
   * getRestaurantById( http://localhost:8080/api/v1/restaurant/{id}
   * getAllRestaurant( http://localhost:8080/api/v1/restaurant/all)
   * updateSpecialization( http://localhost:8080/api/v1/restaurant/{id}/{special})
   * deleteRestaurant( http://localhost:8080/api/v1/restaurant/del/{id})

## Frameworks and languages used
* Spring
* java
* Postman-- for testing the APIs


## Data Flow
 * Controller
   ```
       - Controller hold all the endponts with method associated with them, when client query any api they HTTP dispatch directs
          that query to controller. It hold only endpoints.
   ```
* Services
  ```
      - It has actual logic(business logic) for a particular endpoints. 
          It also has a Repo class which hold the datasource for project.
  ```   
 * Repository
   ```
        - It has data source and all the manipulation on data is defined here only.
   ```
 * Model
    ```
      - It has the schema of our Entities which are involved in project.
      - like in this project we have Restaurant as Entity.
   ```
 ## Data Structure
 ```
   - Here we are using List(ArrayList) datastructure.
   - ArrayList store the information about Restaurants

```

