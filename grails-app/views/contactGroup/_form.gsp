<div class="form-group">
    <label><g:message code="contact.group.name"/> *</label>
    <g:textField name="name" class="form-control" value="${contactGroup?.name}" placeholder="Please Enter Group Name"/>
    <UIHelper:renderErrorMessage fieldName="firstName" model="${contactGroup}" errorMessage="please.enter.name"/>
</div>
