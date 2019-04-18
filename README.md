# spring-jdbc-querying-database
===============================
###1. Topic
$ Using Spring JDBC to retrieve datas from database

###2. To run this project locally
$ git clone https://github.com/Jean-Max/spring-jdbc-querying-database.git

###3. To test this configuration
$ Run MusicDaoTest as a Junit test
$ You have to implement the 3 interfaces located in the package com.viseo.formation.dao.impl to fetch records from database
- findMusicByName() using RowMapper interface
- findAllMusics() using ResultSetExtractor interface
- generateAllMusics() using RowCallbackHandler interface