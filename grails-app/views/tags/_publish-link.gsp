<g:if test="${!disabled}"><r:require module="fb-sdk-publish-link" /></g:if>
<a <g:if test="${elementId}">id="${elementId}"</g:if>
    class="<g:if test="${elementClass}">${elementClass} </g:if>fb-sdk-publish-link"
    <g:if test="${callback}">data-callback="${callback}"</g:if>
    <g:if test="${caption}">data-caption="${caption.encodeAsHTML()}"</g:if>
    <g:if test="${display}">data-display="${display}"</g:if>
    <g:if test="${description}">data-description="${description.encodeAsHTML()}"</g:if>
    <g:if test="${link}">data-link="${link}"</g:if>
    <g:if test="${name}">data-name="${name.encodeAsHTML()}"</g:if>
    <g:if test="${picture}">data-picture="${picture}"</g:if>
    <g:if test="${source}">data-source="${source}"</g:if>
    <g:if test="${disabled}">disabled="disabled"</g:if>
    href="#">
    ${body}
</a>