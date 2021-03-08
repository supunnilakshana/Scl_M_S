<html>
    <head>
        
        <title>In school Teachers Details </title>
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
        <h3>In school Teachers Details</h3>
        
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

        $sql = "SELECT * FROM teacher";
        $result = $conn->query($sql);

        if ($result->num_rows > 0) {
              echo "<table  cellspacing =0 style='border: solid 1px black;'><tr class='hed' ><th>Serial No</th><th>Computerized No</th><th>Name</th><th>Full_name</th><th>Birthday</th><th>N.I.C NO</th><th>Personal address</th><th> Tel No</th><th>Registation No</th><th>Professional Qualification</th><th>Educational Qualification</th><th>Date of first school appointed</th><th>First school appointed</th><th>Grade</th><th>Date Of Apointment Confirm</th><th>Difficult service period</th> <th>Date of appointed zoon</th> <th>Date of appointed school</th> <th>W/O Penssion No</th> <th>Status</th> </tr>";
          // output data of each row
          while($row = $result->fetch_assoc()) {

              if($row["status"]=="IN"){

                 echo "<tr class='in'><td>".$row["serial_no"]."</td><td>".$row["computer_no"]." </td><td>".$row["name"]."</td><td>".$row["full_name"]."</td> <td>".$row["dob"]."</td> <td>".$row["nic_no"]."</td> <td>".$row["personal_addr"]."</td> <td>".$row["tel_no"]."</td><td>".$row["reg_no"]."</td><td>".$row["prof_qualification"]."</td> <td>".$row["educational_qualification"]."</td> <td>".$row["first_school_ap"]."</td> <td>".$row["first_apponit_date"]."</td><td>".$row["grade_class"]."</td> <td>".$row["conf_apoint_date"]."</td> <td>".$row["difficult_period"]."</td> <td>".$row["appoint_zone_date"]."</td><td>".$row["appoint_school_date"]."</td><td>".$row["w_o_penssion_no"]."</td><td>".$row["status"]."</td> </tr>";
              

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