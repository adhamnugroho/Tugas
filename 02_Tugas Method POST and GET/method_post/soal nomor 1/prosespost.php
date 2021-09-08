<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Soal Nomor 1_Method Post</title>
</head>
<body>
	
	<?php
	
		// deklarasi variabel
		$saldo_awal = $_POST['saldo_awal'];
		$saldo_setelah_12_bulan;

		
		// Operasi aritmatika
		$saldo_setelah_12_bulan = $saldo_awal / ((2.5 * 100) * 12);

		
		// Output
		echo "Jumlah saldo akhir nasabah setelah 12 bulan: $saldo_setelah_12_bulan";
	?>

</body>
</html>