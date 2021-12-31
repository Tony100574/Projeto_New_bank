const getInfoBd = async() => {


    try {
        const dataJson = await fetch('contas.json')
        const data = await dataJson.json()

        appendData(data)

    } catch (error) {
        console.log(error + "Erro na requisição do servidor.")
    }

}


function appendData(data) {
    var mainContainer = document.getElementById("myData");

    for (var i = 0; i < data.length; i++) {
        var div = document.createElement("div");

        div.innerHTML = '<br>' + ('id: ' + data[i].id) + '<br>' + ('titular: ' + data[i].titular) + '<br>' + ('email: ' + data[i].email) + '<br>' + ('numero: ' + data[i].numero) + '<br>' + ('agencia: ' + data[i].agencia) + '<br>' + ('saldo: ' + data[i].saldo) + '<br>' + ('tipoDeConta: ' + data[i].tipoDeConta);

        mainContainer.appendChild(div);
    }
}


const showForId = async() => {

    try {
        const dataJson = await fetch('contas.json')
        const data = await dataJson.json()


        const idCliente = document.querySelector('[idCliente]').value
        const newData = Array.from(data)

        // isso é a msm coisa que o div.innerHTML da function acima!
        const infoCliente = newData.filter(cliente => cliente.id === parseInt(idCliente))[0] //.filter(info => info === 'agencia'))
        const { titular, agencia, saldo } = infoCliente
        const info2 = { titular, agencia, saldo }
        return console.log(info2) // document.querySelector('#myData2').innerHTML = info2

    } catch (error) {
        console.log(error + "Erro na pesquisa por ID.")


    }
}