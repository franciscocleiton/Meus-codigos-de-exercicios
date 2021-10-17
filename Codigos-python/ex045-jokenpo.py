from random import randint
from time import sleep

itens = ('Pedra', 'Papel', 'Tesoura')
computador = randint(0, 2)

print('''Escolha:
[0] Pedra
[1] Papel
[2] Tesoura''')
jogador = int(input('Qual é a sua jogada? '))

print('JO')
sleep(1)
print('KEN')
sleep(1)
print('PÔ!!!')
sleep(1)

print('-=' * 11)
print('O computador jogou {}'.format(itens[computador]))
print('Você escolheu {}'.format(itens[jogador]))
print('-=' * 11)

if computador == 0:
    if jogador == 0:
        print('EMPATE\n')
    elif jogador == 1:
        print('JOGADOR VENCE\n')
    elif jogador == 2:
        print('COMPUTADOR VENCE\n')
    else:
        print('JOGADA INVÁLIDA!\n')
elif computador == 1:
    if jogador == 0:
        print('COMPUTADOR VENCE\n')
    elif jogador == 1:
        print('EMPATE\n')
    elif jogador == 2:
        print('JOGADOR VENCE\n')
    else:
        print('JOGADA INVÁLIDA!\n')
elif computador == 2:
    if jogador == 0:
        print('JOGADOR VENCE\n')
    elif jogador == 1:
        print('COMPUTADOR VENCE\n')
    elif jogador == 2:
        print('EMPATE\n')
    else:
        print('JOGADA INVÁLIDA!\n')
