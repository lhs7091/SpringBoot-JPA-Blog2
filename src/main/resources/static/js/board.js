function save() {

    let data = {
        title: document.getElementById("title").value,
        content: document.getElementById("content").value
    };

    $.ajax({
        type: "POST",
        url: "/api/board",
        data: JSON.stringify(data),
        contentType: "application/json; charset=utf-8",
        dataType: "json"
    }).done(function(resp){
        alert("Writed board Successfully");
        location.href="/home";
    }).fail(function(error){
        alert(JSON.stringify(error));
    });

}