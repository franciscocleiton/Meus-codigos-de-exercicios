#Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores 'M' ou 'F'. Caso esteja errado, 
#peça a digitação novsmente até ter um valor correto.

sexo = ''
while sexo != 'F' and sexo != 'M':
    sexo = str(input('Digite seu sexo [F/M]: ')).strip().upper()[0]
    if sexo != 'F' and sexo != 'M':
        print('Dados Inválidos, tente novamente')
print('Sexo {} registrado com sucesso\n'.format(sexo))
