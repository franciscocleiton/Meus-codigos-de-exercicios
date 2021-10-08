# Crie um programa que leia o nome e o preço de vários produtos. O programa deverá perguntar se o usuário vai continuar. No final, mostre:
# A) Qual é o total gasto na compra.
# B) Quantos produtos custam mais de R$1000.
# C) Qual é o nome do produto mais barato.

print('-'*30)
print('{:^30}'.format('LOJA SUPER BARATÃO'))
print('-'*30)

preçototal = maisdemil = maisbarato = cont = 0
produtobarato = ''

while True:
# Cadastro de produtos
    produto = str(input('Nome do Produto: '))
    preço = float(input('Preço: R$'))
    cont += 1

    preçototal += preço
    if preço >= 1000:
        maisdemil += 1
    
    if cont == 1:
        produtobarato = produto
        maisbarato = preço
    else:
        if preço < maisbarato:
            produtobarato = produto
            maisbarato = preço
    
    continuar = ' '
    while continuar not in 'SN':
        continuar = str(input('Deseja continuar [S/N]? ')).upper().strip()[0]
    
    if continuar == 'N':
        print('{:-^40}'.format('FIM DO PROGRAMA'))
        break

print(f'O total da compra foi R${preçototal:.2f}')
print(f'Temos {maisdemil} produtos custando mais de R$1000')
print(f'O produto mais barato foi {produtobarato} que custa R${maisbarato:.2f}')
