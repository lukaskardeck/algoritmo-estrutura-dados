# Algoritmo de ordenação: quicksort!

# Casos bases para ornder um array:
#   - Array vazio: []
#   - Array com um único elemento: [7]

def quicksort(array):
    if len(array) < 2:
        return array
    pivo = array[0]
    menores = []
    maiores = []
    for i in array[1:]:
        if i >= pivo:
            maiores.append(i)
        else:
            menores.append(i)
    return quicksort(menores) + [pivo] + quicksort(maiores)



print(quicksort([10, 5, 2, 3, 11, 4, 4, 25]))