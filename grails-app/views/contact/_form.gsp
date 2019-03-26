<div class="form-group">
    <label><g:message code="contact.name"/> *</label>
    <g:textField name="name" class="form-control" value="${contact?.name}" placeholder="Please Enter Contact Name"/>
    <UIHelper:renderErrorMessage fieldName="name" model="${contact}" errorMessage="please.enter.name"/>
</div>

<div class="form-group">
    <label><g:message code="image"/></label>
    <g:field name="contactImage" class="form-control" type="file" placeholder="Please Upload Image"/>
    <g:if test="${contact?.image}">
        <img src="${resource(dir: "contact-image", file: "/${contact.id}-${contact.image}")}" class="img-thumbnail" style="margin-top: 10px; height: 100px; width: 100px;"/>
    </g:if>
</div>

<div class="form-group">
    <label><g:message code="contact.group.name"/></label>
    <UIHelper:contactGroup value="${contact?.contactGroup*.id}"/>
</div>



<div class="details-panel">
    <g:include controller="contactDetails" action="create" id="${contact?.id}"/>
</div>


