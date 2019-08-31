var xhr = new XMLHttpRequest();

window.onload=function()
{
	document.getElementById("btnSuma").onclick = inicializa;
}

function inicializa()
{
	//alert("Testitu Nombre");
	var valorTextboxNumero1 = document.getElementById("txtNumero1").value;
	var valorTextboxNumero2 = document.getElementById("txtNumero2").value;
	console.log("Estamos en inicializa y el valor del txtNumero1 es:"+valorTextboxNumero1);
	console.log("Estamos en inicializa y el valor del txtNumero2 es:"+valorTextboxNumero2);
	var parametros = "txtNumero1="+valorTextboxNumero1+"&txtNumero2="+valorTextboxNumero2;
	xhr.open("POST","Numeros",true);
	xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhr.onreadystatechange=funcionCallBack;
	console.log("Regresamos de la funcioncallBack");
	//xhr.setRequestHeader("Content-Type", "text/html; charset=utf-8");
	//xhr.setRequestHeader("Accept", "text/html");
	xhr.send(parametros);
		
}

function funcionCallBack()
{
	console.log("Estamos en funcionCallBack");
	if(xhr.readyState==4 && xhr.status==200)
	{
		console.log("Estamos dentro del if(xhr.readyState)");
		//alert("Ya se recibió respuesta del servidor");
		//xhr.overrideMimeType("charset=UTF-8");
		
		document.getElementById("divResultado").innerHTML = xhr.responseText;
	}
}