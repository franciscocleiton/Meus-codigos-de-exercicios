# Crie um programa que tenha uma tupla totalmente peenchida por uma contagem por extenso, de zero até vinte.
# Seu programa deverá ler um número pelo teclado (entre 0 e 20) e mostrá-lo por extenso

extenso = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove,' 'dez', 'onze', 'doze', 'treze', 'cartoze', 'quinze', 'desesseis', 'desessete', 'dezoito', 'dezenove', 'vinte')
num = int(input('Digite um número entre 0 e 20: '))
while num < 0 or num > 20:
    num = int(input('Tente Novamente. Digite um número entre 0 e 20: '))
print(f'Você digitou o número {extenso[num]}\n')