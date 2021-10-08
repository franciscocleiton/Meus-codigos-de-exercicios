#Faça um programa que leia um número qualquer e mostre o seu fatorial

num = int(input('Digite um número: '))
cont = num - 1
fat = num

print('Calculando {}! = {} x '.format(num, num), end='')
while cont > 0:
    print('{}'.format(cont), end='')
    print(' x ' if cont > 1 else ' = ', end='')
    fat *= cont
    cont -= 1

print('{}\n'.format(fat))
