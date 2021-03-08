<html>
    <head>
        
        <title>Scholarship Examination Results</title>
    <style>
        
        
        th, td {
            border-width:1px;  
    border-style:solid;
            text-align: center;
            
            
        }
        
        .hed{
       background-color: #70dbdb;
            
            
        }
        .A{
            
            background-color:#33ff77;
            
        }
        .B{
            
            background-color:#99ff33;
            
        }
        .C{
            
            background-color:#ffd11a;
            
        }
        .F{
            
            background-color:  #ff944d;
            
        }
        
        h3{
            
            text-align: center;
            font-weight: bold;
        }
        </style>
    
    </head>
    <body>
        <h3>Scholarship Examination Results</h3>
        
        <?php
        error_reporting (E_ALL ^ E_NOTICE);
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "school";

        $yr = $_POST['year'];
        $CA=0;
        $CB=0;
        $CC=0;
        $CF=0;
        // Create connection
        $conn = new mysqli($servername, $username, $password, $dbname);
        // Check connection
        if ($conn->connect_error) {
          die("Connection failed: " . $conn->connect_error);
        }

        $sql = "SELECT * FROM scolar WHERE Year='$yr'";
        echo "<p> Year - ",$yr, "</p>";
        $result = $conn->query($sql);
        $name="344";
        if ($result->num_rows > 0) {
          echo "<table  cellspacing =0 cellpadding = 5 style='border: solid 1px black;'><tr class='hed' ><th>Index No</th><th>Admission No</th><th>Name</th><th>Gotten marks</th><th>Pass mark</th><th>Result Status</th> </tr>";
          // output data of each row
          while($row = $result->fetch_assoc()) {
              $a_id=$row["Admission_no"];
              $sql1 = "SELECT * FROM student WHERE Admission_no='$a_id'";
              $result1 = $conn->query($sql1);
              if ($result1->num_rows > 0) {
                   while($row1 = $result1->fetch_assoc()) {
                       $name=$row1["Full_name"];
                     //  echo $name;
                       
                   }
                  
                  
              }
              if(($row["Status"]=="A")){

                  echo "<tr class='A'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                  $CA++;

              }elseif ($row["Status"]=="B"){
                   echo "<tr class='B'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                  $CB++;

              }elseif($row["Status"]=="C"){
                  echo "<tr class='C'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                 $CC++;
              }else{
                  echo "<tr class='F'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                  $CF++;
        
                  
              }


          }
          echo "</table>";
        } else {
          echo "0 results";
        }
        $conn->close();
        
        
        $dataPoints = array( 
	array("y" => $CA, "label" => "A" ),
	array("y" => $CB, "label" => "B" ),
	array("y" => $CC, "label" => "C" ),
	array("y" => $CF, "label" => "F" ),
	
);
        
                      
        
        ?>
        
        <br><br><br><br>
        <script>
            window.onload = function() {
                   CanvasJS.addColorSet("greenShades",
                [//colorSet Array

                "#33ff77",
                "#99ff33",
                "#ffd11a",
                "#ff944d",
                            
                ]);

            var chart = new CanvasJS.Chart("chartContainer", {
                colorSet: "greenShades",
                animationEnabled: true,
                theme: "light2",
                title:{
                    text: "Scholarship Examination Results"
                },
                axisY: {
                    title: "No of students"
                },
                data: [{
                    type: "column",
                    yValueFormatString: "#,##0.## tonnes",
                    dataPoints: <?php echo json_encode($dataPoints, JSON_NUMERIC_CHECK); ?>
                }]
            });
            chart.render();

            }
</script>
        
        <div id="chartContainer" style="height: 370px; width: 75%;"></div>
        <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
    </body>
</html>