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
        a {

            color: white;
        }
        table{
            color: white;
            position: absolute;
            left: 50%;
            background: transparent;
            top: 50%;
            border: 0;
            margin-left: -200px;
            margin-top: -0px;
        }
        center{
            position: absolute;
            top: 95%;
            margin-left: 100px;
            height: 200px;
        }
    </style>
</head>
<body>
<div class="container">
    <table>
        <thead>
        <tr>
            <th>
                ID
            </th>
            <th>
                PARTIDA
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
        <#list resultados as resultado>
            <tr>
                <td>
                    ${resultado.id}
                </td>
                <td>
                    ${resultado.partida.nome}
                </td>
                <td>
                    <a href="/screen-equipe/${resultado.partida.equipe1.id}">
                        ${resultado.roundsEquipe1}
                    </a>
                </td>
                <td>
                    ${resultado.roundsEquipe2}
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
    <img src="https://blog.gamersclub.com.br/wp-content/uploads/2019/08/mae-nao-tem-pause-gamers-club.png"width="100%">
    <center container-img>
    <img src="https://i.imgur.com/PZwtuLU.png">
    </center>
</div>
</body>
</html>