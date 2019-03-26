<div class="form-group">
    <div class="form-inline phone-number-area">
        <g:if test="${details}">
            <g:hiddenField name="detailsId" value="${details.id}"/>
        </g:if>
        <div class="form-group">
            <UIHelper:contactType value="${details?.type}"/>
        </div>
        <div class="form-group mx-sm-3">
            <g:textField name="mobile" class="form-control" placeholder="Mobile Number" value="${details?.mobile}"/>
        </div>
        <div class="form-group mx-sm-3">
            <g:textField name="phone" class="form-control" placeholder="Phone Number" value="${details?.phone}"/>
        </div>
        <div class="form-group mx-sm-3">
            <g:textField name="email" class="form-control" placeholder="Email" value="${details?.email}"/>
        </div>
        <div class="form-group mx-sm-3">
            <g:textField name="website" class="form-control" placeholder="Website" value="${details?.website}"/>
        </div>
        <div class="form-group mx-sm-3">
            <g:textField name="address" class="form-control" placeholder="Address" value="${details?.address}"/>
        </div>
        <g:if test="${details}">
            <button type="button" data-id="${details?.id}" class="btn btn-danger remove-number"><i class="fas fa-trash"></i></button>
        </g:if>
        <g:else>
            <button type="button" class="btn btn-primary add-new-number"><i class="fas fa-plus-circle"></i></button>
        </g:else>

    </div>
</div>
