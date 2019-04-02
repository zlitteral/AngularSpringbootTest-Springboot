# AngularSpringbootTest-Springboot
Showcasing e2e calls with Angular and Springboot utilizing a mySQL db

**TODO: Add in unit testing**

*This guide is assuming you've already installed java*

**Steps to run**
1. Navigate to `https://dev.mysql.com/downloads/mysql/` and download MYSQL Community Server
2. Name your database `shipwreck_dev`
3. Open your mySQL interface of choice(I use MySQL Workbench)
4. With your `shipwreck_dev` database open, run the commands:
```
CREATE TABLE `shipwreck` (
  `ID` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Condition` varchar(45) DEFAULT NULL,
  `Depth` int(11) DEFAULT NULL,
  `Lattitude` float(3,2) DEFAULT NULL,
  `Longitude` float(3,2) DEFAULT NULL,
  `YearDiscovered` int(11) DEFAULT NULL,
  `year_discovered` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `shipwreck` VALUES (1,'U869','A very deep German UBoat','FAIR',200,0.00,0.00,1994,NULL),(2,'Thistlegorm','British merchant boat in the Red Sea','GOOD',80,0.00,0.00,1994,NULL),(3,'S.S. Yongala','Wrecked on the great barrier reef','FAIR',50,0.00,0.00,1994,NULL);
```

5. Open the project in your editor of choice(for this demo I'm using Intellij
6. Open the applications.properties folder and change the fields(shown below) username and password to whatever you set them up as with mySQL
```

# Automatically update the database
spring.jpa.hibernate.ddl-auto=update

# The database connection URL
spring.datasource.url=jdbc:mysql://localhost:3306/shipwreck_dev?useSSL=false

# Username
spring.datasource.username=your-username

# Password
spring.datasource.password=your-password

# Define the database platform
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect

# Define the naming strategy
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy

# Define the default schema
spring.jpa.properties.hibernate.default_schema=schema
```

7. Run the Java project
*For this next step we have a couple options*
8a. If you have the Angular app running (featured here: https://github.com/zlitteral/AngularSpringbootTest-Angular), on Windows, hit windows key + R and paste in the command `chrome.exe --user-data-dir="C://Chrome dev session" --disable-web-security` This will get around chrome's rules about CORS. Now navigate to http://localhost:4200
8b. If you do not want to run the angular app, you can run the app through postman. I don't have the environments in the repo right now so the appropriate url to test with is http://localhost:8080/shipwrecks

**Steps to test**

This section is on hold until I get the unit testing working
