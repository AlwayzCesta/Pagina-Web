var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {

    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });
    $("#car").attr("href","carrito.html?username=" + username);
    $("#log").attr("href","user.html?username=" + username);
    $("#E60U").attr("href","teclados60User.html?username=" + username);
    $("#E80U").attr("href","teclados80User.html?username=" + username);
    $("#E98U").attr("href","teclados98User.html?username=" + username);
    $("#per").attr("href","profileEdit.html?username=" + username);
    
    getUsuario().then(function () {
        
        $("#mi-perfil-btn").attr("href","user.html?username=" + username);
        $("#user-saldo").html(user.username);
    });
});

async function getUsuario() {

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

function comprar(idProducto) {
    
    

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletComprar",
        data: $.param({
            idProducto: idProducto,
            username: user.username,
            

        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            
        }
    });
}
