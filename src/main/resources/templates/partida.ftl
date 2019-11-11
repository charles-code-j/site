<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Partida!${partida.nome}!</title>
</head>
<body>
<div class="container">
    <h1>Partida</h1>
    Id: ${partida.id}
    <br/>
    Nome do Time: ${partida.nome}
    <br/>
    Equipe-1:${partida.equipe1.nome}
    <br/>
    Equipe-2:${partida.equipe2.nome}
</div>
</body>
</html>