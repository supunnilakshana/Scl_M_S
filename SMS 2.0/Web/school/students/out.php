<html>
    <head>
        
        <title>In school Students Details </title>
    <style>
        
        
        th, td {
            border-width:1px;  
    border-style:solid;
            text-align: center;
            
            
        }
        
        .hed{
       background-color: #70dbdb;
            
            
        }
        .in{
            
            background-color:#33ff77;
            
        }
        .out{
            
            background-color:#ffa366;
            
        }
        h3{
            
            text-align: center;
            font-weight: bold;
        }
        </style>
    
    </head>
    <body>
        <h3>In school Students Details</h3>
        
        <?php
        error_reporting (E_ALL ^ E_NOTICE);
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "school";



        // Create connection
        $conn = new mysqli($servername, $username, $password, $dbname);
        // Check connection
        if ($conn->connect_error) {
          die("Connection failed: " . $conn->connect_error);
        }

        $sql = "SELECT * FROM student";
        $result = $conn->query($sql);

        if ($result->num_rows > 0) {
          echo "<table  cellspacing =0 style='border: solid 1px black;'><tr class='hed' ><th>Admission No</th><th>Identity_no</th><th>Name</th><th>Full_name</th><th>Gender</th><th>Dob</th><th>Date_of_admission</th><th>Race</th><th>Religion</th><th>Guardian_name</th><th>Address</th><th>Leaving_date</th> <th>Last_grade</th> <th>Leaving_c_no</th> <th>Leaving_c_date</th> <th>Status</th> </tr>";
          // output data of each row
          while($row = $result->fetch_assoc()) {


              if($row["status"]=="IN"){

                /*  echo "<tr class='in'><td>".$row["Admission_no"]."</td><td>".$row["Identity_no"]." </td><td>".$row["Name"]."</td><td>".$row["Full_name"]."</td> <td>".$row["Gender"]."</td> <td>".$row["Dob"]."</td> <td>".$row["Date_of_admission"]."</td> <td>".$row["Race"]."</td> <td>".$row["Religion"]."</td> <td>".$row["Guardian_name"]."</td> <td>".$row["Address"]."</td> <td>".$row["Leaving_date"]."</td><td>".$row["Last_grade"]."</td> <td>".$row["Leaving_c_no"]."</td> <td>".$row["Leaving_c_date"]."</td> <td>".$row["status"]."</td> </tr>";*/

              }else{
                   echo "<tr class= 'out'><td>".$row["Admission_no"]."</td><td>".$row["Identity_no"]." </td><td>".$row["Name"]."</td><td>".$row["Full_name"]."</td> <td>".$row["Gender"]."</td> <td>".$row["Dob"]."</td> <td>".$row["Date_of_admission"]."</td> <td>".$row["Race"]."</td> <td>".$row["Religion"]."</td> <td>".$row["Guardian_name"]."</td> <td>".$row["Address"]."</td> <td>".$row["Leaving_date"]."</td><td>".$row["Last_grade"]."</td> <td>".$row["Leaving_c_no"]."</td> <td>".$row["Leaving_c_date"]."</td> <td>".$row["status"]."</td> </tr>";

              }


          }
          echo "</table>";
        } else {
          echo "0 results";
        }
        $conn->close();
        ?>
    </body>
</html>