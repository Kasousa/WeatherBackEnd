# WeatherBackEnd  
Projeto de automação de testes de back end, escrito em JAVA, para testes da API Open Weather  

## Instalação  

1 - Clone o projeto do git com o comando:  
**git clone https://github.com/Kasousa/WeatherBackEnd.git**  
2 - Utilize a IDE de sua preferência, Eclipse, Intelij.. importando o projeto como maven e aguardando serem baixadas todas as dependências  

## Execução

1 - Via linha de comando, enviando comando "mvn test"  
2 - Clicando com o botão direito na classe "BaseTest" e selecionando a opção "Run"  

## Sobre o framework  

- configs -> Pasta com o arquivo de configurações do framework (URL base e API Key)
- src 
    - test
        - java 
            - ApiDoc -> Tratamento dos arquivos pertinentes a documentação da API
            - ApiEngine -> Modelos de Request e Response da API
            - Cucumber -> Classes de contexto para os cenários
            - DataProvider -> Classe de leitura das configurações
            - Enums -> Enums do framework
            - Feature -> Arquivos .feature com o BDD do Cucumber
            - Steps -> Classes contendo os passos dos testes
            - Support -> Classes de suporte dos testes 
            - BaseTest -> Classe base do Cucumber para execução dos testes












&copy; Kaique Santos Sousa - 2021
