$(document).ready(function () {
    $("#login").click(function () {
        var username = $('#username').val();
        var password = $('#password').val();

        if (username == "") {
            alert('Taper votre username !!!');
        }
        else if (password == "") {
            alert('Taper votre password !!!');
        } else {
            alert(username + " - " + password);
            $.ajax({
                url: "LoginController",
                data: {op: "log", username: username, password: password},
                type: 'POST',
                success: function (data, textStatus, jqXHR) {
                    if (data === "1") {
                        window.location.replace("index.jsp");
                    }
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(textStatus);
                }
            });
        }
    });
});
