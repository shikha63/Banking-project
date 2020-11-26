
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<title>CreditCard-Home Page</title> 
</head>
<body>
<h2>Check for Credit Card Eligibility</h2>

<form:form action="checkEligibility" modelAttribute="credit" method="POST">
<label>Enter PAN Number:</label>
<form:input path="panNo" id="panNo" pattern="[A-Za-z0-9]{10}" title="10 Character Alpha numeric" required="required"/> 
<br/><br/>
<input type="submit" id="submit" value="Check">
</form:form>

</body>
</html>
