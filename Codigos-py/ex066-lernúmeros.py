# Crie um programa que leia vários números inteiros pelo teclado. 
# O rpograma só vai parar quando o usuário digitar o valor 999, 
# que é a condição de parada. No final, mostre quantos números 
# foram digitados e qual foi a soma entre eles (desconsidere o flag).

soma = 0
conttermos = 0

while True:
    num = int(input('Digite o número a ser somado: '))
    if num == 999:
        break;
    soma += num
    conttermos += 1
    
print('Foram somados {} números e a soma é {}!\n'.format(conttermos, soma))