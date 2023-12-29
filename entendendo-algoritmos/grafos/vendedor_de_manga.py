from collections import deque

def eh_vendedor(nome):
    return nome[-1] == "m"


def pesquisa(nome):
    fila_de_pesquisa = deque()
    fila_de_pesquisa += amigos[nome]

    verificados = dict()

    while fila_de_pesquisa:
        pessoa = fila_de_pesquisa.popleft()
        
        if not verificados.get(pessoa):
            if eh_vendedor(pessoa):
                return pessoa
                        
            fila_de_pesquisa += amigos[pessoa]
            verificados[pessoa] = True

    return None           


amigos = dict()
amigos["voce"] = ["claire", "bob", "alice"]
amigos["claire"] = ["thom", "jonny"]
amigos["bob"] = ["anuj", "peggy"]
amigos["alice"] = ["peggy"]
amigos["anuj"] = []
amigos["thom"] = []
amigos["peggy"] = []
amigos["jonny"] = []


pessoa_vendedora = pesquisa("voce")

if pessoa_vendedora:
    print(f"{pessoa_vendedora} eh vendedor(a) de manga")
else:
    print(f"Nao ha nenhum vendedor de manga na minha rede")
