fetch('contas.json')
    .then(function(response) {
        return response.json();
    })
    .then(function(data) {
        appendData(data);
    })
    .catch(function(err) {
        console.log('error: ' + err);
    });

function appendData(data) {
    var mainContainer = document.getElementById("myData");

    for (var i = 0; i < data.length; i++) {
        var div = document.createElement("div");

        div.innerHTML = '<br>' + ('id: ' + data[i].id) + '<br>' + ('titular: ' + data[i].titular) + '<br>' + ('email: ' + data[i].email) + '<br>' + ('numero: ' + data[i].numero) + '<br>' + ('agencia: ' + data[i].agencia) + '<br>' + ('saldo: ' + data[i].saldo) + '<br>' + ('tipoDeConta: ' + data[i].tipoDeConta);

        mainContainer.appendChild(div);
    }
}