# Faça um programa que jogue par ou ímpar com o computador. 
# O jogo só será interrompido quando o jogador PERDER, 
# mostrando o total de vitórias consecutivas que ele conquistou no final do jogo.

from random import randint

print('-='*20)
print('VAMOS JOGAR PAR OU ÍMPAR')
print('-='*20)
vence = 0

while True:
    jog = int(input('Digite um valor: '))
    pi = ' '
    while pi not in 'PI':
        pi = str(input('Par ou Ímpar? [P/I] ')).upper().strip()[0]
    
    comp = randint(0,10)
    print('-'*20)
    tst = jog + comp
    
    print(f'Você jogou {jog} e o computador {comp}. Total de {tst} DEU ', end='')
    if tst % 2 == 0:
        print('PAR!')
        v = 'P'
    else:
        print('ÍMPAR!')
        v = 'I'
    print('-'*20)
    if pi == v:
        print('Você VENCEU!')
        print('Vamos jogar novamente...')
        vence += 1
    else:
        print('Você PERDEU!')
        break
    print('-='*20)
print(f'GAME OVER! Você venceu {vence} vezes')
