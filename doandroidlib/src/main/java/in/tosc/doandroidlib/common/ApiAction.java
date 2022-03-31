/**
 * The MIT License
 * 
 * Copyright (c) 2013-2016 Jeevanandam M. (myjeeva.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package in.tosc.doandroidlib.common;

import in.tosc.doandroidlib.objects.Account;
import in.tosc.doandroidlib.objects.Action;
import in.tosc.doandroidlib.objects.Actions;
import in.tosc.doandroidlib.objects.Backups;
import in.tosc.doandroidlib.objects.Delete;
import in.tosc.doandroidlib.objects.Domain;
import in.tosc.doandroidlib.objects.DomainRecord;
import in.tosc.doandroidlib.objects.DomainRecords;
import in.tosc.doandroidlib.objects.Domains;
import in.tosc.doandroidlib.objects.Droplet;
import in.tosc.doandroidlib.objects.Droplets;
import in.tosc.doandroidlib.objects.FloatingIP;
import in.tosc.doandroidlib.objects.FloatingIPs;
import in.tosc.doandroidlib.objects.Image;
import in.tosc.doandroidlib.objects.Images;
import in.tosc.doandroidlib.objects.Kernels;
import in.tosc.doandroidlib.objects.Key;
import in.tosc.doandroidlib.objects.Keys;
import in.tosc.doandroidlib.objects.Neighbors;
import in.tosc.doandroidlib.objects.Regions;
import in.tosc.doandroidlib.objects.Response;
import in.tosc.doandroidlib.objects.Sizes;
import in.tosc.doandroidlib.objects.Snapshots;
import in.tosc.doandroidlib.objects.Tag;
import in.tosc.doandroidlib.objects.Tags;
import in.tosc.doandroidlib.objects.Volume;
import in.tosc.doandroidlib.objects.Volumes;

/**
 * Enumeration of DigitalOcean RESTful resource information.
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.0
 */
public enum ApiAction {

