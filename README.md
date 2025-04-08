# 🧹 Leitor e Filtrador de Arquivo `.txt` em Java

Este projeto realiza a leitura de um arquivo `.txt`, transforma cada linha em um objeto `PontoDeColeta` e armazena apenas as linhas que correspondem a um critério de busca (como o tipo de material coletado).

## ✨ Funcionalidades

- Leitura linha por linha de arquivos `.txt`
- Filtro de conteúdo baseado em palavras-chave (ex: "papel", "plástico")
- Transformação de strings em objetos Java
- Armazenamento dos dados filtrados em uma lista
- Estrutura modular com separação de responsabilidades

## 🧱 Arquitetura

- `model/` → Classe `PontoDeColeta`
- `reader/` → Leitura de arquivos (`LeitorDeArquivo`)
- `service/` → Lógica de análise e transformação (`PontoDeColetaService`, `AnalisadorPonto`)
- `repository/` → Armazenamento em `LinkedList` (`PontoDeColetaRepository`)

Feito por alguém da Rosa. :gem::cherry_blossom:
