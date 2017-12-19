# Hibernate_Validation_API_Simple
It’s very easy to use Hibernate Validator and best part is that we can easily extend it and create our own custom validation annotations. Today we will look into the hibernate validator in detail with examples. Finally we will have a test program to check out the validations.

# Project set up
In order to use Hibernate Validator within a Maven project, simply add the following dependency to your pom.xml:

<dependency>
   <groupId>org.hibernate</groupId>
   <artifactId>hibernate-validator</artifactId>
   <version>6.0.5.Final</version>
</dependency>

This transitively pulls in the dependency to the Bean Validation API (javax.validation:validation-api:2.0.0.Final).
