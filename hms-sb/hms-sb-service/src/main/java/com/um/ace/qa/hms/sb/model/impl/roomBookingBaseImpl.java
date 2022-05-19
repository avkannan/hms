/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.um.ace.qa.hms.sb.model.impl;

import com.um.ace.qa.hms.sb.model.roomBooking;
import com.um.ace.qa.hms.sb.service.roomBookingLocalServiceUtil;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model base implementation for the roomBooking service. Represents a row in the &quot;hms_roomBooking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link roomBookingImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roomBookingImpl
 * @see roomBooking
 * @generated
 */
@ProviderType
public abstract class roomBookingBaseImpl
	extends roomBookingModelImpl implements roomBooking {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a room booking model instance should use the <code>roomBooking</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			roomBookingLocalServiceUtil.addroomBooking(this);
		}
		else {
			roomBookingLocalServiceUtil.updateroomBooking(this);
		}
	}

}