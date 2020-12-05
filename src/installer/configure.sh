#!/bin/sh


DIRNAME=`dirname $0`
CP=$DIRNAME/unicentaopos.jar
CP=$CP:$DIRNAME/locales/

java -cp $CP -splash:unicenta_splash_dark.png com.openbravo.pos.config.JFrmConfig
