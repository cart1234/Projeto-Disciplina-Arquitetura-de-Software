# Projeto-Disciplina-Arquitetura-de-Software 


       ================= PRIMEIRA PARTE DO PROJETO ========================= 


AS CLASSES EQUILIBRIOSOLO, TIPONUTRIENTES E TEXTURASOLO, foi utilizado como base o código desenvolvido na aula

Referencia: https://github.com/gabrielcostasilva/sa-soilcorrection




    ==================== SEGUNDA PARTE DO PROJETO ============================

   CLASSE FosfatagemEnum  
  -> Reponsável pelos cálculos do Custo, Quantidade aplicada, e os valores obtidos do fornecimento da Correcao do tipo de Fosforo. 
  
  
   ClASSE InterfaceFosforo 
  -> Contém os métodos que serao aplicados na Classe FosfatagemEnum. 
  
  CLASSE InterfacePotassio 
    -> Contém os métodos que serao aplicados na Classe PotassagemEnum. 
    

  CLASSE PotassagemEnum  
  -> Reponsável pelos cálculos do Custo, Quantidade aplicada, e os valores obtidos do fornecimento da Correcao do tipo de Potassio. 
  
  
    =========================  Medição do Projeto ==========================================
  

cloc|github.com/AlDanial/cloc v 1.82  T=0.01 s (497.3 files/s, 52355.1 lines/s)
--- | ---

Language|files|blank|comment|code
:-------|-------:|-------:|-------:|-------:
Java|7|358|0|398

.Problemas identificados 

->  Excesso de estrutura de repetição

->  Nome de metodos incoerente


   
    ==================== APÓS CORREÇÃO DO PROJETO ============================
   

cloc|github.com/AlDanial/cloc v 1.82  T=0.01 s (506.5 files/s, 54631.2 lines/s)
--- | ---

Language|files|blank|comment|code
:-------|-------:|-------:|-------:|-------:
Java|7|390|0|365

-> Redução de estruturas condicionais 

-> Nome de metodos coerente 

-> utilizei conceito do polimorfismo

Utilizei como referencia o site https://www.alura.com.br/artigos/reduzindo-de-n-ifs-para-nenhum-com-strategy-em-java 


<hr width = 100%>
<h2>Atividade 4</h2>
<p>Foi realizado os testes que simulam os quadros, esses testes foram implementados na classe <strong>TestesQuadros.java</strong>. Durante a análise do código foram observados alguns problemas/dificuldades no código que são citadas a seguir: </p>
<ul>
  <li>
      Quadro dos Teores do Solo
      <ul>
            <li>Estavam faltando os testes para a Correção de Carbono e para o MO percentual, logo sendo necessário implementar nos Testes do Quadro.</li>
            <li>O cálculo de correção carbono foi feito de forma incorreta, pois o valor do MO percentual está sendo dividido por 10 sendo que deveria ser divido por 0.172(1.72/10). Assim no teste o valor de correção carbono seria validado no valor correto de 17,84. <strong>Commit:</strong> <a href = "https://github.com/cart1234/Projeto-Disciplina-Arquitetura-de-Software/commit/6b34ab07cb834a66ea2b6887a3825ceee7b1bbe2ee7b1bbe2">6b34ab0</a>
            </li>
      </ul>
  </li>
  <li>
      Quadro da Correção Fosforo
      <ul>
          <li>Foi dificultoso o entendimento a questão da fonte fosforo e dos nutrientes na mesma classe, seria mais eficente aplicar orientação a objeto utilizando polimorfismo para deixar mais simples afim de ser possivel implementar uma classe especifica que tem determinado nutriente.</li>
          <li>Muitos métodos implementados dentro enums.</li>
          <li>Esta dificultoso o entendimento dos Calculos da quantidade aplicar no Enum FosfatagemCalcioEnum e na classe TERMOFOSFATOYORIN, pois está muito verboso.</li>
          <li>Foi utilizado bastante operadores ternários, como por exemplo no Enum FosfatagemCalcioEnum e na classe TERMOFOSFATOYORIN, sendo assim dificil a compreensão.</li>
      </ul>
  </li>
  <li>
      Quadro da Correção Potassio
      <ul>
          <li>Estavam faltando os testes para a porcentagem ideal do potassio e participação do potassio na CTC após a correção, logo sendo necessário implementar nos Testes do Quadro.</li>
          <li>Não foi implementado os métodos PotassioPercentualIdeal e ParticipacaoPotassioCorrecao, que são referentes ao Enum PotassagemEnum. <strong>Commit:</strong>  <a href = "https://github.com/cart1234/Projeto-Disciplina-Arquitetura-de-Software/commit/aa705bd7292222923475552723284241f92c4ca9">aa705bd</a></li>
      </ul>
  </li>
</ul><br/>
