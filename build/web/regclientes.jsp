
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&amp;display=swap" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/style.css">
	<meta charset="utf-8">
        <title>Registro Clientes</title>
    </head>
    <body>
        <%@include file="layout/header.html"%>
        
        <section class="regcliente">
            <article class="regcliente__content">
                <figure class="regcliente__fig">
                    <img class="regcliente__fig--img" src="img/regcliente.jpg">
                </figure>
                <div class="form">
                    <form class="form__content">
                        <h1>Registrar propietarios </h1>
                        <div class="form__div">
                            <input class="form__div--input" id="cedula" type="number" name="cedula" required>
                            <span class="form__div--span">Cédula</span>
                        </div>
                        <div class="form__div">
                            <input class="form__div--input" id="nombre" type="text" name="nombre" required>
                            <span class="form__div--span">Nombre</span>
                        </div>
                        <div class="form__div">
                            <input class="form__div--input" id="direccion" type="text" name="direccion" required>
                            <span class="form__div--span">Dirección</span>
                        </div>
                        <div class="form__div">
                            <input class="form__div--input" id="telefono" type="number" name="telefono" required>
                            <span class="form__div--span">Teléfono</span>
                        </div>
                        
                        <div class="form__div">
                            <input class="form__div--input" id="edad" type="number" name="edad" required>
                            <span class="form__div--span">Edad</span>
                        </div>
                        
                        <select clasS="" name="estadocivil" id="estadocivil">
                            <option value="soltero">Soltero</option>
                            <option value="comprometido">Comprometido</option>
                            <option value="divorciado">Divorciado</option>
                            <option value="viudo">Viudo</option>                            
                        </select>
                        
                        <button class="form-btn" type="button">Registrar</button>
                        
                    </form>
                </div>
            </article>
        </section>
        
        <%@include file="layout/footer.html"%>
    </body>
</html>

