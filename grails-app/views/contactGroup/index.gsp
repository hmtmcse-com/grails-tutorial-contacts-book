<meta name="layout" content="main"/>

<div class="card">
    <div class="card-header">
        <g:message code="contact.group" args="['List Of']"/>
        <span class="float-right">
            <div class="btn-group">
                <g:link controller="contactGroup" action="create" class="btn btn-success"><g:message code="create"/></g:link>
                <g:link controller="contactGroup" action="index" class="btn btn-primary"><g:message code="reload"/></g:link>
            </div>
        </span>
    </div>
    <div class="card-body">
        <table class="table table-bordered">
            <thead class="thead-dark">
            <tr>
                <g:sortableColumn property="name" title="${g.message(code: "name")}"/>
                <th class="action-row"><g:message code="action"/></th>
            </tr>
            </thead>
            <tbody>
                <g:each in="${contactGroups}" var="group">
                    <tr>
                        <td>${group?.name}</td>
                        <td>
                            <div class="btn-group">
                                <g:link controller="contactGroup" action="details" class="btn btn-secondary" id="${group.id}"><i class="fas fa-eye"></i></g:link>
                                <g:link controller="contactGroup" action="edit" class="btn btn-secondary" id="${group.id}"><i class="fas fa-edit"></i></g:link>
                                <g:link controller="contactGroup" action="delete" id="${group.id}" class="btn btn-secondary delete-confirmation"><i class="fas fa-trash"></i></g:link>
                            </div>
                        </td>
                    </tr>
                </g:each>
            </tbody>
        </table>
        <div class="paginate">
            <g:paginate total="${total ?: 0}" />
        </div>
    </div>
</div>