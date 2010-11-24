/**
 * GlobalLBRegionPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBRegionPortType extends java.rmi.Remote {

    /**
     * Adds the specified region items to the specified region definitions.
     */
    public void add_region_item(iControl.GlobalLBRegionRegionDefinition[] regions, iControl.GlobalLBRegionRegionItem[][] items) throws java.rmi.RemoteException;

    /**
     * Creates the specified region definitions with the specified
     * region items.
     */
    public void create(iControl.GlobalLBRegionRegionDefinition[] regions, iControl.GlobalLBRegionRegionItem[][] items) throws java.rmi.RemoteException;

    /**
     * Deletes all region definitions.
     */
    public void delete_all_region_definitions() throws java.rmi.RemoteException;

    /**
     * Deletes the specified region definitions.
     */
    public void delete_region_definition(iControl.GlobalLBRegionRegionDefinition[] regions) throws java.rmi.RemoteException;

    /**
     * Gets a list of of region definitions.
     */
    public iControl.GlobalLBRegionRegionDefinition[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the list of region items that define the specified regions.
     */
    public iControl.GlobalLBRegionRegionItem[][] get_region_item(iControl.GlobalLBRegionRegionDefinition[] regions) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes any and all region items in the specified regions.
     */
    public void remove_all_region_items(iControl.GlobalLBRegionRegionDefinition[] regions) throws java.rmi.RemoteException;

    /**
     * Removes the specified region items from the specified region
     * definitions.
     */
    public void remove_region_item(iControl.GlobalLBRegionRegionDefinition[] regions, iControl.GlobalLBRegionRegionItem[][] items) throws java.rmi.RemoteException;
}
