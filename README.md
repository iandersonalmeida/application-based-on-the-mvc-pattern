# Data Storage System
This application requests data from the user and stores this data in a database.
 
# Description
Based on the MVC (Model-View-Controller) architecture this application through <br> a view that represents the UI captures data from the user. <br> This data is processed by the controller which contains local classes that handle events. <br> The information updates the model and is sent to the connected database via JDBC, <br> and together with the DAO pattern the persistence of the data is performed.

# Getting Started

## Prerequisites
- Eclipse IDE
- Visual Studio Code or other code editor with support for version control.
- Git.
- MySQL Workbench or other database design tool.

## Installation
```
git clone (repository)
```
## Executing program
- Create a database with one or more tables.
- In the development environment, define the database to be used in ConnectionFactory with the root and password.
- Define SQL statements in ModelDao.
 
