# somar números em uma lista usando 'loop for'
def somar_num_loop(lista):
    total = 0
    for n in lista:
        total += n
    return total


# somar números em uma lista usando recursão
def somar_num_recursivo(lista):
    if len(lista) == 0:
        return 0
    return lista[-1] + somar_num_recursivo(lista[:-1])



# outra opção para somar elementos de uma lista recursivamente
def somar_num_recursivo2(lista):
    if len(lista) == 0:
        return 0
    return lista[0] + somar_num_recursivo2(lista[1:])



#print(somar_num_loop([1, 2, 3, 4, 5]))
#print(somar_num_recursivo([1, 2, 3, 4, 5]))
print(somar_num_recursivo2([1, 2, 3, 4, 5]))