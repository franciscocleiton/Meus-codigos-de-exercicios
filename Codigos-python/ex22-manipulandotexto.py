nome = str(input('Digite seu nome completo: '))

#Nome com todas as lestras maiúsculas
print('\n')
print(nome.upper())

#Nome com letras minúsculas
print('\n')
print(nome.lower())

#quantidade de letras sem espaços
print('\n')
div = nome.split()
cont=''.join(div)
print(len(cont))

#quantas letras tem o primeiro nome
print('\n')
divisao = nome.split()
print(len(divisao[0]))
