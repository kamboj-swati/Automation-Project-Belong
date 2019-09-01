# BelongAutomationTask
Automation framework in Cucumber BDD using Junit

INTRODUCTION

This project covers 4 scenarios :
1. User with valid email can be registered successfully
2. Entering invalid email leads to an error message
3. User can view Summer Dresses under the megamenu tag Dresses
4. User can add a dress to the cart and validate the same

IMPLEMENTATION:



1. Two feature files have been created, one for User Registration and other for Menus and Cart validation
2. Each feature file has 2 Scenarios
3. Each scenario has its unique tag along with a main tag for that Feature
4. Two runner classes have been created to run the scenarios in parallel (2 Threads can run)
5. Project can run on Chrome and forefox browser
6. Various tags defined in the Feature file includes:
tags= {"@User-Register","@Megamenu","@Summer-Dresses","@Cart-Validation","@User-Register-InvalidEmail","@User-Register-ValidEmail"}


REQUIREMENTS

JDK 1.8
Maven
Cucumber
Eclipse
Maven Compiler Plugin
Maven Surefire Plugin

REPO contains :

    /src/main/java - contains all the locators and actions files
    /src/main/resources - contains utilities
    /src/test/java - contains runner and step definition file
    /src/test/resources - contains feature files
    /pom.xml - Plugins and dependencies
    /.project and .classpath - project files for eclipse
    /READMe.md - this file

COMPILE AND RUN THE PROJECT :

1. From command Line, go to the project directory and run command :
    mvn clean

2. To run the Tests next, run the command(Below command will run the scenarios in PARALLEL on given browser):
    mvn test -Dbrowser=browsername
    e.g. mvn test -Dbrowser=chrome

3. To specify the Tags while running, use below command:
    mvn verify "-Dcucumber.options=--tags @User-Register-InvalidEmail" -Dbrowser=firefox
    e.g. mvn verify "-Dcucumber.options=--tags @User-Register-InvalidEmail" -Dbrowser=firefox
    
    or multiple tags can be defind in one command
    e.g. mvn verify -Dcucumber.options="--tags @Megamenu" -Dcucumber.options="--tags @User-Register" -Dbrowser=chrome

