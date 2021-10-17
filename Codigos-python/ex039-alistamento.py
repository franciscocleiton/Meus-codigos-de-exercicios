from datetime import date
atual = date.today().year
ano = int(input('Digite seu ano de nascimento: '))

#condições para alistamento
alista = atual - ano
if alista < 18:
    print('Você ainda irá se alistar')
    comp = 18 - alista
    if comp == 1:
        print(' E já se prepata que falta apenas um ano!\n')
    else:
        print('E faltam {} anos!\n'.format(comp))
elif alista == 18:
    print('Já está na hora de se alistar, corra para não pagar multa!\n')
else:
    print("Olha já passou do tempo, você precisa se alistar urgentemente!")
    comp = alista - 18
    if comp == 1:
        print('E já se passou um ano\n!')
    else:
        print('E já se passaram {} anos!\n'.format(comp))
    