<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.westzone.milan.model.Registration,org.westzone.milan.service.RegistrationService"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration View</title>
<link href="css/demo_page.css" rel="stylesheet" type="text/css" />
<link href="css/demo_table.css" rel="stylesheet" type="text/css" />       
<link href="css/demo_table_jui.css" rel="stylesheet" type="text/css" />

<link href="css/jquery-ui-1.8.24.custom.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery.dataTables.js" type="text/javascript"></script>
 <script type="text/javascript">
        $(document).ready(function () {
            $("#registrations").dataTable({
                "sPaginationType": "full_numbers",
                "bJQueryUI": true               
            });
        });
 </script>
</head>
<body id="dt_example" background="#ffffe0">
<div id="container">
<div id="header">
      <img src="http://swadhyay.org/images/img1.jpg" width="800" height="145">
</div>
<h1>Registration View</h1>
<div id="demo_jui">
<table id="registrations" class="display">
		            <thead>
		                <tr>
		                    <th><u>Full Name</u></th>
		                    <th><u>Zone</u></th>
		                    <th><u>Kendra</u></th>
		                    <th><u>Room Number</u></th>
		                </tr>
		            </thead>
		            <tbody>
		          		<% for(Registration r: RegistrationService.getInstance().getRegistrations()){ %>
						  <tr>
						    <td><%=r.getFullname()%></td>
						    <td><%=r.getZone()%></td>
						    <td><%=r.getKendra()%></td>
						    <td><%=r.getRoomNum()%></td>
						  </tr>
						<% } %>
		            </tbody>
		        </table>
		        </div>
 </div>
</body>
</html>