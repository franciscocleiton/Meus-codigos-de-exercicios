'''Melhore o jogo des 028 onde o cumputador vai "pensar" em um número entre 0 e 10.
Só que agora o jogador vai tentar adivinhar até acertar, mostrando no final quantos
palpites foram necessários para vencer'''

from random import randint

n = randint(0, 10)
jog = 0
contador = 0

print('Sou seu computador, acabei de pensar num número de 0 a 10, tente acertar')
while jog == 0:
    num = int(input('Digite um número: '))
    if num == n:
        contador += 1
        jog = 1
    else:
        if num < n:
            print('Mais... Tente novamente!')
        if num > n:
            print('Menor... Tente novamente!')
        contador += 1

print('Você acertou!!! \nO número escolhido pelo computador foi {} \nE você precisou de {} jogadas para acertar!\n'.format(n, contador))
