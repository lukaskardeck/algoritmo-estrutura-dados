# conta a quantidade de elementos na lista usando recursao
def length(lista):
    if lista == []:
        return 0
    return 1 + length(lista[:-1])


print(length([1, 2, 4, 8, 16]))