  // Droplet
  AVAILABLE_DROPLETS("/droplets", "droplets", RequestMethod.GET, Droplets.class),
  AVAILABLE_DROPLETS_KERNELS("/droplets/%s/kernels", "kernels", RequestMethod.GET, Kernels.class),
  GET_DROPLET_SNAPSHOTS("/droplets/%s/snapshots", "snapshots", RequestMethod.GET, Snapshots.class),
  GET_DROPLET_BACKUPS("/droplets/%s/backups", "backups", RequestMethod.GET, Backups.class),
  GET_DROPLET_NEIGHBORS("/droplets/%s/neighbors", "droplets", RequestMethod.GET, Droplets.class),
  GET_DROPLET_INFO("/droplets/%s", "droplet", RequestMethod.GET, Droplet.class),  
  CREATE_DROPLET("/droplets", "droplet", RequestMethod.POST, Droplet.class),
  CREATE_DROPLETS("/droplets", "droplets", RequestMethod.POST, Droplets.class),
  DELETE_DROPLET("/droplets/%s", "response", RequestMethod.DELETE, Delete.class),
  REBOOT_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  POWER_CYCLE_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  SHUTDOWN_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  POWER_OFF_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  POWER_ON_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class), 
  RESET_DROPLET_PASSWORD("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  RESIZE_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  RESTORE_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  REBUILD_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  RENAME_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  CHANGE_DROPLET_KERNEL("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  ENABLE_DROPLET_IPV6("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  ENABLE_DROPLET_BACKUPS("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  DISABLE_DROPLET_BACKUPS("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  ENABLE_DROPLET_PRIVATE_NETWORKING("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  SNAPSHOT_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  

  // Account
  GET_ACCOUNT_INFO("/account", "account", RequestMethod.GET, Account.class),
  
  
  // Reports
  ALL_DROPLET_NEIGHBORS("/reports/droplet_neighbors", "neighbors", RequestMethod.GET, Neighbors.class),
  
  
  // Action
  AVAILABLE_ACTIONS("/actions", "actions", RequestMethod.GET, Actions.class),
  GET_ACTION_INFO("/actions/%s", "action", RequestMethod.GET, Action.class),
  GET_DROPLET_ACTIONS("/droplets/%s/actions", "actions", RequestMethod.GET, Actions.class),
  GET_IMAGE_ACTIONS("/images/%s/actions", "actions", RequestMethod.GET, Actions.class),
  GET_FLOATING_IP_ACTIONS("/floating_ips/%s/actions", "actions", RequestMethod.GET, Actions.class),
  GET_FLOATING_IP_ACTION_INFO("/floating_ips/%s/actions/%s", "action", RequestMethod.GET, Action.class),
  GET_VOLUME_ACTIONS("/volumes/%s/actions", "actions", RequestMethod.GET, Actions.class),
  GET_VOLUME_ACTION("/volumes/%s/actions/%s", "action", RequestMethod.GET, Action.class),
  
  
  // Image
  AVAILABLE_IMAGES("/images", "images", RequestMethod.GET, Images.class),  
  GET_IMAGE_INFO("/images/%s", "image", RequestMethod.GET, Image.class),  
  UPDATE_IMAGE_INFO("/images/%s", "image", RequestMethod.PUT, Image.class),
  DELETE_IMAGE("/images/%s", "response", RequestMethod.DELETE, Delete.class),
  TRANSFER_IMAGE("/images/%s/actions", "action", RequestMethod.POST, Action.class),
  CONVERT_IMAGE("/images/%s/actions", "action", RequestMethod.POST, Action.class),
  
  
  // Region
  AVAILABLE_REGIONS("/regions", "regions", RequestMethod.GET, Regions.class),
  
  
  // Size
  AVAILABLE_SIZES("/sizes", "sizes", RequestMethod.GET, Sizes.class),
  
  
  // Domain
  AVAILABLE_DOMAINS("/domains", "domains", RequestMethod.GET, Domains.class),
  GET_DOMAIN_INFO("/domains/%s", "domain", RequestMethod.GET, Domain.class),
  CREATE_DOMAIN("/domains", "domain", RequestMethod.POST, Domain.class),  
  DELETE_DOMAIN("/domains/%s", "response", RequestMethod.DELETE, Delete.class),
  
  
  // Domain Record
  GET_DOMAIN_RECORDS("/domains/%s/records", "domain_records", RequestMethod.GET, DomainRecords.class),
  GET_DOMAIN_RECORD_INFO("/domains/%s/records/%s", "domain_record", RequestMethod.GET, DomainRecord.class),
  CREATE_DOMAIN_RECORD("/domains/%s/records", "domain_record", RequestMethod.POST, DomainRecord.class),  
  UPDATE_DOMAIN_RECORD("/domains/%s/records/%s", "domain_record", RequestMethod.PUT, DomainRecord.class),
  DELETE_DOMAIN_RECORD("/domains/%s/records/%s", "response", RequestMethod.DELETE, Delete.class),
  
  
  // Key
  AVAILABLE_KEYS("/account/keys", "ssh_keys", RequestMethod.GET, Keys.class),
  GET_KEY_INFO("/account/keys/%s", "ssh_key", RequestMethod.GET, Key.class),
  CREATE_KEY("/account/keys", "ssh_key", RequestMethod.POST, Key.class),  
  UPDATE_KEY("/account/keys/%s", "ssh_key", RequestMethod.PUT, Key.class),
  DELETE_KEY("/account/keys/%s", "response", RequestMethod.DELETE, Delete.class),
  
  
  // Floating IP
  FLOATING_IPS("/floating_ips", "floating_ips", RequestMethod.GET, FloatingIPs.class),
  CREATE_FLOATING_IP("/floating_ips", "floating_ip", RequestMethod.POST, FloatingIP.class),
  GET_FLOATING_IP_INFO("/floating_ips/%s", "floating_ip", RequestMethod.GET, FloatingIP.class),
  DELETE_FLOATING_IP("/floating_ips/%s", "response", RequestMethod.DELETE, Delete.class),
  ASSIGN_FLOATING_IP("/floating_ips/%s/actions", "action", RequestMethod.POST, Action.class),
  UNASSIGN_FLOATING_IP("/floating_ips/%s/actions", "action", RequestMethod.POST, Action.class),
  
  
  // Tags
  AVAILABLE_TAGS("/tags", "tags", RequestMethod.GET, Tags.class),
  CREATE_TAG("/tags", "tag", RequestMethod.POST, Tag.class),
  GET_TAG("/tags/%s", "tag", RequestMethod.GET, Tag.class),
  UPDATE_TAG("/tags/%s", "tag", RequestMethod.PUT, Tag.class),
  DELETE_TAG("/tags/%s", "response", RequestMethod.DELETE, Delete.class),
  TAG_RESOURCE("/tags/%s/resources", "response", RequestMethod.POST, Response.class),
  UNTAG_RESOURCE("/tags/%s/resources", "response", RequestMethod.DELETE, Response.class),
   
  // Volumes
  AVAILABLE_VOLUMES("/volumes", "volumes", RequestMethod.GET, Volumes.class),
  CREATE_VOLUME("/volumes", "volume", RequestMethod.POST, Volume.class),
  GET_VOLUME_INFO("/volumes/%s", "volume", RequestMethod.GET, Volume.class),
  GET_VOLUME_INFO_BY_NAME("/volumes", "volumes", RequestMethod.GET, Volumes.class),
  DELETE_VOLUME("/volumes/%s", "response", RequestMethod.DELETE, Delete.class),
  DELETE_VOLUME_BY_NAME("/volumes", "response", RequestMethod.DELETE, Delete.class),
  ACTIONS_VOLUME("/volumes/%s/actions", "action", RequestMethod.POST, Action.class),
  ACTIONS_VOLUME_BY_NAME("/volumes/actions", "action", RequestMethod.POST, Action.class);
	
  private String path;

  private String elementName;
  
  private RequestMethod method;

  private Class<?> clazz;

  ApiAction(String path, RequestMethod method) {
    this(path, null, method);
  }

  ApiAction(String path, String elementName) {
    this(path, elementName, RequestMethod.GET);
  }

  ApiAction(String path, String elementName, RequestMethod method) {
    this(path, elementName, method, null);
  }
  
  ApiAction(String path, String elementName, RequestMethod method, Class<?> clazz) {
    this.path = path;
    this.elementName = elementName;
    this.method = method;
    this.clazz = clazz;
  }

  /**
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * @return the elementName
   */
  public String getElementName() {
    return elementName;
  }

  /**
   * @return the method
   */
  public RequestMethod getMethod() {
    return method;
  }

  /**
   * @return the clazz
   */
  public Class<?> getClazz() {
    return clazz;
  }
}
