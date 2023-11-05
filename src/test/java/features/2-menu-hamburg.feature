# encoding: utf-8
# language: pt

Funcionalidade: Testes do menu hamburg

Cenario: Validar se o menu esta clicavel 

Dado que o usuario fez o login e esta na tela de all products
Quando clica em menu hamburg
Então o menu deve abrir

Cenario: Validar se cada item do menu esta clicavel

Dado que o usuario fez o login e esta na tela de all products
Quando clica em menu hamburg
E clica em cada um dos itens do menu 
Então cada um dos itens devem ser clicáveis