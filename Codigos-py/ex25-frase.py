frase = str(input('Digite uma frase: ')).strip()

#quantidade de A
frase = frase.upper()
print('A frase possue {} letras A'.format(frase.count('A')))
print('A primeira letra A apareceu na posição {}'.format(frase.find('A')+1))
print('A última letra A apareceu na posição {}'.format(frase.rfind('A')+1))
