# Faça um programa que mostre a tabuada de vários números, 
# onde cada vez, para cada valor digitado pelo usuário. 
# O programa será interrompido quando o número solicitado for negativo.

while True:
    tab = int(input('Quer ver a tabuada de qual valor? '))
    if tab < 0:
        print('PROGRAMA TABUADA ENCERRADO, Volte Sempre!\n')
        break;
    else:
        print('-'*15)
        for cont in range(1, 11):
            print('{} x {:2} = {}'.format(tab, cont, tab*cont))
        print('-'*15)
