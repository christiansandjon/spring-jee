<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
</head>
<body>
<form method="post" action="/spring-jee/servlet">

<p><font color=red>${error}</font></p>
<p><font color=red>${erreur}</font></p>
            <fieldset>
                <legend>Connexion</legend>
                <p>Connectez vous !</p>

                <label for="login">Login <span class="requis">*</span></label>
                <input type="text" id="login" name="login" value="Chris" size="20" maxlength="60" />
                <br />

                <label for="password">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="password" name="password" value="a" size="20" maxlength="20" />
                <br />
                <input type="submit" value="Connexion" class="sansLabel" />
                <br />
            </fieldset>
        </form>

</body>
</html>