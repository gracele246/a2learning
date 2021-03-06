package com.nighthawk.csa.data.SQL;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
Extends the JpaRepository interface from Spring Data JPA.
-- Java Persistent API (JPA) - Hibernate: map, store, update and retrieve data
-- JpaRepository defines standard CRUD methods
-- Via JPA the developer can retrieve data from relational databases to Java objects and vice versa.
*/
public interface GameJpaRepository extends JpaRepository<Person, Long> {
    // JPA query, findBy does JPA magic with "Name", "Containing", "Or", "Email", "IgnoreCase"
    List<Person> findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name, String email);
   /* Custom JPA query articles, there are articles that show custom SQL as well
      https://springframework.guru/spring-data-jpa-query/
      https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
    */

    // Custom JPA query


}

