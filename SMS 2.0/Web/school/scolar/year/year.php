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
       
        
        <?php
        error_reporting (E_ALL ^ E_NOTICE);
        
        /*class scloar(){

            public $a;
            public $b;
            public $c;
            public $f;
            public $yr;
            
            function set_name($yr,$a,$b,$c,$f) {
                $this->yr =$yr;
                $this->a = $a;
                $this->b = $b;
                $this->c = $c;
                $this->f = $f;
            }
            function get_yr() {
                return $this->;
            }
            
            function get_a() {
                return $this->;
            }
            
            function get_b() {
                return $this->;
            }
            
            function get_c() {
                return $this->;
            }

            function get_f() {
                return $this->;
            }



    }*/
        
        $yra=array();
        $a=array();
        $b=array();
        $c=array();
        $f=array();
        
        
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
        $yr=2013;
        for($j=0;$j<18;$j++){
        $CA=0;
        $CB=0;
        $CC=0;
        $CF=0;
        
        $sql = "SELECT * FROM scolar WHERE Year='$yr'";
        //echo "<p> Year - ",$yr, "</p>";
        $result = $conn->query($sql);
        $name="344";
        if ($result->num_rows > 0) {
         // echo "<table  cellspacing =0 cellpadding = 5 style='border: solid 1px black;'><tr class='hed' ><th>Index No</th><th>Admission No</th><th>Name</th><th>Gotten marks</th><th>Pass mark</th><th>Result Status</th> </tr>";
          // output data of each row
          while($row = $result->fetch_assoc()) {
              $a_id=$row["Admission_no"];
              $sql1 = "SELECT * FROM student WHERE Admission_no='$a_id'";
              $result1 = $conn->query($sql1);
              if ($result1->num_rows > 0) {
                   while($row1 = $result1->fetch_assoc()) {
                     //  $name=$row1["Full_name"];
                     //  echo $name;
                       
                   }
                  
                  
              }
              if(($row["Status"]=="A")){

                 // echo "<tr class='A'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                  $CA++;

              }elseif ($row["Status"]=="B"){
                  // echo "<tr class='B'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                  $CB++;

              }elseif($row["Status"]=="C"){
                //  echo "<tr class='C'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                 $CC++;
              }else{
                //  echo "<tr class='F'><td>".$row["Indext_no"]."</td><td>".$row["Admission_no"]." </td><td>".$name."</td><td>".$row["Own_mark"]."</td> <td>".$row["Pass_mark"]."</td> <td>".$row["Status"]."</td></tr>";
                  $CF++;
        
                  
              }


          }
          //echo "</table>";
        } else {
          //echo "0 results";
        }
            
            $yra[$j]=$yr;
            $a[$j]=$CA;
            $b[$j]=$CB;
            $c[$j]=$CC;
            $f[$j]=$CF;
            
            
            $yr++;   
            
            
        }
        $conn->close();
        
        
        $dataPoints1 = array(
            array("label"=> $yra[0], "y"=> $a[0]),
            array("label"=> $yra[1], "y"=> $a[1]),
            array("label"=> $yra[2], "y"=> $a[2]),
            array("label"=> $yra[3], "y"=> $a[3]),
            array("label"=> $yra[4], "y"=> $a[4]),
            array("label"=> $yra[5], "y"=> $a[5]),
            array("label"=> $yra[6], "y"=> $a[6]),
            array("label"=> $yra[7], "y"=> $a[7]),
            array("label"=> $yra[8], "y"=> $a[8]),
            array("label"=> $yra[9], "y"=> $a[9]),
            array("label"=> $yra[10], "y"=> $a[10]),
            array("label"=> $yra[11], "y"=> $a[11]),
            array("label"=> $yra[12], "y"=> $a[12]),
            array("label"=> $yra[13], "y"=> $a[13]),
            array("label"=> $yra[14], "y"=> $a[14]),
            array("label"=> $yra[15], "y"=> $a[15]),
            array("label"=> $yra[16], "y"=> $a[16]),
            array("label"=> $yra[17], "y"=> $a[17])
            
        
            
        );
       $dataPoints2 = array(
             array("label"=> $yra[0], "y"=> $b[0]),
            array("label"=> $yra[1], "y"=> $b[1]),
            array("label"=> $yra[2], "y"=> $b[2]),
            array("label"=> $yra[3], "y"=> $b[3]),
            array("label"=> $yra[4], "y"=> $b[4]),
            array("label"=> $yra[5], "y"=> $b[5]),
            array("label"=> $yra[6], "y"=> $b[6]),
            array("label"=> $yra[7], "y"=> $b[7]),
            array("label"=> $yra[8], "y"=> $b[8]),
            array("label"=> $yra[9], "y"=> $b[9]),
            array("label"=> $yra[10], "y"=> $b[10]),
            array("label"=> $yra[11], "y"=> $b[11]),
            array("label"=> $yra[12], "y"=> $b[12]),
            array("label"=> $yra[13], "y"=> $b[13]),
            array("label"=> $yra[14], "y"=> $b[14]),
            array("label"=> $yra[15], "y"=> $b[15]),
            array("label"=> $yra[16], "y"=> $b[16]),
            array("label"=> $yra[17], "y"=> $b[17])
        
            
        );
         $dataPoints3 = array(
             array("label"=> $yra[0], "y"=> $c[0]),
            array("label"=> $yra[1], "y"=> $c[1]),
            array("label"=> $yra[2], "y"=> $c[2]),
            array("label"=> $yra[3], "y"=> $c[3]),
            array("label"=> $yra[4], "y"=> $c[4]),
            array("label"=> $yra[5], "y"=> $c[5]),
            array("label"=> $yra[6], "y"=> $c[6]),
            array("label"=> $yra[7], "y"=> $c[7]),
            array("label"=> $yra[8], "y"=> $c[8]),
            array("label"=> $yra[9], "y"=> $c[9]),
            array("label"=> $yra[10], "y"=> $c[10]),
            array("label"=> $yra[11], "y"=> $c[11]),
            array("label"=> $yra[12], "y"=> $c[12]),
            array("label"=> $yra[13], "y"=> $c[13]),
            array("label"=> $yra[14], "y"=> $c[14]),
            array("label"=> $yra[15], "y"=> $c[15]),
            array("label"=> $yra[16], "y"=> $c[16]),
            array("label"=> $yra[17], "y"=> $c[17])
        
            
        );
         $dataPoints4 = array(
             array("label"=> $yra[0], "y"=> $f[0]),
            array("label"=> $yra[1], "y"=> $f[1]),
            array("label"=> $yra[2], "y"=> $f[2]),
            array("label"=> $yra[3], "y"=> $f[3]),
            array("label"=> $yra[4], "y"=> $f[4]),
            array("label"=> $yra[5], "y"=> $f[5]),
            array("label"=> $yra[6], "y"=> $f[6]),
            array("label"=> $yra[7], "y"=> $f[7]),
            array("label"=> $yra[8], "y"=> $f[8]),
            array("label"=> $yra[9], "y"=> $f[9]),
            array("label"=> $yra[10], "y"=> $f[10]),
            array("label"=> $yra[11], "y"=> $f[11]),
            array("label"=> $yra[12], "y"=> $f[12]),
            array("label"=> $yra[13], "y"=> $f[13]),
            array("label"=> $yra[14], "y"=> $f[14]),
            array("label"=> $yra[15], "y"=> $f[15]),
            array("label"=> $yra[16], "y"=> $f[16]),
            array("label"=> $yra[17], "y"=> $f[17])
        
            
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
		name: "A pass",
		indexLabel: "{y}",
		yValueFormatString: "#0.##",
		showInLegend: true,
		dataPoints: <?php echo json_encode($dataPoints1, JSON_NUMERIC_CHECK); ?>
	},{
		type: "column",
		name: "B pass",
		indexLabel: "{y}",
		yValueFormatString: "#0.##",
		showInLegend: true,
		dataPoints: <?php echo json_encode($dataPoints2, JSON_NUMERIC_CHECK); ?>
	},{
		type: "column",
		name: "C pass",
		indexLabel: "{y}",
		yValueFormatString: "#0.##",
		showInLegend: true,
		dataPoints: <?php echo json_encode($dataPoints3, JSON_NUMERIC_CHECK); ?>
	},{
		type: "column",
		name: "F pass",
		indexLabel: "{y}",
		yValueFormatString: "#0.##",
		showInLegend: true,
		dataPoints: <?php echo json_encode($dataPoints4, JSON_NUMERIC_CHECK); ?>
	}]
            });
            chart.render();

            }
</script>
        
        <div id="chartContainer" style="height: 550px; width: 100%;"></div>
        <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
    </body>
</html>