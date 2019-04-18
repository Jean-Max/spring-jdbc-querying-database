# spring-jdbc-querying-database
===============================
###1. Topic
$ Using Spring JDBC to retrieve datas from database

###2. To run this project locally
$ git clone https://github.com/Jean-Max/spring-jdbc-querying-database.git
- you have to checkout on dev branch


###3. To test this configuration
$ Run MusicDaoTest as a Junit test, it will execute
- findMusicByName() using RowMapper interface
- findAllMusics() using ResultSetExtractor interface
- generateAllMusics() using RowCallbackHandler interface OPTIONAL
- getCategory(String name) using generic query

$ You have to implement the 4 interfaces to fetch records from database
Implementations are located in com.viseo.formation.dao.impl.todo
