<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Jogador!</title>
    <style>
        body{
            color: black;
            background: white ;
        }
        h1{
            color: black;
            font-size: 25px;
        }
        table{
            color: bisque;
            background: cadetblue;
            border-style: solid;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Jogadores:</h1>
    <table>
        <thead>
        <tr>
            <th>
                ID
            </th>
            <th>
                DESAFIANTES
            </th>
            <th>
                EQUIPE 1
            </th>
            <th>
                EQUIPE 2
            </th>
        </tr>
        </thead>
        <tbody>
        <#list partidas as partida>
            <tr>
                <td>
                    ${partida.id}
                </td>
                <td>
                    ${partida.nome}
                </td>
                <td>
                    ${partida.equipe1.nome}
                </td>
                <td>
                    ${partida.equipe2.nome}
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>