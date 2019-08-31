var xhr = new XMLHttpRequest();

window.onload=function()
{
	document.getElementById("btnNombre").onclick = inicializa;
}

function inicializa()
{
	//alert("Testitu Nombre");
	var valorTextboxNombre = document.getElementById("txtNombre").value;
	console.log("Estamos en inicializa y el valor del textbox es:"+valorTextboxNombre);
	xhr.open("GET","DatosPersonalesServlet?txtNombre="+valorTextboxNombre,true);
	xhr.onreadystatechange=funcionCallBack;
	console.log("Regresamos de la funcioncallBack")
	xhr.send();
		
}

function funcionCallBack()
{
	console.log("Estamos en funcionCallBack");
	if(xhr.readyState==4 && xhr.status==200)
	{
		console.log("Estamos dentro del if(xhr.readyState)");
		alert("Ya se recibió respuesta del servidor");
		document.getElementById("divResultado").innerHTML += xhr.responseText;
	}
}