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
                NOME DO TIME
            </th>
            <th>
                JOGADOR-1
            </th>
            <th>
                JOGADOR-2
            </th>
            <th>
                JOGADOR-3
            </th>
            <th>
                JOGADOR-4
            </th>
            <th>
                JOGADOR-5
            </th>
        </tr>
        </thead>
        <tbody>
        <#list equipes as equipe>
            <tr>
                <td>
                    ${equipe.id}
                </td>
                <td>
                    ${equipe.nome}
                </td>
                <td>
                    ${equipe.jogador1.nome}
                </td>
                <td>
                    ${equipe.jogador2.nome}
                </td>
                <td>
                    ${equipe.jogador3.nome}
                </td>
                <td>
                    ${equipe.jogador4.nome}
                </td>
                <td>
                    ${equipe.jogador5.nome}
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>