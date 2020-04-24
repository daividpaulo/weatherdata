DROP TABLE IF EXISTS CITIES;
DROP TABLE IF EXISTS WEATHER_DATA;

CREATE TABLE CITIES (
  id_city INT PRIMARY KEY,
  ibge INT  NOT NULL UNIQUE,
  name VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  country VARCHAR(2) NOT NULL,
  capital BOOLEAN
);

CREATE TABLE WEATHER_DATA (
   data TIMESTAMP NOT NULL,
   id_city INT NOT NULL,
   name_city VARCHAR(250),
   clouds_percent INT,
   weather_description VARCHAR(100),
   weather_icon VARCHAR(30),
   temp DOUBLE,
   temp_min DOUBLE,
   temp_max DOUBLE,
   pressure DOUBLE,
   humidity DOUBLE,
   speed_wind DOUBLE
 );
 
 ALTER TABLE WEATHER_DATA ADD PRIMARY KEY (data, id_city);
  
