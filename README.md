Facebook SDK Grails Plugin
==========================

# Introduction

The [Facebook Platform](http://developers.facebook.com/) is a set of APIs that make your application more social. Read more about [integrating Facebook with your web site](http://developers.facebook.com/docs/guides/web) on the Facebook developer site.

This project contains the open source **Grails Facebook SDK Plugin** that allows you to integrate the [Facebook Platform](http://developers.facebook.com/) on a website/app powered by [Grails](http://grails.org).

This plugin is a port of the official [Facebook PHP SDK V3.1.1](http://github.com/facebook/facebook-php-sdk) to [Grails 2.0](http://grails.org).

It supports the latest *OAuth2.0 authentication* (required since October 1st 2011).

**Grails Facebook SDK Plugin** provides the following Grails artefacts:

* **FacebookContext** - A Spring bean to get current Facebook context in controllers, when running [apps on Facebook.com](http://developers.facebook.com/docs/guides/canvas/) or [websites with the Facebook Platform](http://developers.facebook.com/docs/guides/web).
* **FacebookGraphClient** - A client to call [Facebook Graph API](http://developers.facebook.com/docs/reference/api/), which is a wrapper around the rock solid [RestFB java library](http://restfb.com/) version 1.6.10 (released September 03, 2012).
* **FacebookJSTagLib** - A collection of tags to easily integrate [Facebook JS SDK](http://developers.facebook.com/docs/reference/javascript/) in your GSPs.


# Installation

Declare the plugin dependency in the BuildConfig.groovvy file, as shown here:

```groovy
grails.project.dependency.resolution = {
		inherits("global") { }
		log "info"
		repositories {
				//your repositories
		}
		dependencies {
				//your regular dependencies
		}
		plugins {
				//here go your plugin dependencies
				runtime ':facebook-sdk:0.4.8'
		}
}
```


# Config

Create a Facebook app on [Facebook Developers](https://developers.facebook.com/apps), in order to get your own app ID and app secret.

Add your Facebook app parameters to your _grails-app/conf/Config.groovy_:

```groovy
grails.plugin.facebooksdk.app.id = {APP_ID}
grails.plugin.facebooksdk.app.permissions = {APP_PERMISSIONS} // Ex. ['email','user_photos']
grails.plugin.facebooksdk.app.secret = {APP_SECRET}
```

# Getting started with a demo app

If you want to quickly run the SDK on a demo app, you can download [Facebook SDK Grails - Demo](https://github.com/benorama/grails-facebook-sdk-demo).


# Integration with Shiro Grails Plugin

To see an example of integration with Shiro Grails Plugin, you can download [Facebook SDK Grails - Shiro demo](https://github.com/benorama/grails-facebook-sdk-demo-shiro).


# Documentation

Project documentation is located here :

* [Reference Documentation (Page per chapter)](http://benorama.github.com/grails-facebook-sdk/guide)
* [Reference Documentation (Single page)](http://benorama.github.com/grails-facebook-sdk/guide/single.html)
* [Groovy API docs](http://benorama.github.com/grails-facebook-sdk/gapi/)

# Latest releases

WARNING: Since V0.4.0, _FacebookApp_, _FacebookSdkFilters_ and _FacebookAppService_ from V0.3.* are DEPRECATED and have been replaced by _FacebookContext_.
Please check [FacebookContext](http://benorama.github.com/grails-facebook-sdk/guide/facebookContext.html) doc for more info.

* 2013-01-03 **V0.4.8** : bug fix token expiration time handling (in Facebook Page tabs)
* 2012-12-20 **V0.4.7** : bug fix resources definition
* 2012-12-07 **V0.4.6** : bug fix in invite/publish/send tags (encode text as HTML in attributes)
* 2012-12-05 **V0.4.5** : bug fix in _FacebookSignedRequest_ appData property
* 2012-11-15 **V0.4.4** : for photo/video publishing, _FacebookGraphClient_ _publish_ method accepts now _InputStream_ argument type (instead of _FileInputStream_ only)
* 2012-10-29 **V0.4.3** : tag lib improvements: channel integration (_initJS_ tag and _FacebookSdkController_ created), resources plugin integration (_FacebookSdkResources_ created)
* 2012-10-10 **V0.4.2** : bug fix in batch responses error handling
* 2012-09-25 **V0.4.1** : bug fix in server side OAuth redirect
* 2012-09-25 **V0.4.0** : complete refactoring to improve SDK architecture ([FacebookContext](http://benorama.github.com/grails-facebook-sdk/guide/facebookContext.html) implemented) and [multiple apps support](http://benorama.github.com/grails-facebook-sdk/guide/configuration.html) added
* 2012-09-03 **V0.3.6** : latest RestFB 1.6.10 dependency, _proxyHost_ and _proxyPort_ added to config and _signedRequest_ added to filter _facebook_ map
* 2012-08-24 **V0.3.5** : _proxyHost_ and _proxyPort_ parameters added to Graph/Rest client (thanks to Eduard Martini)
* 2012-07-23 **V0.3.4** : bug fix in facebookAppService
* 2012-07-17 **V0.3.3** : readTimeout parameter added to Graph/Rest client + upgrade to Grails 2.1 with wrapper
* 2012-06-12 **V0.3.2** : bug fix in filter and plugin config
* 2012-06-12 **V0.3.1** : package _grails.plugins.facebooksdk_ renamed to _grails.plugin.facebooksdk_
* 2012-06-08 **V0.3.0** : new documentation based on GDoc, FacebookRestClient added + bug fixes


# Bugs

To report any bug, please use the project [Issues](http://github.com/benorama/grails-facebook-sdk/issues) section on GitHub.

# Beta status

This is a **beta release**.
The underlying APIs are generally stable, however we may make changes to the library in response to developer feedback.

# Feedback

The **Grails Facebook SDK** is not an official Facebook SDK such as [Javascript](http://developers.facebook.com/docs/reference/javascript/), [PHP](http://github.com/facebook/facebook-php-sdk), [iOS](http://github.com/facebook/facebook-ios-sdk/) and [Android SDKs](http://github.com/facebook/facebook-android-sdk).

It is developed by [AgoraPulse](http://www.agorapulse.com).

The **Grails Facebook SDK** is licensed under the [Apache Licence, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).