<%-- 
    Document   : demo
    Created on : Aug 7, 2018, 3:47:19 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Send Mail</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <br/><br/><br/><br/>

            <div class="col-md-6 offset-md-3">
                <h2>Request for batch launch</h2><br/>
                <form action="#" method="get" id="myID">
                    <div>
                    <div class="form-group">
                        <!--    <label for="facName">Faculty Name</label>-->
                        <input type="text" class="form-control" id="facName" name="facName" placeholder="Enter your name">
                    </div>
                    <div class="form-group">
                        <!--    <label for="email">Email address:</label>-->
                        <input type="email" class="form-control" id="email" name="email" placeholder="Enter your mailId">
                    </div>
                    <div class="form-group">
                        <!--    <label for="crsName">Course Name:</label>-->
                        <input type="text" class="form-control" id="crsName" name="crsName" placeholder="Subject you are taking">
                    </div>
                    <div class="input-group">
                        <!--    <label for="crsName">Course Name:</label>-->
                        <input type="text" class="form-control" id="stdId" placeholder="Enter Student Id">  
                        <input type="text" class="form-control" id="stdName" placeholder="Enter Student names">  
                        <div class="input-group-append">
                            <button type="button" class="btn btn-outline-primary btn-sm" onclick="showValues()">Add</button>
                        </div>

                    </div>
                    
                    <br><br>
                    <div class="container">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Student Id</th>
                                    <th>Full Name</th>

                                </tr>
                            </thead>
                            <tbody id="tbdy">
                                        
                            </tbody>
                        </table>
                    </div>
                    <br/>
                    <button type="button" class="btn btn-outline-primary" id="btnSubmit" onclick="getValues()" >Schedule Mail</button>

                </form>
            </div>
        </div>
        <script>
           function showValues()
            {
                var nm = document.getElementById("stdName");
                var name = nm.value;
                var stdId = document.getElementById("stdId");
                var stId = stdId.value;
                var tblRw = "<tr><td name='tblData_Id'>" + stId + "</td><td name='tblData_nm'>" + name + "</td></tr>";
                $("#tbdy").append(tblRw);
                nm.value = "";
                stdId.value = "";
                $(stdId).focus();
            }

            function getValues()
            {  
                var x = document.getElementsByName("tblData_Id");
                var y = document.getElementsByName("tblData_nm");
                for (i = 0; i < x.length; i++)
                {
                    console.log(x[i].innerHTML);
                   // window.location.replace("SendMail?=id"+x[i]);
                }
                for (j = 0; j < y.length; j++)
                {
                    console.log(y[j].innerHTML);
                    //     window.location.replace("SendMail?=name"+x[j]);
                }
            }
        </script>
    </body>
</html>
