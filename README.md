# WeatherData APIs

Para executar o projeto é necessario seguir os seguintes passos:

1) Realizar download ou executar o camando abaixo:
-- git clone https://github.com/daividpaulo/weatherdata.git

2) Este projeto foi desenvolvido com as tecnologias JAVA 8 e Spring Boot com suporte MAVEN, para executar o projeto:
-- mvn spring-boot:run

3) Para realizar um deploy você poderá utilizar o proprio maven para criação do arquivo de deploy .war
-- mvn resources:resources compiler:compile war:war
** Este arquivo será gerado na pasta Target dentro do projeto.

Apis existentes até o momento:

-- GET http://yourpath/api/weather/current
-- GET http://yourpath/api/weather/history
-- GET http://yourpah/api/city/capitals
