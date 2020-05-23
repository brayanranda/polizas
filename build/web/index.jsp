<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&amp;display=swap" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/style.css">
	<meta charset="utf-8">
	<title>Poliza de Seguros</title>
</head>
<body>
<%@include file="layout/header.html"%>

<section class="banner">
    <div class="banner--text">
        <h1 class="banner--h1">Polizas de Seguros</h1>
        <p class="banner--p">Nos preocupamos por tu bienestar</p>
    </div>
    <figure class="banner__fig">
        <img class="banner__fig--img" src="img/banner.jpg">
    </figure>
</section>

<section class="info-index">
	<article class="info-index__content">
            <figure class="info-index__fig">
                <img class="info-index__fig--img" src="img/imgindex.jpg">
            </figure>
            <div class="info-index__texto">
                <h1> Nuestro Objetivo </h1>
                <p class="info-index__texto--p">
                    Es ofrecer 
                    productos que permitan a padres de familia, 
                    contratistas, comerciantes, industriales y 
                    en general a todas las personas naturales y 
                    jurídicas del sector privado y público, la 
                    protección de tu Automóvil.
                </p>
            </div>
	</article>
</section>

<%@include file="layout/footer.html"%>
</body>
</html>