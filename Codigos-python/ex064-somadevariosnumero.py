# Crie um programa que leia vários números interiros pelo teclado. 
# O programa só vai parar quando o usuário digitar 999, que é a 
# condição de parada. No final, mostre quantos números foram 
# digitados e qual foi a soma entre eles (desconsiderando o flag)

num = int(input('Digite o número a ser somado: '))
soma = 0
conttermos = 0

while num != 999:
    soma += num
    conttermos += 1

    num = int(input('Digite o número a ser somado: '))
print('Foram somados {} números e a soma é {}!\n'.format(conttermos, soma)) 
