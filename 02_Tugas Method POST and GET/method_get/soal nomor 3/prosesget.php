<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Soal Nomor 3_Method GET</title>
</head>
<body>

	<!-- PHP -->
	<?php

		// Deklarasi variabel
		$r = $_GET['jari_jari'];
		$phi = 3.14;
		$L_lingkaran;
		$k_lingkaran;


		// Rumus Luas Lingkaran
		$L_lingkaran = $phi * $r * $r;


		// Rumus Keliling Lingkaran
		$k_lingkaran = 2 * $phi * $r;


		// Output
		echo "Luas Lingkaran: $L_lingkaran <br><br>";
		echo "Keliling Lingkaran: $k_lingkaran <br>";
	?>

</body>
</html>