# Guice
This repository is to illustrate picking up of different classes by using google juice and different build command 

There are various situations when on local testing, we dont want to call db or cloud service to get urls, username or passwords. These can be stored locally in property files and can be used directly in the local build. Thus, saving developer's time. 

Custom GuiceInjector is used to dynamic load different classes at different times. Dynamic loading of different classes at different times can have more use cases.

For this repo build.xml is configured for local and standard build.

ant clean dist-local will pick all the files to be picked when the developer want to do test locally

ant clean will pick the files to be picked for standard use. 
