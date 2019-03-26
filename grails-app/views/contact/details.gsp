<meta name="layout" content="main"/>

<div class="card">
    <div class="card-header">
        <g:message code="contact" args="['Details']"/>
    </div>
    <div class="card-body">

        <div class="row">
            <div class="col-3">
                <div class="card" style="width: 18rem;">
                    <g:if test="${contact.image}">
                        <img src="${resource(dir: "contact-image", file: "/${contact.id}-${contact.image}")}" class="card-img-top"/>
                    </g:if>
                    <g:else>
                        <g:img dir="images" file="grails.svg" class="card-img-top"/>
                    </g:else>
                    <div class="card-body">
                        <p class="card-text">
                            <strong>Name:</strong> ${contact.name}
                            <g:if test="${contact.contactGroup}">
                                <br><strong>Group:</strong>
                                <g:each in="${contact.contactGroup}" var="group">
                                    ${group.name},
                                </g:each>
                            </g:if>
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-8">
                <g:if test="${contact.contactDetails}">
                    <div class="row">
                        <g:each in="${contact.contactDetails}" var="details">
                            <div class="col-4">
                                <div class="card" style="margin-bottom: 8px;">
                                    <ul class="list-group list-group-flush">
                                        <li class="list-group-item"><strong>Contact Type:</strong> ${details.type}</li>
                                        <li class="list-group-item"><strong>Mobile:</strong> ${details.mobile}</li>
                                        <li class="list-group-item"><strong>Phone:</strong> ${details.phone}</li>
                                        <li class="list-group-item"><strong>Email Address:</strong> ${details.email}</li>
                                        <li class="list-group-item"><strong>Web:</strong> ${details.website}</li>
                                        <li class="list-group-item"><strong>Address:</strong> ${details.address}</li>
                                    </ul>
                                </div>
                            </div>
                        </g:each>
                    </div>
                </g:if>
            </div>
        </div>


        <div class="form-action-panel" style="margin-top: 8px;">
            <g:link controller="contact" action="index" class="btn btn-primary"><g:message code="cancel"/></g:link>
        </div>
    </div>
</div>