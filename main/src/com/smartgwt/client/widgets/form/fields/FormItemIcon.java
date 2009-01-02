/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.form.fields;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.logical.shared.HasHandlers;
   /**
    * Form item icon descriptor objects used by Form Items to specify the appearance and  behavior of icons displayed after the item in the page flow.

    */
public class FormItemIcon extends DataClass {

    public static FormItemIcon getOrCreateRef(JavaScriptObject jsObj) {
        return new FormItemIcon(jsObj);
    }


    public FormItemIcon(){
        
    }

    public FormItemIcon(JavaScriptObject jsObj){
        super(jsObj);
    }

    // ********************* Properties / Attributes ***********************

    /**
    * If set, this property determines this icon's image source.      If unset the form item's <code>defaultIconSrc</code> property will be used      instead.<br>      As with <code>defaultIconSrc</code> this URL will be modified by adding      "_Over" or "_Disabled" if appropriate to show the icons over or disabled state.
    *
    * @param src src Default value is null
    */
    public void setSrc(String src) {
        setAttribute("src", src);
    }
    /**
     * If set, this property determines this icon's image source.      If unset the form item's <code>defaultIconSrc</code> property will be used      instead.<br>      As with <code>defaultIconSrc</code> this URL will be modified by adding      "_Over" or "_Disabled" if appropriate to show the icons over or disabled state.
     *
     *
     * @return String
     *
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }

    /**
    * Should this icon's image switch to the appropriate "over" source when the user rolls  over or focuses on the icon?
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showOver showOver Default value is null
    */
    public void setShowOver(Boolean showOver) {
        setAttribute("showOver", showOver);
    }
    /**
     * Should this icon's image switch to the appropriate "over" source when the user rolls  over or focuses on the icon?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowOver()  {
        return getAttributeAsBoolean("showOver");
    }

    /**
    * Should this icon's image switch to the appropriate "focused" source when the user puts focus on the form item or icon?
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showFocused showFocused Default value is null
    */
    public void setShowFocused(Boolean showFocused) {
        setAttribute("showFocused", showFocused);
    }
    /**
     * Should this icon's image switch to the appropriate "focused" source when the user puts focus on the form item or icon?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowFocused()  {
        return getAttributeAsBoolean("showFocused");
    }

    /**
    * If this icon will be updated to show focus (see {@link com.smartgwt.client.widgets.form.fields.FormItemIcon#getShowFocused showFocused},  {@link com.smartgwt.client.widgets.form.fields.FormItem#getShowFocusedIcons showFocusedIcons}), this property governs whether the focused state should be shown when the item as a whole recieves focus or just if the icon recieves focus. If this property is unset, default behavior is to show focused state when the item recieves focus.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showFocusedWithItem showFocusedWithItem Default value is null
    */
    public void setShowFocusedWithItem(Boolean showFocusedWithItem) {
        setAttribute("showFocusedWithItem", showFocusedWithItem);
    }
    /**
     * If this icon will be updated to show focus (see {@link com.smartgwt.client.widgets.form.fields.FormItemIcon#getShowFocused showFocused},  {@link com.smartgwt.client.widgets.form.fields.FormItem#getShowFocusedIcons showFocusedIcons}), this property governs whether the focused state should be shown when the item as a whole recieves focus or just if the icon recieves focus. If this property is unset, default behavior is to show focused state when the item recieves focus.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowFocusedWithItem()  {
        return getAttributeAsBoolean("showFocusedWithItem");
    }

    /**
    * If <code>icon.neverDisable</code> is true, when this form item is disabled, the   icon will remain enabled.   Note that disabling the entire form will disable all items, together with their   icons including those marked as neverDisable - this property only has an effect   if the form is enabled and a specific item is disabled within it.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param neverDisable neverDisable Default value is null
    */
    public void setNeverDisable(Boolean neverDisable) {
        setAttribute("neverDisable", neverDisable);
    }
    /**
     * If <code>icon.neverDisable</code> is true, when this form item is disabled, the   icon will remain enabled.   Note that disabling the entire form will disable all items, together with their   icons including those marked as neverDisable - this property only has an effect   if the form is enabled and a specific item is disabled within it.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getNeverDisable()  {
        return getAttributeAsBoolean("neverDisable");
    }

    /**
    * If set, this property determines the width of this icon in px.      If unset the form item's <code>iconWidth</code> property will be used instead.
    *
    * @param width width Default value is null
    */
    public void setWidth(Integer width) {
        setAttribute("width", width);
    }
    /**
     * If set, this property determines the width of this icon in px.      If unset the form item's <code>iconWidth</code> property will be used instead.
     *
     *
     * @return Integer
     *
     */
    public Integer getWidth()  {
        return getAttributeAsInt("width");
    }

    /**
    * If set, this property determines the height of this icon in px.      If unset the form item's <code>iconHeight</code> property will be used instead.
    *
    * @param height height Default value is null
    */
    public void setHeight(Integer height) {
        setAttribute("height", height);
    }
    /**
     * If set, this property determines the height of this icon in px.      If unset the form item's <code>iconHeight</code> property will be used instead.
     *
     *
     * @return Integer
     *
     */
    public Integer getHeight()  {
        return getAttributeAsInt("height");
    }

    // ********************* Methods ***********************

        /**
         * StringMethod action to fire when this icon is clicked      If unset the form item's <code>iconClick</code> method will be fired instead (if      specified).
         * @param form The Dynamic Form to which this icon's item belongs.
     * @param item The Form Item containing this icon
     * @param icon A pointer to the form item icon clicked
         */
        public native void click(DynamicForm form, FormItem item, FormItemIcon icon) /*-{
            var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
            self.click(form.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), item.@com.smartgwt.client.core.DataClass::getJsObj()(), icon.@com.smartgwt.client.core.DataClass::getJsObj()());
        }-*/;

        /**
         * StringMethod action to fire when this icon has focus and recieves a keypress      event.      If unset the form item's <code>iconKeyPress</code> method will be fired instead       (if specified).
         * @param keyName Name of the key pressed
     * @param character character produced by the keypress
     * @param form The Dynamic Form to which this icon's item belongs.
     * @param item The Form Item containing this icon
     * @param icon A pointer to the form item icon
         */
        public native void keyPress(String keyName, char character, DynamicForm form, FormItem item, FormItemIcon icon) /*-{
            var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
            self.keyPress(keyName, character, form.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), item.@com.smartgwt.client.core.DataClass::getJsObj()(), icon.@com.smartgwt.client.core.DataClass::getJsObj()());
        }-*/;

    // ********************* Static Methods ***********************

}



