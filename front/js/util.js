function buscarContas() {
    let url = `http://localhost:8080/contas/` 

    fetch(url)
    .then(res => res.json())
    .then(res => montarTabela(res))
}


function montarTabela(lista) {
    let tabela = `<table class='table table-bordered'> 
    <tr> 
        <th>id</th>
        <th>titular</th>
        <th>email</th>
        <th>numero</th>
        <th>agencia</th>
        <th>saldo</th>
        <th>Tipo de Conta</th> 
    </tr>`

    for(i=0; i < lista.length ; i++) {
        tabela += `<tr> 
                    <td>${lista[i].id}</td> 
                    <td>${lista[i].titular}</td> 
                    <td>${lista[i].email}</td> 
                    <td>${lista[i].numero}</td> 
                    <td>${lista[i].agencia}</td> 
                    <td>${lista[i].saldo}</td> 
                    <td>${lista[i].tipoDeConta}</td> 
                </tr>`
    }

    tabela += "</table>"
    document.getElementById("tabela").innerHTML = tabela
}
