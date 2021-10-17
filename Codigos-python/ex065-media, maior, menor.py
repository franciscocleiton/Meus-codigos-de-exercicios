# Crie um número que leia vários inteiros pelo teclado. 
# No final da execução, mostre a média entre todos os 
# valores e qual foi o maior e o menor valores lifos. 
# O programa deve perguntar ao usuário se ele quer continuar a digitar valores.

maior = menor = media = cont = soma = 0
escolhe = ''

while escolhe != 'N':
    n = int(input('Digite um número: '))
    cont += 1
    soma += n

    if cont == 1:
        maior = n
        menor = n
    else:
        if n > maior:
            maior = n
        if n < menor:
            menor = n
    escolhe = str(input('Deseja continuar (S/N): ')).upper().strip()[0]

media = soma / cont
print(f'Média = {media}\nMaior = {maior}\nMenor = {menor}\n')
