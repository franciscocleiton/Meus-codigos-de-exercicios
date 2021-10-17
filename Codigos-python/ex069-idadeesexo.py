# Crie um programa que leia a idade e o sexo de várias pessoas. A cada pessoa cadastrada. O programa deverá perguntar se o usuário quer ou não continuar. No final, mostre:
# A) Quantas pessoas tem mais de 18 anos.
# B) Quantas homens foram cadastrados.
# C) Quantas mulheres tem menos de 20 anos.


maior = homens = menor = 0

while True:
    sexo = ' '
    op = ' '   

# Cadastro de pessoas
    print('-'*20)
    print('CADASTRE UMA PESSOA')
    print('-'*20)
    
    idade = int(input('Idade: '))
    while sexo not in 'MF':
        sexo = str(input('Sexo: ')).upper().strip()[0]
    print('-'*20)
    while op not in 'SN':
        op = str(input('Quer continuar? [S/N] ')).upper().strip()[0]

    if idade >= 18: # if usado para contabilizar pessoas com mais de 18 (A)
        maior += 1
    if sexo in 'Mm': # if usado para contabilizar pessoas do sexo masculino (B)
        homens += 1
    if idade < 20 and sexo in 'Ff': # if usado para contabilizar mulheres menores de 20 anos (C)
        menor += 1
    
    if op == 'N':
        break
print(f'''Total de pessoas com mais de 18 anos: {maior}
Ao todo temos {homens} homens cadastrados
E temos {menor} mulheres com menos de 20 anos!''')
