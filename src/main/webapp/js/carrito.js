var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {
    fillUsuario().then(function () {
        $("#user-saldo").html(user.username);
        getProducto(user.username);
    });

    $("#car").attr("href","carrito.html?username=" + username);
    $("#log").attr("href","user.html?username=" + username);
    $("#E60U").attr("href","teclados60User.html?username=" + username);
    $("#E80U").attr("href","teclados80User.html?username=" + username);
    $("#E98U").attr("href","teclados98User.html?username=" + username);
    $("#per").attr("href","profileEdit.html?username=" + username);
    





});
async function fillUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username: username
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;
            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });

}
function getProducto(username) {

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletProductoListar",
        data: $.param({
            username:username,
            
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                mostrarcarrito(parsedResult);
            } else {
                console.log("Error recuperando los datos de las peliculas");
            }
        }
    });
}

function mostrarcarrito(username) {
    let contenido = "";
    if (username.length >= 1) {
        $.each(username, function (index, Producto) {
            Producto = JSON.parse(Producto);

            contenido += '<tr><th scope="row">' + Producto.idProducto + '</th>' +
                    '<td>' + Producto.referencia + '</td>' +
                    '<td>' + Producto.nombreProducto + '</td>' +
                    '<td>' + Producto.categoria + '</td>' +
                    '<td>' + Producto.precio + '</td></tr>';

        });
        $("#historial-tbody").html(contenido);
        $("#historial-table").removeClass("d-none");
        $("#historial-vacio").addClass("d-none");

    } else {
        $("#historial-vacio").removeClass("d-none");
        $("#historial-table").addClass("d-none");
    }
}
function pagar() {
    
    

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletPagar",
        data: $.param({
           
            username: user.username,
            

        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            
        }
    });
    location.reload();
}