/*
 * Copyright 2009-2014 PrimeTek.
 *
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
 */
package org.primefaces.model.menu;

import java.util.List;

import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;


public class DefaultMenuModel extends org.primefaces.model.DefaultMenuModel implements MenuModel {

   private static final long serialVersionUID = 1L;
   
   public void addElement(MenuElement element) {
	   if(element instanceof Submenu) {
		   super.addSubmenu((Submenu) element);
	   } else if(element instanceof MenuItem) {
		   super.addMenuItem((MenuItem) element);
	   }
   }
   
   public List<MenuElement> getElements() {
	   throw new UnsupportedOperationException();
   }
   
   public void generateUniqueIds() {
	   throw new UnsupportedOperationException();
   }
}