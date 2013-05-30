package org.o2e.camel.security;

import org.o2e.mongo.pojo.ServiceSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: Jeff
 * Date: 9/30/11
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class DenyAllAuthorizer implements Authorizer {

    Logger log = LoggerFactory.getLogger(this.getClass());

    public boolean authorize(String user, ServiceSpecification serviceSpecification) {
        log.info("Denying request from user '" + user + "' for serviceSpecification '" + serviceSpecification + "' ");
        return false;
    }

}
