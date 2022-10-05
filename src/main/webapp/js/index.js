$(document).ready(function () {

    $("#form-login").submit(function (event) {
        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });
    $("#form-modificar").on("submit", function (event) {

        event.preventDefault();
        modificarUsuario();
    });


});

function autenticarUsuario() {

    let username = $("#usuario").val();
    let contrasena = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            username: username,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let username = parsedResult['username'];
                document.location.href = "user.html?username=" + username;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}

function registrarUsuario() {


    
    let nombres = $("#input-nombres").val();
    let apellidos = $("#input-apellidos").val();
    let direccion = $("#input-direccion").val();
    let telefono = $("#input-telefono").val();
    let email = $("#input-email").val();
    let username = $("#input-username").val();
    let contrasena = $("#input-contrasena").val();
    let contrasenaConfirm = $("#input-confirm-contrasena").val();
    
    

    if (contrasena == contrasenaConfirm) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                nombres:nombres,
                apellidos:apellidos,
                direccion:direccion,
                telefono:telefono,
                email:email,
                username:username,
                contrasena:contrasena
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let username = parsedResult['username'];
                    document.location.href = "user.html?username=" + username;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Username already exists");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Passwords do not match");
    }
}

function modificarUsuario() {

    let direccion = $("#input-direccion").val();
    let telefono = $("#input-telefono").val();
    let email = $("#input-email").val();
    let username = $("#input-username").val();
    let contrasena = $("#input-contrasena").val();
   
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioModificar",
        data: $.param({
            username: username,
            contrasena: contrasena,
            email: email,
            direccion:direccion,
            telefono:telefono,
        }),
        success: function (result) {

            if (result != false) {
                $("#modificar-error").addClass("d-none");
                $("#modificar-exito").removeClass("d-none");
            } else {
                $("#modificar-error").removeClass("d-none");
                $("#modificar-exito").addClass("d-none");
            }

            setTimeout(function () {
                location.reload();
            }, 3000);

        }
    });

}