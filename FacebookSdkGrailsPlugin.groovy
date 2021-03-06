import grails.plugin.facebooksdk.*

class FacebookSdkGrailsPlugin {
	
	def version = "0.4.8"
	def grailsVersion = "2.0 > *"

    def author = "Benoit Hediard"
    def authorEmail = "ben@benorama.com"
    def title = "Facebook SDK Plugin"
    def description = '''The Facebook SDK Plugin allows your Grails application to use the Facebook Platform and develop Facebook apps on Facebook.com or on web sites (with Facebook Connect).
It is a port of the official Facebook PHP SDK V3.1.1 to Grails 2.0.
''' 
    
    def documentation = "http://benorama.github.com/grails-facebook-sdk/guide/"
    def license = "APACHE"
    def organization = [ name: "AgoraPulse", url: "http://www.agorapulse.com/" ]
    def issueManagement = [ system: "github", url: "https://github.com/benorama/grails-facebook-sdk/issues" ]
    def scm = [  url: "https://github.com/benorama/grails-facebook-sdk" ]

    def doWithSpring = {
        // It looks like proxy is automatically generated when request scope bean are injected in grails singleton bean (services)
        facebookContextProxy(org.springframework.aop.scope.ScopedProxyFactoryBean) { bean ->
            targetBeanName = 'facebookContext'
            proxyTargetClass = true
        }
        facebookContext(FacebookContext) { bean ->
            bean.scope = 'request'
            grailsApplication = ref('grailsApplication')
            grailsLinkGenerator = ref('grailsLinkGenerator')
        }
    }

}