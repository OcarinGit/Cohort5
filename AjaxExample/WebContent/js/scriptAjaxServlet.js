/**
 * Código de Ajax donde accedemos a un servlet
 */


//Se crea el objeto Ajax
var xhr = new XMLHttpRequest();

window.onload = function()
{
	//Mandamos una alerta para segurarnos que entra a la función onload
	alert("Testitu Solamente Ajax y Servlet");
	
	document.getElementById("btnLlamarServidorGET").onclick = llamarServidorGET;
	document.getElementById("btnLlamarServidorPOST").onclick = llamarServidorPOST;
	
}

function llamarServidorGET()
{
	alert("Llamando a Servidor por GET");

	
	xhr.responseType = "application/text";
	//Abrimos la dirección URL (AjaxServlet) mediante el método GET
	var nombre = document.getElementById("txtNombre").value;
	var numero1 = document.getElementById("txtNumero1").value;
	var numero2 = document.getElementById("txtNumero2").value;
	//xhr.open("GET", "AjaxServlet?txtNombre="+,true);
	xhr.open("GET", "AjaxServlet?txtNombre="+nombre+"&txtNumero1="+numero1+"&txtNumero2="+numero2,true);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del textbox nombre el valor:"+nombre);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del textbox numero1 el valor:"+numero1);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del textbox numero2 el valor:"+numero2);
	
	//Verificamos si el estado cambió
	xhr.onreadystatechange = estadoCambio;
	
	//Enviamos la petición
	xhr.send();
}

function llamarServidorPOST()
{
	alert("Llamando a Servidor por POST");

	
	//xhr.responseType = "application/json;charset=UTF-8";
	xhr.responseType = "json";
	//Abrimos la dirección URL (AjaxServlet) mediante el método GET
	var nombre = document.getElementById("txtNombre").value;
	var numero1 = document.getElementById("txtNumero1").value;
	var numero2 = document.getElementById("txtNumero2").value;
	var data = 
	{
			"txtNombre" : document.getElementById("txtNombre").value,
			txtNumero1 : numero1,
			txtNumero2 : numero2
	}
	
	var dataToSend= new FormData();
	dataToSend.append("txtNombre",nombre);
	dataToSend.append("txtNumero1",numero1);
	dataToSend.append("txtNumero2",numero2);
	
	var data3 = "AjaxServlet?txtNombre="+nombre+"&txtNumero1="+numero1+"&txtNumero2="+numero2;
	//xhr.open("GET", "AjaxServlet?txtNombre="+,true);
	xhr.open("POST", data3,true);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del textbox nombre el valor:"+nombre);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del textbox numero1 el valor:"+numero1);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del textbox numero2 el valor:"+numero2);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del data:"+data.txtNombre);
	console.log("Ya se ejecutó xhr.open y se llevó de valor del dataToSend:"+dataToSend.txtNombre);
	//Verificamos si el estado cambió
	xhr.onreadystatechange = estadoCambio;
	
	//Enviamos la petición
	xhr.send(dataToSend);
}

function estadoCambio()
{
	console.log("Ya entró a la función estadoCambio");
	if(xhr.readyState==4 && xhr.status==200)
	{
		console.log("Función Asíncrona ejecutada con éxito");
		var coches = xhr.response;
		console.log("Valor de coches:"+coches);
		console.log("Valor de coches:"+coches.CocheBarato);
		//document.getElementById("divResultadoAjax").innerHTML = xhr.responseText;
		document.getElementById("divCochesAjax").innerHTML = coches["CocheBarato"];
		document.getElementById("divSumaAjax").innerHTML = coches["suma"];
	}
	console.log("Ya salió de la función estadoCambio");
}