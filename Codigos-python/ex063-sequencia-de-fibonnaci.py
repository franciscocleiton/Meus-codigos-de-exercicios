# Escreva um programa que leia um número n inteiro qualquer e
# mostre na tela os n primeiros números de uma Sequência de Fibonnaci

n = int(input('Digite um número: '))
cont = 1
fib = 0
fib2 = 1
outrofib = 0

print('Sequencia de Fobonacci: ', end='')
while cont <= n:
    print('{} -> '.format(fib), end='')
    outrofib = fib + fib2
    fib = fib2
    fib2 = outrofib
    cont += 1
print('FIM')