<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="CSS/Reg1istration.css">
    <script type="text/javascript">
        function validateForm() {
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;
            if (password !== confirmPassword) {
                alert("Passwords do not match. Please re-enter your password.");
                return false;
            }
            return true;
        }

        function confirmDetails() {
            if (!validateForm()) {
                return false;
            }

            document.getElementById("confirmDetails").style.display = 'block';
            document.getElementById("registrationForm").style.display = 'none';

            document.getElementById("confirmFirstname").innerText = document.getElementById("firstname").value;
            document.getElementById("confirmLastname").innerText = document.getElementById("lastname").value;
            document.getElementById("confirmUsername").innerText = document.getElementById("username").value;
            document.getElementById("confirmPassword").innerText = '********';
            document.getElementById("confirmEmail").innerText = document.getElementById("email").value;
            document.getElementById("confirmGender").innerText = document.getElementById("gender").value;
            document.getElementById("confirmCollege").innerText = document.getElementById("college").options[document.getElementById("college").selectedIndex].text;
            document.getElementById("confirmDepartment").innerText = document.getElementById("department").options[document.getElementById("department").selectedIndex].text;
            document.getElementById("confirmBatchYear").innerText = document.getElementById("batchYear").value;

            // Populate hidden fields for submission
            document.getElementById("hiddenFirstname").value = document.getElementById("firstname").value;
            document.getElementById("hiddenLastname").value = document.getElementById("lastname").value;
            document.getElementById("hiddenUsername").value = document.getElementById("username").value;
            document.getElementById("hiddenPassword").value = document.getElementById("password").value;
            document.getElementById("hiddenEmail").value = document.getElementById("email").value;
            document.getElementById("hiddenGender").value = document.getElementById("gender").value;
            document.getElementById("hiddenCollege").value = document.getElementById("college").value;
            document.getElementById("hiddenDepartment").value = document.getElementById("department").value;
            document.getElementById("hiddenBatchYear").value = document.getElementById("batchYear").value;
        }

        function editDetails() {
            document.getElementById("confirmDetails").style.display = 'none';
            document.getElementById("registrationForm").style.display = 'block';
        }
    </script>
</head>
<body>
    <div class="registration-container">
        <h2>User Registration</h2>
        
        <%-- Check if there's an error message --%>
        <% String errorMessage = request.getParameter("error"); %>
        <% if (errorMessage != null && !errorMessage.isEmpty()) { %>
            <div class="error-message">
                <%= errorMessage %>
            </div>
        <% } %>
        
        <div id="registrationForm">
            <form onsubmit="return validateForm()">
                <label for="firstname">First Name</label>
                <input type="text" id="firstname" name="firstname" required>
                
                <label for="lastname">Last Name</label>
                <input type="text" id="lastname" name="lastname" required>
                
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>      
                
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
                
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
                
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
                
                <label for="gender">Gender</label>
                <select id="gender" name="gender">
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>
                
                <label for="college">College</label>
                <select id="college" name="college" required>
                    <option value="2533">CSMSS Chh. Shahu College of Engineering</option>
                </select>
                
                <label for="department">Department</label>
                <select id="department" name="department" required>
                    <option value="1">Artificial Intelligence and Data Science</option>
                    <option value="2">Computer Science and Engineering</option>
                    <option value="3">Electronics and Telecommunication</option>
                </select>
                
                <label for="batchYear">Batch Year</label>
                <input type="text" id="batchYear" name="batchYear" required>
                
                <button type="button" onclick="confirmDetails()">Confirm</button>
            </form>
        </div>
        
        <div id="confirmDetails" style="display:none;">
            <h3>Confirm Your Details</h3>
            <p><strong>First Name:</strong> <span id="confirmFirstname"></span></p>
            <p><strong>Last Name:</strong> <span id="confirmLastname"></span></p>
            <p><strong>Username:</strong> <span id="confirmUsername"></span></p>
            <p><strong>Password:</strong> <span id="confirmPassword"></span></p>
            <p><strong>Email:</strong> <span id="confirmEmail"></span></p>
            <p><strong>Gender:</strong> <span id="confirmGender"></span></p>
            <p><strong>College:</strong> <span id="confirmCollege"></span></p>
            <p><strong>Department:</strong> <span id="confirmDepartment"></span></p>
            <p><strong>Batch Year:</strong> <span id="confirmBatchYear"></span></p>
            
            <button type="button" onclick="editDetails()">Edit</button>
            <form action="Registration" method="post" onsubmit="return validateForm()">
                <input type="hidden" name="firstname" id="hiddenFirstname">
                <input type="hidden" name="lastname" id="hiddenLastname">
                <input type="hidden" name="username" id="hiddenUsername">
                <input type="hidden" name="password" id="hiddenPassword">
                <input type="hidden" name="email" id="hiddenEmail">
                <input type="hidden" name="gender" id="hiddenGender">
                <input type="hidden" name="college" id="hiddenCollege">
                <input type="hidden" name="department" id="hiddenDepartment">
                <input type="hidden" name="batchYear" id="hiddenBatchYear">
                <input type="submit" value="Submit">
            </form>
        </div>
        
        <div class="login-link">
            <p>Already registered? <a href="login.jsp">Login here</a></p>
        </div>
    </div>
</body>
</html>
