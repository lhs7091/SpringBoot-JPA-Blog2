function save() {

    let data = {
        username: document.getElementById("newusername").value,
        password: document.getElementById("newpassword").value,
        email: document.getElementById("newemail").value
    };

    $.ajax({
        type: "POST",
        url: "/auth/signupProc",
        data: JSON.stringify(data),
        contentType: "application/json; charset=utf-8",
        dataType: "json"
    }).done(function(resp){
        alert("Sign Up Success");
        location.href="/";
    }).fail(function(error){
        alert(JSON.stringify(error));
    });

}

