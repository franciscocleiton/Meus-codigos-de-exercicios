import math
c1 = int(input("Cateto oposto: "))
c2 = int(input("cateto adjacente: "))
H1 = (pow(c1, 2) + pow(c2, 2))
H = math.sqrt(H1)
print("Hipotenusa: {:.1f}".format(H))
