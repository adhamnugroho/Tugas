<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Soal Nomor 2_Method POST</title>
</head>
<body>
	
	<?php

		// Deklarasi variabel
		$uang_yang_akan_diambil_ibu = $_POST['uang_yang_akan_diambil_ibu'];
		$modulus;
		$seratus_ribu; 
		$lima_puluh_ribu; 
		$dua_puluh_ribu; 
		$lima_ribu; 
		$seratus; 
		$lima_puluh;

		
		echo "Uang yang akan diambil ibu: $uang_yang_akan_diambil_ibu <br><br>";


		// Operasi Aritmatika + Output
		
		// Rp100.000
		$modulus = $uang_yang_akan_diambil_ibu % 100000;
		$seratus_ribu = ($uang_yang_akan_diambil_ibu - $modulus) / 100000;
		$uang_yang_akan_diambil_ibu = $uang_yang_akan_diambil_ibu - ($seratus_ribu * 100000);

		echo "Jumlah uang Rp100.000: $seratus_ribu lembar<br>";


		// 50.000
		$modulus = $uang_yang_akan_diambil_ibu % 50000;
		$lima_puluh_ribu = ($uang_yang_akan_diambil_ibu - $modulus) / 50000;
		$uang_yang_akan_diambil_ibu = $uang_yang_akan_diambil_ibu - ($lima_puluh_ribu * 50000);

		echo "Jumlah uang Rp50.000: $lima_puluh_ribu lembar<br>";


		// 20.000
		$modulus = $uang_yang_akan_diambil_ibu % 20000;
		$dua_puluh_ribu = ($uang_yang_akan_diambil_ibu - $modulus) / 20000;
		$uang_yang_akan_diambil_ibu = $uang_yang_akan_diambil_ibu - ($dua_puluh_ribu * 20000);

		echo "Jumlah uang Rp20.000: $dua_puluh_ribu lembar<br>";


		// 5000
		$modulus = $uang_yang_akan_diambil_ibu % 5000;
		$lima_ribu = ($uang_yang_akan_diambil_ibu - $modulus) / 5000;
		$uang_yang_akan_diambil_ibu = $uang_yang_akan_diambil_ibu - ($lima_ribu * 5000);

		echo "Jumlah uang Rp5.000: $lima_ribu lembar<br>";


		// 100
		$modulus = $uang_yang_akan_diambil_ibu % 100;
		$seratus = ($uang_yang_akan_diambil_ibu - $modulus) / 100;
		$uang_yang_akan_diambil_ibu = $uang_yang_akan_diambil_ibu -($seratus * 100);

		echo "Jumlah uang Rp100: $seratus lembar<br>";


		// 50
		$modulus = $uang_yang_akan_diambil_ibu % 50;
		$lima_puluh = ($uang_yang_akan_diambil_ibu - $modulus) / 50;
		$uang_yang_akan_diambil_ibu = $uang_yang_akan_diambil_ibu - ($lima_puluh * 50);

		echo "Jumlah uamg Rp50: $lima_puluh  lembar<br>";
	?>

</body>
</html>