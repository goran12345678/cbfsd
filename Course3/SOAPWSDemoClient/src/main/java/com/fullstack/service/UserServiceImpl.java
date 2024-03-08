/**
 * UserServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fullstack.service;

public interface UserServiceImpl extends java.rmi.Remote {
    public com.fullstack.model.User[] getUsers() throws java.rmi.RemoteException;
    public com.fullstack.model.User getUser(long userId) throws java.rmi.RemoteException;
    public boolean registerUser(com.fullstack.model.User user) throws java.rmi.RemoteException;
    public boolean loginUser(com.fullstack.model.User user) throws java.rmi.RemoteException;
    public boolean deleteUser(long userId) throws java.rmi.RemoteException;
    public boolean updateUser(com.fullstack.model.User user) throws java.rmi.RemoteException;
}
