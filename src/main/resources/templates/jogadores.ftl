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
                NOME
            </th>
            <th>
                EQUIPAMENTO
            </th>
            <th>
                KILLS
            </th>
            <th>
                MORTES
            </th>
        </tr>
        </thead>
        <tbody>
        <#list jogadores as jogadores>
            <tr>
                <td>
                    ${jogadores.id}
                </td>
                <td>
                    ${jogadores.nome}
                </td>
                <td>
                    ${jogadores.equipamento}
                </td>
                <td>
                    ${jogadores.kills}
                </td>
                <td>
                    ${jogadores.mortes}
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>