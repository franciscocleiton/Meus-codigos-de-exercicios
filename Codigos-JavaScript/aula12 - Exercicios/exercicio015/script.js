function verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var fano = document.getElementById('txtano')
    var res = document.getElementById('res')
    if(fano.value.length == 0 || fano.value > ano) {
        window.alert('[ERRO] Verifique os dados e tente novamente!')
    } else{
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')
        if (fsex[0].checked) {
            genero = 'Homem'
            if (idade >= 0 && idade < 10) {
                //criança
                img.setAttribute('src', 'bebemasc.png')
            } else if (idade >= 10 && idade < 21) {
                //jovem
                img.setAttribute('src', 'jovemmasc.png')
            } else if (idade >= 21 && idade < 50) {
                //adulto
                img.setAttribute('src', 'adultomas.png')
            } else {
                //idoso
                img.setAttribute('src', 'idosomasc.png')
            }
        }
        else {
            genero = 'Mulher'
            if (idade >= 0 && idade < 10) {
                //criança
                img.setAttribute('src', 'bebefem.png')
            } else if (idade >= 10 && idade < 21) {
                //jovem
                img.setAttribute('src', 'jovemfem.png')
            } else if (idade >= 21 && idade <50) {
                //adulto
                img.setAttribute('src', 'adultofem.png')
            } else {
                //idoso
                img.setAttribute('src', 'idosofem.png')
            }
        }
        res.style.textAlign = 'center'
        res.innerHTML = `Detectamos ${genero} com ${idade} anos`
        res.appendChild(img)
    }
}