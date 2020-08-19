function save() {

    let data = {
        username: document.getElementById("username").value,
        password: document.getElementById("password").value,
        email: document.getElementById("email").value
    };

    $.ajax({
        type: "POST",
        url: "/api/user",
        data: JSON.stringify(data),
        contentType: "application/json; charset=utf-8",
        dataType: "json"
    }).done(function(resp){
        alert("Sign Up Success");
        console.log(resp)
        //location.href="/";
    }).fail(function(){
        alert(JSON.stringify(error));
    });

}
