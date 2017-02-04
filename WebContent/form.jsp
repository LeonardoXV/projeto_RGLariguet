<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
  <head>
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="libs/materialize/css/materialize.min.css"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>
  <body>
    <div class="row">
      <div class="col s12 m8 l4 offset-m2 offset-l4 form-section ">
        <div class="card z-depth-4">
          <div class="card-content">
            <span class="card-title">Cadastro de Livros</span>

            <div class="row">
              <form class="col s12" action="Controle" method="post" name="formulario">
                <div class="row">
                  <div class="input-field col s12 m6">
                    <i class="material-icons prefix">book</i>
                    <input id="icon_prefix" type="text" class="validate" name="nome" id="nome">
                    <label for="icon_prefix">Titulo do Livro</label>
                  </div>
                  <div class="input-field col xs12 s12 m6">
                    <i class="material-icons prefix">bookmark_border</i>
                    <input id="icon_telephone" type="text" class="validate" name="numero" onkeyup="onlyNumber(this)" >
                    <label for="icon_telephone">Número de paginas</label>
                  </div>
                </div>

                <div class="row">

                  <div class="input-field col s12">
                    <select name="categoria">
                      <option value="" disabled selected>Categoria</option>
                      <option value="Técnico">Técnico</option>
                      <option value="Romance">Romance</option>
                      <option value="Ficção">Ficção</option>
                      <option value="Drama">Drama</option>
                    </select>
                    <label>Categoria do Livro</label>
                  </div>

                </div>
                <center>
                <div class="row">
                	<div class="card-action col m4 offset-m4">
              			<input type="submit" class="waves-effect waves-light btn"" value="Cadastrar" name="btnCadastrar" onclick="return validar()" style="width: 150px;">
              			<input type="submit" class="waves-effect waves-light btn" value="Listar" name="btnListarClientes" style="width: 150px;margin-top: 6px;">
            		</div>
                </div>
              </form>

            </div>


          </div>


        </div>
      </div>
    </div>
    <script type="text/javascript" src="libs/jquery/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="libs/materialize/js/materialize.min.js"></script>
    <script type="text/javascript" src="js/form.js"></script>
    <script type="text/javascript" src="js/validacoes.js"></script>
  </body>
</html>
