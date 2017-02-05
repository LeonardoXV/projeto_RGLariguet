function onlyNumber(num){
      var er = /[^0-9.]/;
       er.lastIndex = 0;
       var campo = num;
       if (er.test(campo.value)) {
         campo.value = "";
       }

}

function validar(nome){
  if(document.formulario.nome.value != "" && document.formulario.numero.value != ""  && document.formulario.categoria.value != ""){
    return true;
  }
  else{
    alert("Preencha todos os campos e selecione uma categoria!");
    return false;
  }
}
