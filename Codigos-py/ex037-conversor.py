num = int(input('Digite um número: '))
print('''Escolha uma das bases para conversão
[1] converter para BINÁRIO
[2] converter para OCTAL
[3] converter para HEXADECIMAL''')

opção = int(input('Digite sua opção: '))

#conveção para binário
if opção == 1:
    print('{} convertido para BINÁRIO é igual a {}'.format(num, bin(num)[2:]))

#conveção para octal
elif opção == 2:
    print('{} convertido para OCTAL é igual a {}'.format(num, oct(num)[2:]))

#conveção para Hexadecimal
elif opção == 3:
    print('{} convertido para HEXADECIMAL é igual a {}'.format(num, hex(num)[2:]))

else:
    print('Opção inválida')
