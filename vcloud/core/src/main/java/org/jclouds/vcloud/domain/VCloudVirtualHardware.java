/**
 *
 * Copyright (C) 2010 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.jclouds.vcloud.domain;

import java.net.URI;

import org.jclouds.vcloud.domain.ovf.ResourceAllocation;
import org.jclouds.vcloud.domain.ovf.System;

/**
 * A description of the virtual hardware supported by a virtual machine.
 */
public class VCloudVirtualHardware extends VirtualHardware {
   protected final String type;
   protected final URI href;

   public VCloudVirtualHardware(String type, URI href, String info, System virtualSystem,
            Iterable<? extends ResourceAllocation> resourceAllocations) {
      super(info, virtualSystem, resourceAllocations);
      this.type = type;
      this.href = href;
   }

   public String getType() {
      return type;
   }

   public URI getHref() {
      return href;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((href == null) ? 0 : href.hashCode());
      result = prime * result + ((type == null) ? 0 : type.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      VCloudVirtualHardware other = (VCloudVirtualHardware) obj;
      if (href == null) {
         if (other.href != null)
            return false;
      } else if (!href.equals(other.href))
         return false;
      if (type == null) {
         if (other.type != null)
            return false;
      } else if (!type.equals(other.type))
         return false;
      return true;
   }

   @Override
   public String toString() {
      return "[href=" + getHref() + ", type=" + getType() + ", info=" + getInfo() + ", virtualSystem=" + getSystem()
               + "]";
   }
}