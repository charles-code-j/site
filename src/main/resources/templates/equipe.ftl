<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Equipe!${equipe.nome}!</title>
</head>
<body>
<div class="container">
    <h1>Equipe</h1>
    Id: ${equipe.id}
    <br/>
    Nome do Time: ${equipe.nome}
    <br/>
    Jogador1: ${equipe.jogador1.nome}
    <br/>
    Jogador2: ${equipe.jogador2.nome}
    <br/>
    Jogador3: ${equipe.jogador3.nome}
    <br/>
    Jogador4: ${equipe.jogador4.nome}
    <br/>
    Jogador5: ${equipe.jogador5.nome}
</div>
</body>
</html>