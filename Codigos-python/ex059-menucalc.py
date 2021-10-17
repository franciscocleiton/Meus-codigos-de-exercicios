#Crie um programa que leia dois valores e mostre um menu na tela

from time import sleep
n1 = int(input('Digite o 1° número: '))
n2 = int(input('Digite o 2° número: '))
opcao = 0
while opcao != 5:
    print('\n--------MENU--------')
    print('[1] - Somar')
    print('[2] - Multiplicar')
    print('[3] - Maior')
    print('[4] - Novos números')
    print('[5] - Sair')
    opcao = int(input('Digite sua opção: '))

    if opcao == 1:
        soma = n1 + n2
        print('{} + {} = {}\n'.format(n1, n2, soma))
    
    elif opcao == 2:
        multiplicar = n1 * n2
        print('{} x {} = {}\n'.format(n1, n2, multiplicar))
    
    elif opcao == 3:
        if n1 > n2:
            print('{} é maior\n'.format(n1))
        elif n2 > n1:
            print('{} é maior\n'.format(n2))
        else:
            print('Os números são iguais\n')
    
    elif opcao == 4:
        n1 = int(input('Digite o 1° número: '))
        n2 = int(input('Digite o 2° número: '))
    
    elif opcao == 5:
        print('Até a próxima\n')
    
    else:
        print('Opção inválida!')
    
    sleep(2)
