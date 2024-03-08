/**
 * UserServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fullstack.service;

public interface UserServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getUserServiceImplAddress();

    public com.fullstack.service.UserServiceImpl getUserServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.fullstack.service.UserServiceImpl getUserServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
