# maior elemento em uma lista usando recursao
def max(lista):
    if len(lista) == 1:
        return lista[0]
    menor = lista[0]
    if lista[-1] < menor:
        return max(lista[:-1])
    else:
        return max(lista[1:])



print(max([7, 2, 3]))