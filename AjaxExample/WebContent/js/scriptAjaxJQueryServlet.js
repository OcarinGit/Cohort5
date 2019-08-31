/**
 * La diferencia la explica claramente jQuery en su documentación en inglés. Lamentablemente hay poca documentación de dicha librería en castellano:

    A page can't be manipulated safely until the document is "ready." jQuery detects this state of readiness for you. Code included inside $( document ).ready() will only run once the page Document Object Model (DOM) is ready for JavaScript code to execute. Code included inside $( window ).on( "load", function() { ... }) will run once the entire page (images or iframes), not just the DOM, is ready.
    Una página puede ser manipulada sin riesgo de errores solamente cuando el documento está listo. jQuery se encarga de detectar dicho estado en nuestro lugar. El código incluido dentro de $( document ).ready() se ejecutará solamente cuando el modelo de objeto de documento (DOM) esté listo para ejecutar código Javascript. Por su parte, el código incluido después de $( window ).on( "load", function() { ... }) se ejecutará solamente cuando la página entera (imágenes o iframes), no solamente el DOM, esté lista.

    Fuente: jQuery learning center. -La traducción al castellano es propia.

Está claro, la diferencia viene indicada en el mismo nombre de cada método:

    document: cuando esté listo sólo el documento, podríamos decir, la parte HTML.

    window: cuando está lista toda la ventana, el documento y todo lo demás.

▸ window.onload()

El evento onload, cuya abreviatura es load se dispara al final del proceso de carga del documento. Es decir, cuando todos los objetos del DOM (imágenes, flash, scripts, frames) han terminado de cargarse. Una excepción son las hojas de estilo, que no siempre están cargadas al momento de lanzarse este evento.
▸ $(document).ready()

jQuery document.ready se ejecuta cuando todo el contenido HTML está listo, pero antes de las imágenes y otros recursos. En los navegadores modernos, es reemplazado por DOMContentLoaded.

Nota importante:

A partir de jQuery 3.0, $(document).ready() pasa al estado Deprecated, aunque seguirá funcionando, la misma desaparecerá del core de jQuery en la próxima versión de la librería (la versión 4).

La Guía de actualización de jQuery 3 (en inglés, esperando tener algún día esta documentación en castellano), explica lo siguiente al respecto:

    Deprecated: document-ready handlers other than jQuery(function)

    Due to historical compatibility issues there are a multitude of ways to set a document ready handler. All of the following are equivalent and call the function fn when the document is ready:

        $(fn);
        $().ready(fn);
        $(document).ready(fn);
        $("selector").ready(fn);

    As of jQuery 3.0 the recommended way to add a ready handler is the first method, $(fn). As noted in the Event section, the $(document).on("ready", fn) event form has slightly different semantics and was removed in jQuery 3.0.

    Debido a problemas históricos de compatibilidad existen varias formas de configurar el manejador de documentos. Todas las maneras siguientes (ver arriba) son equivalentes, y ejecutan la función fn cuando el documento está listo. A partir de jQuery 3.0 la forma recomendada de usar el manejador de documento listo es el primer método: $(fn); Como se indicó en la sección Evento, la forma $(document).on("ready", fn) tiene una semántica ligeramente diferente y se eliminó en jQuery 3.0. Es decir, en cuanto empecemos a usar jQuery 3.0, lo mejor es dejar de usar nuestro tradicional $(document).ready(fn); y sustituirlo por $(fn);. También los métodos $().ready(fn); y $("selector").ready(fn);, hemos de sustituirlos simplemente por $(fn);, ya que jQuery 3 ha corregido los problemas de compatibilidad entre navegadores que obligaban a usar las 4 diferentes formas citadas más arriba para invocar una función llamada a hacer lo mismo.

    Bastará sólo esto para verificar que el DOM está listo:

      $(function() 
      {
        console.log( "Ha ocurrido document.ready: documento listo" );
      });

    Fuente: Guía de actualización de jQuery 3.

Nota: Existe un plugin para migrar nuestro código de librerías anteriores a jQuery 3, para más información, dejo aquí el enlace.
En resumen

Si vamos a trabajar con los elementos que componen la web (divs, inputs, …) usaremos $(document).ready(). Pero, si por el contrario, vamos a trabajar con imágenes para alinearlas o comprobar sus dimensiones tendremos que usar $(window).load().

Es un error muy extendido usar $(window).load() cuando vamos a trabajar solo con elementos del DOM, o usar $(document).ready() cuando vamos a trabajar con elementos que no estarán cargados al momento de ejecutarse dicha función.
 					
 					
 					
 					
 					Código de prueba

Veamos lo que ocurre en este fragmento de código en el cual se cargan por una parte los elementos del DOM y por otra parte un iframe de YouTube. Aunque sea mínima, verán la diferencia en el tiempo de carga en la consola.

Utilizaré la librería de jQuery 3 y $(function() {... en vez de $( document ).ready(function() {

Y de paso, si les gusta el flamenco no dejen de escuchar una de las canciones más bonitas de este género :)

<html>
<head>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script>
//        $( document ).ready(function() {
      $(function() {

        console.log( "Ha ocurrido document.ready: documento listo" );
    });
 
    $( window ).on( "load", function() {
        console.log( "Ha ocurrido window.load: ventana lista" );
    });
    </script>
</head>
<body>
    <p>Esto es un elemento p del DOM. Luego viene una ventana (iframe)</p>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/NvVpAxQuBg4" frameborder="0" allowfullscreen></iframe>
</body>
</html>
 */

//Las funciones flecha solo funcionan desde firefox. No funcionan desde el visualizador de eclipse
/*$(document).ready(()=>
{
	alert("Testitu Ajax, JQuery y Servlet y Funciones Flecha");
	}
);*/

$(document).ready(inicioPrograma);

function inicioPrograma()
{
	alert("Testituuuu Ajax, JQuery y Servlet");
}