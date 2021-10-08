from datetime import date

maioridade = 0
menoridade = 0
atual = date.today().year

for cont in range(0, 7):
    nasc = int(input('Digite a data de nascimento da {}° pessoa: '.format(cont + 1)))
    idade = atual - nasc
    if idade >= 21:
        maioridade = maioridade + 1
    else:
        menoridade = menoridade + 1

print('{} pessoas são maiores e {} são menores!\n'.format(maioridade, menoridade))
