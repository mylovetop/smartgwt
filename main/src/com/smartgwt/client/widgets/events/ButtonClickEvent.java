/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.events;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.tools.*;
import com.smartgwt.client.bean.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.rte.*;
import com.smartgwt.client.widgets.rte.events.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

public class ButtonClickEvent extends BrowserEvent<ButtonClickHandler>  {

    /**
     * Handler type.
     */
    private static Type<ButtonClickHandler> TYPE;

    /**
     * Fires a open event on all registered handlers in the handler manager.If no
     * such handlers exist, this method will do nothing.
     *
     * @param <S> The event source
     * @param source the source of the handlers
     * @param jsObj the native event
     */
    public static <S extends HasButtonClickHandlers & HasHandlers> void fire(
        S source, JavaScriptObject jsObj) {
        if (TYPE != null) {
            ButtonClickEvent event = new ButtonClickEvent(jsObj);
            source.fireEvent(event);
        }
    }

    /**
     * Gets the type associated with this event.
     *
     * @return returns the handler type
     */
    public static Type<ButtonClickHandler> getType() {
        if (TYPE == null) {
            TYPE = new Type<ButtonClickHandler>();
        }
        return TYPE;
    }

    @Override
    protected void dispatch(ButtonClickHandler handler) {
        handler.onButtonClick(this);
    }

    // Because of type erasure, our static type is
    // wild carded, yet the "real" type should use our I param.

    @SuppressWarnings("unchecked")
    @Override
    public final Type<ButtonClickHandler> getAssociatedType() {
        return TYPE;
    }

    public ButtonClickEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }


	/**
     * button that was clicked
     *
     * @return button that was clicked
     */
    public native Button getButton() /*-{
        var self = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        var ret = self.button;
        return @com.smartgwt.client.widgets.Button::getByJSObject(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;

	/**
     * index of the button that was clicked
     *
     * @return index of the button that was clicked
     */
    public native int getIndex() /*-{
        var self = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        var ret = self.index;
        return ret;
    }-*/;

}
