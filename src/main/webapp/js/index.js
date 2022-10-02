$(document).ready(function () {

    $("#form-login").submit(function (event) {
        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
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
                document.location.href = "home.html?username=" + username;
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
                    document.location.href = "home.html?username=" + username;
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
