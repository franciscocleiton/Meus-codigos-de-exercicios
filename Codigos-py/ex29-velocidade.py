vel = int(input("Velocidade: "))

if vel > 80:
    x = int(vel - 80)
    val = float(x*7.00)
    print("Você foi multado em R${:.2f}, por excesso de velocidade".format(val))
else:
    print("Você não possui multas!")
