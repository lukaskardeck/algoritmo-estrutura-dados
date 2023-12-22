# busca binaria sem recursao
def binary_search(lista, num):
    pos_min = 0
    pos_max = len(lista) - 1

    while pos_min <= pos_max:
        middle = (pos_min + pos_max) // 2
        if num == lista[middle]:
            return middle
        elif num > lista[middle]:
            pos_min = middle + 1
        else:
            pos_max = middle - 1
    return None


#busca binaria com recursao
def binary_search2(lista, num, initial = 0, final = None):
    if final is None:
        final = len(lista) - 1
    
    if initial > final:
        return None
    
    middle = (initial + final) // 2
    if num == lista[middle]:
        return middle
    elif num > lista[middle]:
        return binary_search2(lista, num, middle+1, final)
    else:
        return binary_search2(lista, num, initial, middle-1)



print(binary_search2([1, 2, 4, 7, 15, 18, 22], 22))