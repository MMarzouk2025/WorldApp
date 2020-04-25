# World-App
World data application

## Introduction
World Data Application is an open source application to access world statics for all world countries 

## Requirements
#### Docker installed

## Technologies
#### - JDK 8
#### - Spring Boot (and other lower level Spring modules)
#### - Docker
#### - Junit5 and Mockito

## Installation
#### first: deploy the following database image 
docker run -d -p 4321:5432 ghusta/postgres-world-db:2.4
#### second: run world app spring boot application using maven spring-boot:run plugin 
mvn spring-boot:run

## Example: [World App API]

localhost:9292/BHR
#### result =>
{
    "name": "Bahrain",
    "continent": "Asia",
    "population": 617000,
    "life_expectancy": 73.0,
    "country_language": "Arabic"
}

----------------------------------------------------------------------------

##### for further suggestions or communications, you can leave your comment
