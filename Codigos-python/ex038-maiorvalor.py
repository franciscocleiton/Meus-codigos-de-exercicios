n1 = int(input('Digite um número: '))
n2 = int(input('Digite outro número: '))

#comparação
if n1 > n2:
    print('O {} é maior"\n'.format(n1))
elif n2 > n1:
    print('O {} é maior\n'.format(n2))
else:
    print('Os números são iguais!\n')
