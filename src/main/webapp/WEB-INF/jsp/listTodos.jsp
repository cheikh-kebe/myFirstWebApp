<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <h1>Liste des tâches</h1>
    <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Cible</th>
                <th>Terminée?</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td>
                        <a href="/update-todo?id=${todo.id}" class="btn btn-primary">Modifier</a>
                        <a href="/delete-todo?id=${todo.id}" class="btn btn-danger">Supprimer</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/add-todo" class="btn btn-success">Ajouter une tâche</a>
</div>

<%@ include file="common/footer.jspf" %>