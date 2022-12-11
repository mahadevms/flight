<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perform checking</title>
</head>
<body>
<h2>Passenger Details</h2>
Passenger name:${reservation.getPassenger().firstName} <br/>
Passenger middleName:${reservation.getPassenger().middleName}<br/>
Passenger lastName:${reservation.getPassenger().lastName}<br/>
Passenger phone:${reservation.getPassenger().phone}<br/>
Passenger email:${reservation.getPassenger().email}<br/>

 operatingAirlines:${reservation.getFlight().operatingAirlines}<br/>
flightNumber:${reservation.getFlight().flightNumber}<br/>
departureCity:${reservation.getFlight().departureCity}<br/>
arrivalCity:${reservation.getFlight().arrivalCity}<br/>
dateOfDeparture:${reservation.getFlight().dateOfDeparture}<br/>
<h2>update Number of bags & Status</h2>
<form action="updateCheckin" method="post">
<pre>
reservation id:<input type="text" name="id" value="${reservation.id}">
number of Bags<input type="text" name="numberOfBags"/>
<input type="submit" value="update"/>
</pre>

</form>
</body>
</html>