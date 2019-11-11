<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Jogador!${jogador.nome}!</title>
</head>
<body>
<div class="container">
    <h1>Jogador</h1>
    Id: ${jogador.id}
    <br/>
    Nome: ${jogador.nome}
    <br/>
    Equipamento: ${jogador.equipamento}
    <br/>
    Mortes: ${jogador.mortes}
    </br>
    Kills: ${jogador.kills}
</div>
</body>
</html>