<form:checkboxes path="categories"
                 items="${categories}"/>
<form:select path="institution" items="${institutions}"/>
<form:input path="zipCode" />
<form:input path="street" />
<form:input path="city"/>
<form:input path="quantity"/>
<form:textarea path="pickUpComment"/>
<form:input type="date" path="pickUpDate"/>
<form:input type="time" path="pickUpTime" />