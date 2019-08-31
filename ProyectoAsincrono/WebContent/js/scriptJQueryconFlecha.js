//alert("Testitu con flecha");
$(document).ready(
		()=>
		{
			$("#btnNombre").click(inicializa);
		}
);

function inicializa()
{
	var txtValor=$("#txtNombre").val();
	alert("Testitu con flecha:"+txtValor);
}