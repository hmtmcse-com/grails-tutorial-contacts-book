<meta name="layout" content="main"/>
<div class="card">
    <div class="card-header">
        <g:message code="contact" args="['Update']"/>
    </div>
    <div class="card-body">
        <g:form controller="contact" action="update" enctype="multipart/form-data">
            <g:hiddenField name="id" value="${contact.id}"/>
            <g:render template="form"/>
            <div class="form-action-panel">
                <g:submitButton class="btn btn-primary" name="login" value="${g.message(code: "update")}"/>
                <g:link controller="contact" action="index" class="btn btn-primary"><g:message code="cancel"/></g:link>
            </div>
        </g:form>
    </div>
</div>