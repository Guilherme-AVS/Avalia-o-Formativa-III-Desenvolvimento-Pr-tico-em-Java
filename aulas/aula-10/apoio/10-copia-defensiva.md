# Cópia Defensiva

Não exponha diretamente uma coleção mutável interna. Retorne `new ArrayList<>(lista)` ou uma visão imutável. O cliente deve usar operações públicas para alterar o estado.
