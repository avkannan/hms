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

package com.um.ace.qa.hms.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link room_newService}.
 *
 * @author Brian Wing Shun Chan
 * @see room_newService
 * @generated
 */
@ProviderType
public class room_newServiceWrapper
	implements room_newService, ServiceWrapper<room_newService> {

	public room_newServiceWrapper(room_newService room_newService) {
		_room_newService = room_newService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _room_newService.getOSGiServiceIdentifier();
	}

	@Override
	public room_newService getWrappedService() {
		return _room_newService;
	}

	@Override
	public void setWrappedService(room_newService room_newService) {
		_room_newService = room_newService;
	}

	private room_newService _room_newService;

}