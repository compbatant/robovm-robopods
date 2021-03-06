/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.mapbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLEmptyFeature/*</name>*/ 
    extends /*<extends>*/MGLShape/*</extends>*/ 
    /*<implements>*/implements MGLFeature/*</implements>*/ {

    /*<ptr>*/public static class MGLEmptyFeaturePtr extends Ptr<MGLEmptyFeature, MGLEmptyFeaturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLEmptyFeature.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLEmptyFeature() {}
    protected MGLEmptyFeature(Handle h, long handle) { super(h, handle); }
    protected MGLEmptyFeature(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native NSObject getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(NSObject v);
    @Property(selector = "attributes")
    public native NSDictionary<NSString, ?> getAttributes();
    @Property(selector = "setAttributes:")
    public native void setAttributes(NSDictionary<NSString, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "attributeForKey:")
    public native NSObject attributeForKey(String key);
    @Method(selector = "geoJSONDictionary")
    public native NSDictionary<NSString, ?> geoJSONDictionary();
    /*</methods>*/
}
